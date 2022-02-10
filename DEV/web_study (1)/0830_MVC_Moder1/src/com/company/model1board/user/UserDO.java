package com.company.model1board.user;
/**
 * DO/DAO 패턴
 *  DO=> Data Object  또는 VO(Value Object) 또는 DTO(Data Transfer Object)
 *  
 *  [역할] 데이터베이스의 데이터(데이터의 행)를 객체화 하는 클래스이다.
 *   즉, 데이터를 하나의 객체로 관리할 목적으로 만들어 둔 클래스의 객체이다.
 *   DO 클래스에는 필드(프로퍼티, 중간저장소) 와 필드 하나당 getter/setter 메소드가
 *   한쌍으로 있어야 한다.
 * 
 *
 */


public class UserDO {
   //필드(프로퍼티, 중간저장소)
	private String id; // user아이디
	private String password; // userpassword
	private String name; // 이름
	private String role; // 직무
	
	
	
	
	public String getId() {return id;}
	public void setId(String id) {	this.id = id;}
	public String getPassword() {return password;}
	public void setPassword(String password) {this.password = password;}
	public String getName() {return name;}
	public void setName(String name) {this.name = name;}
	public String getRole() {return role;}
	public void setRole(String role) {this.role = role;}
	
	
	
	
	
	
	
}
