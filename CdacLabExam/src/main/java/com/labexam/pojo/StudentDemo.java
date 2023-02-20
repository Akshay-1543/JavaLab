package com.labexam.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="studentdata")
public class StudentDemo 
{
	  @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    @Column(name = "id")
	    private int id;

	    @Column(name = "roll_no")
	    private int rollNo;

	    @Column(name = "name")
	    private String name;

	    @Column(name = "address")
	    private String address;

	    @Column(name = "phone_no")
	    private String phoneNo;

	    @Column(name = "degree")
	    private String degree;

	
	public StudentDemo() {
		
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public int getRollNo() {
		return rollNo;
	}


	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public String getPhoneNo() {
		return phoneNo;
	}


	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}


	public String getDegree() {
		return degree;
	}


	public void setDegree(String degree) {
		this.degree = degree;
	}


	@Override
	public String toString() {
		return "StudentDemo [id=" + id + ", rollNo=" + rollNo + ", name=" + name + ", address=" + address + ", phoneNo="
				+ phoneNo + ", degree=" + degree + "]";
	}

	
}
