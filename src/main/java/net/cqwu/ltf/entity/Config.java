package net.cqwu.ltf.entity;

import java.util.Date;

public class Config {
	private int configid;
	private String adminname;
	private Date settime;
	private String stagename;
	public int getConfigid() {
		return configid;
	}
	public void setConfigid(int configid) {
		this.configid = configid;
	}
	public String getAdminname() {
		return adminname;
	}
	public void setAdminname(String adminname) {
		this.adminname = adminname;
	}
	public Date getSettime() {
		return settime;
	}
	public void setSettime(Date settime) {
		this.settime = settime;
	}
	public String getStagename() {
		return stagename;
	}
	public void setStagename(String stagename) {
		this.stagename = stagename;
	}
	
};
