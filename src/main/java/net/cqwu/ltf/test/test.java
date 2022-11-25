package net.cqwu.ltf.test;

import java.util.Date;

import org.junit.jupiter.api.Test;

import net.cqwu.ltf.dao.impl.StuDaoImpl;
import net.cqwu.ltf.entity.Stu;

public class test {
	@Test	
	public void testuadd() {
		Stu stu = new Stu();
		stu.setPassword("1234");
		stu.setRegip(null);
		stu.setRegtime(new Date().toString());
		stu.setUserid(0);
		stu.setUsername("小李");
		StuDaoImpl stuDaoImpl = new StuDaoImpl();
		stuDaoImpl.add(stu);
	}	
	
	
	
}
