package com.zhe.other.wheelTimer;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

public class HashedWheelTimeout implements Timeout{

    protected static final int ST_INIT = 0;
    protected static final int ST_CANCELLED = 1;
    protected static final int ST_EXPIRED = 2;

    private static final AtomicIntegerFieldUpdater<HashedWheelTimeout> STATE_UPDATER = AtomicIntegerFieldUpdater.newUpdater(HashedWheelTimeout.class, "state");

    protected final HashedWheelTimer timer;
    private final TimerTask task;
    protected final long deadline;

    private volatile int state = ST_INIT;

    /**
     * 剩余轮次
     */
    long remainingRounds;

    HashedWheelTimeout next;
    HashedWheelTimeout prev;

    /**
     * 放在那个bucket里
     */
    HashedWheelBucket bucket;

    HashedWheelTimeout(HashedWheelTimer timer, TimerTask task, long deadline) {
        this.timer = timer;
        this.task = task;
        this.deadline = deadline;
    }

    @Override
    public Timer timer() {
        return timer;
    }

    @Override
    public TimerTask task() {
        return task;
    }

    @Override
    public boolean isExpired() {
        return state() == ST_EXPIRED;
    }

    @Override
    public boolean isCancelled() {
        return state() == ST_CANCELLED;
    }

    @Override
    public boolean cancel() {
        if (!compareAndSetState(ST_INIT, ST_CANCELLED)) {
            return false;
        }
        timer.cancelledTimeouts.add(this);
        return true;
    }

    private boolean compareAndSetState(int expected, int state) {
        return STATE_UPDATER.compareAndSet(this, expected, state);
    }

    public int state() {
        return state;
    }

    public void expire() {
        if (!compareAndSetState(ST_INIT, ST_EXPIRED)) {
            return;
        }

        try {
            task.run(this);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    void remove() {
        HashedWheelBucket bucket = this.bucket;
        if (bucket != null) {
            bucket.remove(this);
        } else {
            timer.pendingTimeouts.decrementAndGet();
        }
    }

}
