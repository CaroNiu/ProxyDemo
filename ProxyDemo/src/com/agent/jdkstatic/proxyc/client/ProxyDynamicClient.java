package com.agent.jdkstatic.proxyc.client;

import com.agent.jdkstatic.impl.CountImpl;
import com.agent.jdkstatic.proxy.ProxyDynamic;

/**
 * 静态代理客户端
 * @author nuri
 *
 */
public class ProxyDynamicClient {
	/**
	 * 从静态代理中可以看出：
    	1.接口：代理类需要实现一个接口，这个接口和委托类的接口是一样的，这样proxy才能和委托类行为表现一致
    	2. 方法（Method）:由于接口限制，proxy类中也要有interface中的各个方法，这就造成了代码重复
	 * @param args
	 */

	public static void main(String[] args) {
		CountImpl countImpl = new CountImpl();
		ProxyDynamic dynamic = new ProxyDynamic(countImpl);
		dynamic.addCount();
		dynamic.queryCount();
	}
}
