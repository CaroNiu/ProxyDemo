package com.agent.jdkstatic.impl;
import com.agent.jdkstatic.inter.Count;

public class CountImpl implements Count {

	@Override
	public void queryCount() {
		System.out.println("委托类--查询账户方法");
	}

	@Override
	public void addCount() {
		System.out.println("委托类--修改账户方法");
	}

}
