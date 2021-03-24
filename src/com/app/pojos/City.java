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
@Table(name = "City")
public class City {
	public int cid;
	public String name;
	public String airportname;
	public int gatenum;
	public List<Flights> flist=new ArrayList<>();
	
	
	@Id
	@Column(name="cid",unique=true,nullable=false)
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	
	@Column(length=20)
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Column(length=30)
	public String getAirportName() {
		return airportname;
	}
	public void setAirportName(String airportname) {
		this.airportname = airportname;
	}
	
	@Column(length=10)
	public int getGateNum() {
		return gatenum;
	}
	public void setGateNum(int gatenum) {
		this.gatenum = gatenum;
	}
	
	public City(int cid, String name, String airportname, int gatenum) {
		this.cid = cid;
		this.name = name;
		this.airportname = airportname;
		this.gatenum = gatenum;
	}
	
	public City() {
		System.out.println("in city default const.");
	}
	
	@OneToMany(mappedBy="fid", cascade=CascadeType.ALL)
	public List<Flights> getFlist(){
		return flist;
	}
	public void setFlist(List<Flights> flist) {
		this.flist = flist;
	}
	
	public void addFlights(Flights f) {
		flist.add(f);
		//f.setFid(this);
	}

}
