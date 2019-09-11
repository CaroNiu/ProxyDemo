package com.agent.dynamic.client;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

import com.agent.dynamic.impl.SubjectImpl;
import com.agent.dynamic.inter.Subject;
import com.agent.dynamic.proxy.DynamicProxy;

/**
 * 动态代理客户端
 * @author nuri
 *
 */
public class DynamicClient {
	public static void main(String[] args) {
		SubjectImpl subjectImpl = new SubjectImpl();// 指定被代理类
		InvocationHandler dynamicProxy = new DynamicProxy(subjectImpl);
		Class<? extends SubjectImpl> cls = subjectImpl.getClass();
		Subject sub = (Subject) Proxy.newProxyInstance(cls.getClassLoader(), cls.getInterfaces(), dynamicProxy);
		sub.request();
	}
}
