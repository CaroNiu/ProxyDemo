package com.agent.jdkstatic.inter;
/**
 * 静态代理接口
 * @author nuri
 *
 */
public interface Count {
	/**
	 * 原代理接口
	 */
	public void queryCount();
	
	/**
	 * 修改账户方法
	 */
	public void addCount();
}
