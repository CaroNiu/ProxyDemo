package com.agent.cglibagent.proxy;

import java.lang.reflect.Method;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;


/**
 * cglib动态代理代理类
 * @author nuri
 *
 */
public class BookFacadeCglib implements MethodInterceptor{

	private Object target;
	
	/**
	 * 创建代理对象
	 * @param tar
	 * @return
	 */
	public Object getInstance(Object tar) {
		this.target = tar;
		System.err.println("获取代理对象");
		Enhancer enhancer = new Enhancer();
		enhancer.setSuperclass(this.target.getClass());
		enhancer.setCallback(this);
		Object create = enhancer.create();
		return create;
	}
	
	/**
	 * 执行方法
	 */
	@Override
	public Object intercept(Object obj, Method method, Object[] arg2, MethodProxy proxy) throws Throwable {
		System.out.println("执行方法开始。。。");
		System.out.println("intercept方法执行参数，obj"+obj.getClass().getName()+",arg2:"+arg2.toString()+",proxy:"+proxy.getSuperName().toString());
		proxy.invokeSuper(obj, arg2);
		System.out.println("回调执行结束。。。");
		return null;
	}

}
