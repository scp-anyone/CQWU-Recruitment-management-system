package net.cqwu.ltf.entity;

public class Grade {
	private int gradeid;
	private String testcardnum;
	private String ccode;
	private int score;
	private String note;
	private String status;
	public int getGradeid() {
		return gradeid;
	}
	public void setGradeid(int gradeid) {
		this.gradeid = gradeid;
	}
	public String getTestcardnum() {
		return testcardnum;
	}
	public void setTestcardnum(String testcardnum) {
		this.testcardnum = testcardnum;
	}
	public String getCcode() {
		return ccode;
	}
	public void setCcode(String ccode) {
		this.ccode = ccode;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public String getNote() {
		return note;
	}
	public void setNote(String note) {
		this.note = note;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
};
