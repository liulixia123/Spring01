package factory;

import pojo.User;
/**
 * ����user����̬����
 * @author lixia18
 *
 */
public class StaticUserFactory {
	public static User getUser(){
        return new User();
    }
}
