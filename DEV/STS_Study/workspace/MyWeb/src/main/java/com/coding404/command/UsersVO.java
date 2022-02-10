package com.coding404.command;

import java.sql.Timestamp;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UsersVO {

	
	private String id;
	private String pw;
	private String name;
	private String email1;
	private String email2;
	private String addrZipNum;
	private String addrBasic;
	private String addrDetail;
	private Timestamp regdate;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail1() {
		return email1;
	}
	public void setEmail1(String email1) {
		this.email1 = email1;
	}
	public String getEmail2() {
		return email2;
	}
	public void setEmail2(String email2) {
		this.email2 = email2;
	}
	public String getAddrZipNum() {
		return addrZipNum;
	}
	public void setAddrZipNum(String addrZipNum) {
		this.addrZipNum = addrZipNum;
	}
	public String getAddrBasic() {
		return addrBasic;
	}
	public void setAddrBasic(String addrBasic) {
		this.addrBasic = addrBasic;
	}
	public String getAddrDetail() {
		return addrDetail;
	}
	public void setAddrDetail(String addrDetail) {
		this.addrDetail = addrDetail;
	}
	public Timestamp getRegdate() {
		return regdate;
	}
	public void setRegdate(Timestamp regdate) {
		this.regdate = regdate;
	}
	@Override
	public String toString() {
		return "UsersVO [id=" + id + ", pw=" + pw + ", name=" + name + ", email1=" + email1 + ", email2=" + email2
				+ ", addrZipNum=" + addrZipNum + ", addrBasic=" + addrBasic + ", addrDetail=" + addrDetail
				+ ", regdate=" + regdate + "]";
	}
	public UsersVO() {
		// TODO Auto-generated constructor stub
	}
	public UsersVO(String id, String pw, String name, String email1, String email2, String addrZipNum, String addrBasic,
			String addrDetail, Timestamp regdate) {
		super();
		this.id = id;
		this.pw = pw;
		this.name = name;
		this.email1 = email1;
		this.email2 = email2;
		this.addrZipNum = addrZipNum;
		this.addrBasic = addrBasic;
		this.addrDetail = addrDetail;
		this.regdate = regdate;
	}
	
	
	
}
