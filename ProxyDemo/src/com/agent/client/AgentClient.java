package com.agent.client;

import com.agent.impl.SubjectImpl;
import com.agent.proxy.SubjectProxy;

/**
 * 客户端
 * @author nuri
 *
 */
public class AgentClient {
	public static void main(String[] args) {
		SubjectImpl subjectImpl = new SubjectImpl();
		SubjectProxy subjectProxy = new SubjectProxy(subjectImpl);
		subjectProxy.addSub();
	}
}
