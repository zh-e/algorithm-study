package com.zhe.design.strategy;

/**
 * @author zhangzhe
 */
public interface StrategyHandler<T, R> {

    @SuppressWarnings("rawtypes")
    StrategyHandler DEFAULT = t -> null;

    /**
     * 执行方法
     *
     * @param param 参数
     * @return 结果
     */
    R apply(T param);

}
