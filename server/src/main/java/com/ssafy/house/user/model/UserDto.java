package com.ssafy.house.user.model;

public class UserDto {
	
	private String id;
	private String pwd;
	private String name;
	private String address;
	private String phone;
	
	public UserDto() {
		super();
	}

	public UserDto(String id, String pwd, String name, String address, String phone) {
		super();
		this.id = id;
		this.pwd = pwd;
		this.name = name;
		this.address = address;
		this.phone = phone;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", pwd=" + pwd + ", name=" + name + ", address=" + address + ", phone=" + phone + "]";
	}
	
	
	
	
}
