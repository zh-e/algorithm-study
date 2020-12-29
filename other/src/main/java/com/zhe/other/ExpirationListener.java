package com.zhe.other;

/**
 * @author zhangzhe
 */
public interface ExpirationListener<E> {

	void expired(E expiredObject);

}
