package service;

import data.Data2String;

public class DataOut {
	Data2String ds;
    public void setDs(Data2String ds){
        this.ds=ds;
    }
    public void outout() {
    	System.out.println(ds.data2String());
    }
}
