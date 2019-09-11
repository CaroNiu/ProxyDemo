package com.agent.impl;

import com.agent.Subject;

public class SubjectImpl implements Subject{

	@Override
	public void addSub() {
		String a =  "原实现类SubjectImpl实现addSub方法";
		System.err.println(a);
	}

}
