package com.app.pojos;

import java.sql.Date;

import javax.persistence.*;

@Entity
@Table(name="Flights")
public class Flights {
	public int fid;
	public int airid;
	public String airline;
	public City source;
    public City destination;
    public String time;
    public int available_seat;
    public String model;
    public double cost;

public Flights()
{
	this.fid=00;
	this.airid=00;
	this.airline="unknown";
//	this.source=source;
//	this.destination="unknown";
	this.time="unknown";
	this.available_seat=00;
	this.model="unknown";
	this.cost=00;
	
}
public Flights(int Fid,int Aid,String plane,City sr,City dn,String time,int seat,String model,double cost)
{
	this.fid=Fid;
	this.airid=Aid;
	this.airline=plane;
	this.source=sr;
	this.destination=dn;
	this.time=time;
	this.model=model;
	this.cost=cost;
}
@Id
@Column(name = "fid",unique = true, nullable = false)
@GeneratedValue(strategy = GenerationType.IDENTITY)
public int getFid() {
	return fid;
}
public void setFid(int fid) {
	this.fid = fid;
}

public int getAirid() {
	return airid;
}
public void setAirid(int airid) {
	this.airid = airid;
}
@Column(length=20)
public String getAirline() {
	return airline;
}
public void setAirline(String airline) {
	this.airline = airline;
}
@ManyToOne
@JoinColumn(name = "source")
public City getSource() {
	return source;
}
public void setSource(City source) {
	this.source = source;
}
@ManyToOne
@JoinColumn(name = "destination")
public City getDestination() {
	return destination;
}
public void setDestination(City destination) {
	this.destination = destination;
}
@Column(length=10)
public String getTime() {
	return time;
}
public void setTime(String time) {
	this.time = time;
}
public int getAvailable_seat() {
	return available_seat;
}
public void setAvailable_seat(int available_seat) {
	this.available_seat = available_seat;
}
@Column(length=10)
public String getModel() {
	return model;
}
public void setModel(String model) {
	this.model = model;
}
public double getCost() {
	return cost;
}
public void setCost(double cost) {
	this.cost = cost;
}
	
	






}
