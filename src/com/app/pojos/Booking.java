package com.app.pojos;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="Booking")
public class Booking {
	public int bid;
	public String name;
	public int age;
	public String gender;
	public String date;
	public double amount;
	public Flights fid;
	public UserDetails uid;
	
	@Id
	@Column(name="bid",unique = true,nullable = false)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int getBid() {
		return bid;
	}
	public void setBid(int bid) {
		this.bid =bid;
	}
	
	@Column(length = 20)
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Column(length = 10)
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	@Column(length = 10)
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	@Column(length = 10)
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	
	@Column(length = 20)
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	
	public Booking(int bid, String name, int age, String gender, UserDetails uid,
			Flights fid, String date, double amount) {
		this.bid = bid;
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.uid = uid;
		this.fid = fid;
		this.date = date;
		this.amount = amount;
	}
	
	public Booking() {
		System.out.println("in booking default const.");
	}
	
	@ManyToOne
	@JoinColumn(name="uid")
	public UserDetails getUid() {
		return uid;
	}
	public void setUid(UserDetails id) {
		this.uid = id;
	}
	
	@ManyToOne
	@JoinColumn(name="fid")
	public Flights getFid() {
		return fid;
	}
	public void setFid(Flights fid) {
		this.fid = fid;
	}
	

}
