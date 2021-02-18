package com.zhe.design.strategy;

import java.util.Objects;

/**
 * @author zhangzhe
 */
public abstract class AbstractStrategyRouter<T, R> {

    private StrategyMapper<T, R> strategyMapper;

    /**
     * 初始化方法
     * 执行前必须调用此方法进行初始化
     * spring框架下可以使用@PostConstruct协助进行初始化
     */
    private void abstractInit() {
        strategyMapper = registerStrategyMapper();
        Objects.requireNonNull(strategyMapper, "StrategyMapper cannot bu null");
    }

    @SuppressWarnings("unchecked")
    private final StrategyHandler<T, R> defaultStrategyHandler = StrategyHandler.DEFAULT;

    public R applyStrategy(T param) {
        final StrategyHandler<T, R> strategyHandler = strategyMapper.get(param);
        if (strategyHandler != null) {
            return strategyHandler.apply(param);
        }
        return defaultStrategyHandler.apply(param);
    }

    protected abstract StrategyMapper<T, R> registerStrategyMapper();

}
