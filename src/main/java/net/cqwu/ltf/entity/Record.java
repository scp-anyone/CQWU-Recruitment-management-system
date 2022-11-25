package net.cqwu.ltf.entity;

import java.util.Date;

public class Record {
	private int  rid;
	private String logname;
	private String usergroup;
	private Date logtime;
	private String logip;
	public int getRid() {
		return rid;
	}
	public void setRid(int rid) {
		this.rid = rid;
	}
	public String getLogname() {
		return logname;
	}
	public void setLogname(String logname) {
		this.logname = logname;
	}
	public String getUsergroup() {
		return usergroup;
	}
	public void setUsergroup(String usergroup) {
		this.usergroup = usergroup;
	}
	public Date getLogtime() {
		return logtime;
	}
	public void setLogtime(Date logtime) {
		this.logtime = logtime;
	}
	public String getLogip() {
		return logip;
	}
	public void setLogip(String logip) {
		this.logip = logip;
	}
	
}
