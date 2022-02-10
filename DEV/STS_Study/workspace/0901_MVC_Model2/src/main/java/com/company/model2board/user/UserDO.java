package com.company.model2board.user;
/*
 * 개발자가클래스를 구현하면 자동으로 Object 클래스를 상속받는다.
 * 
 */
public class UserDO {
	
	
  private String id;
  private String password;
  private String name;
  private String role;
public String getId() {
	return id;
}
public void setId(String id) {
	this.id = id;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getRole() {
	return role;
}

public void setRole(String role) {
	this.role = role;
}

//toString() 메소드 추가
@Override
public String toString() {
	return "UserDO [id=" + id + ", password=" + password + ", name=" + name + ", role=" + role + "]";
}



}



