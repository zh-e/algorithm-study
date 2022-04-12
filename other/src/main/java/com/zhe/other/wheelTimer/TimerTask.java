package com.zhe.other.wheelTimer;

public interface TimerTask {

    /**
     * 在指定延迟后执行
     * @param timeout 延迟参数
     * @throws Exception 异常
     */
    void run(Timeout timeout) throws Exception;

}
