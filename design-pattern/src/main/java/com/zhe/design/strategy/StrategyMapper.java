package com.zhe.design.strategy;

/**
 * @author zhangzhe
 */
public interface StrategyMapper<T, R> {

    StrategyHandler<T, R> get(T param);

}
