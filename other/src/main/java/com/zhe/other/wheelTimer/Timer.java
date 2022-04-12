package com.zhe.other.wheelTimer;

import java.util.Set;
import java.util.concurrent.TimeUnit;

public interface Timer {

    /**
     * 新建
     *
     * @param task  任务
     * @param delay 延时时间
     * @param unit  延时单位
     * @return timeout
     */
    Timeout newTimeout(TimerTask task, long delay, TimeUnit unit);

    /**
     * 停止所有未执行
     *
     * @return 停止的列表
     */
    Set<Timeout> stop();

}
