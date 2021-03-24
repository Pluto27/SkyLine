package com.app.pojos;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table (name="UserDetails")
public class UserDetails {
	public int userid;
	public String name;
	public String emailid;
    public String password;
    public int mobilenum;
    //ArrayList<Flights> f = new ArrayList<>();
    public List<Booking> blist = new ArrayList<>();
    
 public UserDetails() 
 {
	 this.userid=00;
	 this.name="unknown";
	 this.emailid="unknown";
	 this.password="unknown";
	 this.mobilenum=00;
 }
 public UserDetails(int id, String name, String mail,String pw,int mobno)
 {
	 this.userid=id;
	 this.name=name;
	 this.emailid=mail;
	 this.password=pw;
	 this.mobilenum=mobno;
	 
	 
 }
 @Id
 @Column(name = "userid",unique = true, nullable = false)
 @GeneratedValue(strategy = GenerationType.IDENTITY)
public int getUserid() {
	return userid;
}
public void setUserid(int userid) {
	this.userid = userid;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getEmailid() {
	return emailid;
}
public void setEmailid(String emailid) {
	this.emailid = emailid;
}
@Column(length=20)
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
@Column(length=25)
public int getMobilenum() {
	return mobilenum;
}

public void setMobilenum(int mobilenum) {
	this.mobilenum = mobilenum;
}
@OneToMany(mappedBy="uid",cascade=CascadeType.ALL)
public List<Booking> getBlist() {
	return blist;
}
public void setBlist(List<Booking> blist) {
	this.blist = blist;
}



 
}
