package com.agent.cglibagent.client;

import com.agent.cglibagent.implwithoutinter.BookFacadeImpl1;
import com.agent.cglibagent.proxy.BookFacadeCglib;

/**
 * cglib动态代理实现类
 * @author nuri
 *
 */
public class CglibAgentClient {
	public static void main(String[] args) {
		BookFacadeCglib bookFacadeCglib = new BookFacadeCglib();
		BookFacadeImpl1 instance = (BookFacadeImpl1) bookFacadeCglib.getInstance(new BookFacadeImpl1());
		instance.addBook();
//		instance.delBook();
	}
}
