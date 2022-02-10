package com.coding404.command;

import java.sql.Timestamp;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data 
//게터세터투스트링 생성해줌
@AllArgsConstructor //멤버변수를 받는 생성자
@NoArgsConstructor//기본생성자
public class FreeBoardVO {
	public FreeBoardVO() {
		// TODO Auto-generated constructor stub
	}
	
	
	public FreeBoardVO(int bno, String title, String writer, String content, Timestamp regdate, Timestamp updatedate) {
		super();
		this.bno = bno;
		this.title = title;
		this.writer = writer;
		this.content = content;
		this.regdate = regdate;
		this.updatedate = updatedate;
	}


	@Override
	public String toString() {
		return "FreeBoardVO [bno=" + bno + ", title=" + title + ", writer=" + writer + ", content=" + content
				+ ", regdate=" + regdate + ", updatedate=" + updatedate + "]";
	}
	public int getBno() {
		return bno;
	}
	public void setBno(int bno) {
		this.bno = bno;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Timestamp getRegdate() {
		return regdate;
	}
	public void setRegdate(Timestamp regdate) {
		this.regdate = regdate;
	}
	public Timestamp getUpdatedate() {
		return updatedate;
	}
	public void setUpdatedate(Timestamp updatedate) {
		this.updatedate = updatedate;
	}
	private int bno;
	private String title;
	private String writer;
	private String content;
	private Timestamp regdate;
	private Timestamp updatedate;
 
	

}


