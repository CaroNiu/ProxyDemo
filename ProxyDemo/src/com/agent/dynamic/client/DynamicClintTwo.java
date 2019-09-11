package com.agent.dynamic.client;

import com.agent.dynamic.impl.BookFacadeImpl;
import com.agent.dynamic.inter.BookFacade;
import com.agent.dynamic.proxy.BookFacadeProxy;
/**
 * 1.对于JDK动态代理，需要一个interface，这个是一个缺陷
 * 2.Proxy，Proxy 类是动态产生的，这个类在调用Proxy.newProxyInstance(targetCls.getClassLoader, targetCls.getInterface,InvocationHander)之后，会产生一个Proxy类的实例
 * 3.Method:对于业务委托类的每个方法，现在Proxy类里面都不用静态显示出来
 * 4.InvocationHandler: 这个类在业务委托类执行时，会先调用invoke方法。invoke方法再执行相应的代理操作，可以实现对业务方法的再包装
 * 5.JDK的动态代理机制只能代理实现了接口的类，而不能实现接口的类就不能实现JDK的动态代理
 * @author nuri
 *
 */
public class DynamicClintTwo {
	public static void main(String[] args) {
		// 获取代理类对象
		BookFacadeProxy bookFacadeProxy = new BookFacadeProxy();
		// 获取被代理类的代理实例
		BookFacade bookFacade = (BookFacade) bookFacadeProxy.bine(new BookFacadeImpl());
		bookFacade.addBook();
		bookFacade.deleteBook();
	}
}
