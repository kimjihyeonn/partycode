package com.company.Spring_Annotation_Board.user;

public class UserDO {
	//필드(프로퍼티)
	private String id;
	private String password;
	private String pwencrypt;
	private String name;
	private String role;
	public String getPwencrypt() {
		return pwencrypt;
	}
	public void setPwencrypt(String pwencrypt) {
		this.pwencrypt = pwencrypt;
	}
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
	//toString() 메소드는 Object 클래스로부터 상속받은 메소드이다.
	@Override
	public String toString() {
		return "UserDO [id=" + id + ",pwencrypt=" +pwencrypt + ", password=" + password + ", name=" + name + ", role=" + role + "]";
	}

}
