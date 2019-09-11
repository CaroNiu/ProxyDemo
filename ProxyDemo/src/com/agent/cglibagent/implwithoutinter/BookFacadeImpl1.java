package com.agent.cglibagent.implwithoutinter;
/**
 * 这个实现类未集成接口
 * @author nuri
 *
 */
public class BookFacadeImpl1 {
	public void addBook() {
		System.out.println("实现类--添加图书方法。。。");
	}
	
	public void delBook() {
		System.err.println("实现类--删除方法。。。");
	}
}
