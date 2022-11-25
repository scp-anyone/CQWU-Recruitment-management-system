package net.cqwu.ltf.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;


import net.cqwu.ltf.dao.StuDao;
import net.cqwu.ltf.db.ConnectionFactory;
import net.cqwu.ltf.entity.Stu;

public class StuDaoImpl implements StuDao{

	public int add(Stu stu) {
			    int rows = 0;
			    Connection con = ConnectionFactory.getConnection("mysqlDataSource");
			    PreparedStatement pre = null;
			    try {
			        String sql = "insert into stu(username,password,regip,regtime) values(?,?,?,NOW())";
		        pre = (PreparedStatement) con.prepareStatement(sql);
		        pre.setString(1, stu.getUsername());
		        pre.setString(2, stu.getPassword());
		        pre.setString(3, stu.getRegip());
		        rows = pre.executeUpdate();
		    } catch (SQLException e) {
		        e.printStackTrace();
		    } finally {
		        try{
		            if (pre!=null)
		                pre.close();
		            if (con != null)
		                con.close();
		        }catch (SQLException e) {
		            e.printStackTrace();
		        }
		    }
		    return rows;
		}

	@Override
	public Stu findByUsername(String username) {
	    Connection con = ConnectionFactory.getConnection("mysqlDataSource");
	    PreparedStatement pre = null;
	    try {
	        String sql = "select from stu where username =?";
        pre = (PreparedStatement) con.prepareStatement(sql);
        pre.setString(1,username);
        ResultSet= pre.execute();
		return stu;
	}

	@Override
	public Stu validateLogin(String username, String password) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int passModify(String username, String newpass) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public ArrayList<Stu> findStusLikeUsername(String username) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<Stu> findStusLikeIdcode(String idcode) {
		// TODO Auto-generated method stub
		return null;
	}

}
