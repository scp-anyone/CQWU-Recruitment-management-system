package net.cqwu.ltf.entity;

import java.util.Date;

public class Stage {
	private int stagenum;
	private String stagename;
	private Date starttime;
	private Date endtime;
	private String note;
	public int getStagenum() {
		return stagenum;
	}
	public void setStagenum(int stagenum) {
		this.stagenum = stagenum;
	}
	public String getStagename() {
		return stagename;
	}
	public void setStagename(String stagename) {
		this.stagename = stagename;
	}
	public Date getStarttime() {
		return starttime;
	}
	public void setStarttime(Date starttime) {
		this.starttime = starttime;
	}
	public Date getEndtime() {
		return endtime;
	}
	public void setEndtime(Date endtime) {
		this.endtime = endtime;
	}
	public String getNote() {
		return note;
	}
	public void setNote(String note) {
		this.note = note;
	}
	
}
