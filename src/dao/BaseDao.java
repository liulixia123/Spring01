package dao;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

public class BaseDao extends JdbcDaoSupport{
    @Autowired
    public void setDataSource1(DataSource dataSource){
        super.setDataSource(dataSource);  //此方法讲数据源交给JdbcDaoSupport
    }
}
