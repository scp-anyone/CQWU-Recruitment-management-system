package net.cqwu.ltf.entity;

import java.util.Date;

public class Course {
	private int Ccode;
	private String	cname;
	private String	cmname;
	private Date cstarttime;
	private Date cendtime;
	public int getCcode() {
		return Ccode;
	}
	public void setCcode(int ccode) {
		Ccode = ccode;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getCmname() {
		return cmname;
	}
	public void setCmname(String cmname) {
		this.cmname = cmname;
	}
	public Date getCstarttime() {
		return cstarttime;
	}
	public void setCstarttime(Date cstarttime) {
		this.cstarttime = cstarttime;
	}
	public Date getCendtime() {
		return cendtime;
	}
	public void setCendtime(Date cendtime) {
		this.cendtime = cendtime;
	}
	
}
