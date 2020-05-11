
package com.abc.model;

public class MemberVO { //데이터 저장빈 클래스
	
	private String id;
	private String name;
	private String phone;
	private String email;
	
	//기본 생성자 샐략 ->컴파일러가 묵시적제공
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

}
