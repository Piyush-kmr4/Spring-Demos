package com.example.springMVCdemo.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import jdk.nashorn.internal.objects.annotations.Constructor;

@Entity
public class Alien {
	@Id
	private int aid;
	private String aname;
	
	public Alien() {
		System.out.println("Inside Default Constructor....");
		// TODO Auto-generated constructor stub
	}
	public Alien(int aid, String aname) {
		super();	
		this.aid = aid;
		this.aname = aname;
	}
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	public String getAname() {
		return aname;
	}
	public void setAname(String aname) {
		this.aname = aname;
	}
	@Override
	public String toString() {
		return "Alien [aid=" + aid + ", aname=" + aname + "]";
	}
	
	

}
