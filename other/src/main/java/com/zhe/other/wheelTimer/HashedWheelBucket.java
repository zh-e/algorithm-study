package com.zhe.other.wheelTimer;

import java.util.Set;

public class HashedWheelBucket {

    private HashedWheelTimeout head;

    private HashedWheelTimeout tail;

    protected void addTimeout(HashedWheelTimeout timeout) {
        assert timeout.bucket == null;
        timeout.bucket = this;

        if (head == null) {
            head = tail = timeout;
        } else {
            tail.next = timeout;
            timeout.prev = tail;
            tail = timeout;
        }
    }

    public void expireTimeouts(long deadline) {
        HashedWheelTimeout timeout = head;
        while (timeout != null) {
            HashedWheelTimeout next = timeout.next;

            if (timeout.remainingRounds <= 0) {
                next = remove(timeout);
                if (timeout.deadline <= deadline) {
                    timeout.expire();
                } else {
                    throw new IllegalStateException(String.format("timeout.deadline (%d) > deadline (%d)", timeout.deadline, deadline));
                }
            }else if (timeout.isCancelled()) {
                next = remove(timeout);
            } else {
                timeout.remainingRounds --;
            }
            timeout = next;
        }
    }

    public HashedWheelTimeout remove(HashedWheelTimeout timeout) {
        HashedWheelTimeout next = timeout.next;

        if (timeout.prev != null) {
            timeout.prev.next = next;
        }

        if (timeout.next != null) {
            timeout.next.prev = timeout.prev;
        }

        if (timeout == head) {
            if (timeout == tail) {
                tail = null;
                head = null;
            } else {
                head = next;
            }
        } else if (timeout == tail) {
            tail = timeout.prev;
        }

        timeout.prev = null;
        timeout.next = null;
        timeout.bucket = null;
        timeout.timer.pendingTimeouts.decrementAndGet();
        return next;
    }

    public void clearTimeouts(Set<Timeout> set) {
        for(;;) {
            HashedWheelTimeout timeout = pollTimeout();
            if (timeout == null) {
                return;
            }
            if (timeout.isExpired() || timeout.isCancelled()) {
                continue;
            }
            set.add(timeout);
        }
    }

    private HashedWheelTimeout pollTimeout() {
        HashedWheelTimeout head = this.head;
        if (head == null) {
            return null;
        }

        HashedWheelTimeout next = head.next;
        if (next == null) {
            tail = this.head = null;
        } else {
            this.head = next;
            next.prev = null;
        }

        head.next = null;
        head.prev = null;
        head.bucket = null;
        return head;
    }

}
