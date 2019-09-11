package com.agent.dynamic.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

import com.agent.dynamic.impl.SubjectImpl;


/**
 * 动态代理类
 * @author nuri
 *
 */
public class DynamicProxy implements InvocationHandler{
	
	private Object sub;

	public DynamicProxy() {}
	
	
	public DynamicProxy(Object obj) {
		this.sub = obj;
	}
	
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		System.out.println("before calling :"+method);
		method.invoke(sub, args);
		System.out.println("after calling :"+method);
		return null;
	}

}
