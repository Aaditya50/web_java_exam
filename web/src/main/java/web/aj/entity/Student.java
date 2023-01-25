package web.aj.entity;


import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class Student implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	private int rollNo;
	private String name;
	private String address;
	private String phoneno;
	private String degree;
	
	public Student() {
		
	}
	
	public Student(int rollNo) {
		super();
		this.rollNo = rollNo;
	}
	public Student(int rollNo, String name, String address, String phoneno, String degree) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.address = address;
		this.phoneno = phoneno;
		this.degree = degree;
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
	public String getPhoneno() {
		return phoneno;
	}
	public void setPhoneno(String phoneno) {
		this.phoneno = phoneno;
	}
	public String getDegree() {
		return degree;
	}
	public void setDegree(String degree) {
		this.degree = degree;
	}
	
	
}
