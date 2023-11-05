package com.example.demo.dto;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Customer_Table")
public class Customer {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "custid")
	private Integer cId;
	@Column(name = "custname")
	private String cname;
	@Column(name = "custemail")
	private String cemail;
	@Column(name = "custpassword")
	private Integer cpass;
	@Column(name = "custusername")
	private String cuname;
	
	public Customer() {
	System.out.println("No arg constructor");
	}

	public Customer(Integer cId, String cname, String cemail, Integer cpass, String cuname) {
		super();
		this.cId = cId;
		this.cname = cname;
		this.cemail = cemail;
		this.cpass = cpass;
		this.cuname = cuname;
	}

	public Integer getcId() {
		return cId;
	}

	public void setcId(Integer cId) {
		this.cId = cId;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public String getCemail() {
		return cemail;
	}

	public void setCemail(String cemail) {
		this.cemail = cemail;
	}

	public Integer getCpass() {
		return cpass;
	}

	public void setCpass(Integer cpass) {
		this.cpass = cpass;
	}

	public String getCuname() {
		return cuname;
	}

	public void setCuname(String cuname) {
		this.cuname = cuname;
	}

	@Override
	public String toString() {
		return "Customer [cId=" + cId + ", cname=" + cname + ", cemail=" + cemail + ", cpass=" + cpass + ", cuname="
				+ cuname + "]";
	}
	
	
	
	

}
