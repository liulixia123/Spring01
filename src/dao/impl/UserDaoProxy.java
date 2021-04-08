package dao.impl;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

import dao.UserDao;

public class UserDaoProxy implements InvocationHandler {
	//Ŀ�����
    private UserDao target;
	public UserDaoProxy(UserDao target) {
		super();
		this.target = target;
	}
	
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		System.out.println("��ʼ");
        proxy = method.invoke(target,args);
        System.out.println("����");
        return proxy;
	}

}
