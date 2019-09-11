package com.agent.proxy;
/**
 * 代理实现类
 */
import com.agent.Subject;
import com.agent.impl.SubjectImpl;

public class SubjectProxy implements Subject {

	/**
	 * 引入代理实现类
	 */
	private SubjectImpl subjectImpl;
	
	/**
	 * 构造方法
	 * 引入被代理类实现
	 * @param target
	 */
	public SubjectProxy(SubjectImpl target) {
		subjectImpl = target;
	}
	
	/**
	 * 实现原被代理接口方法
	 */
	@Override
	public void addSub() {
		System.err.println("代理类before method....");
		subjectImpl.addSub();
		System.err.println("代理类after method....");
	}

}
