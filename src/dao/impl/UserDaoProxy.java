package dao.impl;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

import dao.UserDao;

public class UserDaoProxy implements InvocationHandler {
	//目标对象
    private UserDao target;
	public UserDaoProxy(UserDao target) {
		super();
		this.target = target;
	}
	
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		System.out.println("开始");
        proxy = method.invoke(target,args);
        System.out.println("结束");
        return proxy;
	}

}
