package pojo;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class User{
    private int id;
    private String username;
    private String[] arrayData;
    private List listData;
    private Set setData;
    private Map mapData;
    private Properties pros;
    public String[] getArrayData() {
		return arrayData;
	}
	public void setArrayData(String[] arrayData) {
		this.arrayData = arrayData;
	}
	public List getListData() {
		return listData;
	}
	public void setListData(List listData) {
		this.listData = listData;
	}
	public Set getSetData() {
		return setData;
	}
	public void setSetData(Set setData) {
		this.setData = setData;
	}
	public Map getMapData() {
		return mapData;
	}
	public void setMapData(Map mapData) {
		this.mapData = mapData;
	}
	public Properties getPros() {
		return pros;
	}
	public void setPros(Properties pros) {
		this.pros = pros;
	}
	public User() {
    	
    }
    public User(int id ,String username) {
    	super();
    	this.id = id;
    	this.username = username;
    }
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public void init(){
	    System.out.println("初始化操作");
	}
	public void destory(){
	    System.out.println("销毁");
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", arrayData=" + Arrays.toString(arrayData) + ", listData="
				+ listData + ", setData=" + setData + ", mapData=" + mapData + ", pros=" + pros + "]";
	}
	
}
