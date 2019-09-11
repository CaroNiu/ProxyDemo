package com.agent.jdkstatic.proxy;
/**
 * 静态代理类
 * @author nuri
 */

import com.agent.jdkstatic.impl.CountImpl;
import com.agent.jdkstatic.inter.Count;

public class ProxyDynamic implements Count{
	/**
	 * 委托类
	 */
	private CountImpl countImpl;
	
	public ProxyDynamic(CountImpl target) {
		this.countImpl = target;
	}
	
	@Override
	public void queryCount() {
		System.err.println("代理类--实现queryCount方法--开始调用委托类实现方法");
		// 调用委托类方法
		countImpl.queryCount();
		System.err.println("代理类--实现queryCount方法--结束调用委托类实现方法");
	}

	@Override
	public void addCount() {
		System.err.println("代理类--实现addCount方法--开始调用委托类实现方法");
		// 调用委托类方法
		countImpl.addCount();
		System.err.println("代理类--实现addCount方法--结束调用委托类实现方法");
	}
}
