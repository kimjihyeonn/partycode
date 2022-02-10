package com.company.model1board.user;
/**
 * DO/DAO ����
 *  DO=> Data Object  �Ǵ� VO(Value Object) �Ǵ� DTO(Data Transfer Object)
 *  
 *  [����] �����ͺ��̽��� ������(�������� ��)�� ��üȭ �ϴ� Ŭ�����̴�.
 *   ��, �����͸� �ϳ��� ��ü�� ������ �������� ����� �� Ŭ������ ��ü�̴�.
 *   DO Ŭ�������� �ʵ�(������Ƽ, �߰������) �� �ʵ� �ϳ��� getter/setter �޼ҵ尡
 *   �ѽ����� �־�� �Ѵ�.
 * 
 *
 */


public class UserDO {
   //�ʵ�(������Ƽ, �߰������)
	private String id; // user���̵�
	private String password; // userpassword
	private String name; // �̸�
	private String role; // ����
	
	
	
	
	public String getId() {return id;}
	public void setId(String id) {	this.id = id;}
	public String getPassword() {return password;}
	public void setPassword(String password) {this.password = password;}
	public String getName() {return name;}
	public void setName(String name) {this.name = name;}
	public String getRole() {return role;}
	public void setRole(String role) {this.role = role;}
	
	
	
	
	
	
	
}
