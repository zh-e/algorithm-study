package com.zhe.sort;

/**
 * @author zhangzhe
 */
public interface ExpirationListener<E> {

	void expired(E expiredObject);

}
