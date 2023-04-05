package com.zhe.other.wheelTimer;

public interface Timeout {

    /**
     * 创建任务的时间
     *
     * @return timer
     */
    Timer timer();

    /**
     * 需要执行的任务
     *
     * @return task
     */
    TimerTask task();

    /**
     * 当前任务是否已过期
     *
     * @return true 为过期
     */
    boolean isExpired();

    /**
     * 当前任务是不是取消状态
     *
     * @return true为取消
     */
    boolean isCancelled();

    /**
     * 取消对应要执行的TimerTask
     *
     * @return 取消成功为true
     */
    boolean cancel();

}
