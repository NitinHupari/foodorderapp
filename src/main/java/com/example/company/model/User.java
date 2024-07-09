package com.example.company.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class User {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
int userid;
String username;
String useremail;
String mobile;
int password;


public int getPassword() {
	return password;
}
public void setPassword(int password) {
	this.password = password;
}
public int getUserid() {
	return userid;
}
public void setUserid(int userid) {
	this.userid = userid;
}
public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}
public String getUseremail() {
	return useremail;
}
public void setUseremail(String useremail) {
	this.useremail = useremail;
}
public String getMobile() {
	return mobile;
}
public void setMobile(String mobile) {
	this.mobile = mobile;
}
@Override
public String toString() {
	return "User [userid=" + userid + ", username=" + username + ", useremail=" + useremail + ", mobile=" + mobile
			+ ", password=" + password + "]";
}

public User() {

}
public User(int userid, String username, String useremail, String mobile, int password) {
	super();
	this.userid = userid;
	this.username = username;
	this.useremail = useremail;
	this.mobile = mobile;
	this.password = password;
}
}
