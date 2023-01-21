package com.revature.model;

public class User {
	private String Fname;
	private String Lname;
	private String Email;
	private String phoneNo;
	private String address;
	private String dob;
	private String idProof;
	private String loginId;
	private String password;
	
	
	
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public User(String fname, String lname, String email, String phoneNo, String address, String dob, String idProof,
			String loginId, String password) {
		super();
		Fname = fname;
		Lname = lname;
		Email = email;
		this.phoneNo = phoneNo;
		this.address = address;
		this.dob = dob;
		this.idProof = idProof;
		this.loginId = loginId;
		this.password = password;
	}


	public String getFname() {
		return Fname;
	}
	public void setFname(String fname) {
		Fname = fname;
	}
	public String getLname() {
		return Lname;
	}
	public void setLname(String lname) {
		Lname = lname;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getIdProof() {
		return idProof;
	}
	public void setIdProof(String idProof) {
		this.idProof = idProof;
	}
	public String getLoginId() {
		return loginId;
	}
	public void setLoginId(String loginId) {
		this.loginId = loginId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	@Override
	public String toString() {
		return "User [Fname=" + Fname + ", Lname=" + Lname + ", Email=" + Email + ", phoneNo=" + phoneNo + ", address="
				+ address + ", dob=" + dob + ", idProof=" + idProof + ", loginId=" + loginId + ", password=" + password
				+ "]";
	}
	
	
	
	
}