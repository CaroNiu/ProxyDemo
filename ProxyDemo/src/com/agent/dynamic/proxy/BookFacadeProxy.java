package com.agent.dynamic.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class BookFacadeProxy implements InvocationHandler{

	private Object target;
	
	/**
	 * 取得代理对象
	 * @param obj
	 * @return
	 */
	public Object bine(Object obj) {
		this.target = obj;
		Object newProxyInstance = Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(),
						this);
		return newProxyInstance;
	}
	
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		Object result = null;
		System.out.println("Proxy start ...");
		System.err.println("method name:"+method.getName());
		result = method.invoke(target, args);
		System.out.println("Proxy end..");
		return result;
	}

}
