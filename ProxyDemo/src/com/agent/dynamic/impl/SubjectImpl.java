package com.agent.dynamic.impl;
/**
 * 具体委托类
 */
import com.agent.dynamic.inter.Subject;

public class SubjectImpl implements Subject {

	
	public SubjectImpl() {
		
	}
	
	@Override
	public void request() {
		System.out.println("From SubjectImpl...");
	}

}
