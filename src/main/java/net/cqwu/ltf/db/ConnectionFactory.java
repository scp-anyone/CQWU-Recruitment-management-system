package net.cqwu.ltf.db;

import java.sql.Connection;
import java.sql.SQLException;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;


public class ConnectionFactory {
//	getConnection()方法
	public static Connection getConnection(String JNDIname) {
		try {
			Context initCtx = new InitialContext();
			Context envCtx = (Context) initCtx.lookup("java:comp/env");
			DataSource ds = (DataSource) envCtx.lookup(JNDIname);
			return (Connection) ds.getConnection();
		} catch (NamingException e1) {
			System.out.print("数据库未启动或连接池未配置！");
			return null;
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
	}
}







