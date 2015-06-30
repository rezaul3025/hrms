package com.hrms.app.core.domain;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;

@Entity(name="patient")
public class Patient implements Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 2558249907642526794L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="patient_id",nullable=false, unique = true, length=20)
	private Integer id;
	@Column(name="name", nullable=false, length=65)
	private String name;
	@Column(name="dob", nullable=false)
	@Temporal(javax.persistence.TemporalType.TIMESTAMP)
	private Date dateOfBirth;
	@Column(name="age", nullable=false)
	private Integer age;
	@Column(name="address", nullable=false, length=512)
	private String address;
	@Column(name="hieght", nullable=true)
	private Integer hieght;
	@Column(name="weight", nullable=true)
	private Integer weight;
	
	public Integer getId()
	{
		return id;
	}
	public void setId(Integer id)
	{
		this.id = id;
	}
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public Date getDateOfBirth()
	{
		return dateOfBirth;
	}
	public void setDateOfBirth(Date dateOfBirth)
	{
		this.dateOfBirth = dateOfBirth;
	}
	public Integer getAge()
	{
		return age;
	}
	public void setAge(Integer age)
	{
		this.age = age;
	}
	public String getAddress()
	{
		return address;
	}
	public void setAddress(String address)
	{
		this.address = address;
	}
	public Integer getHieght()
	{
		return hieght;
	}
	public void setHieght(Integer hieght)
	{
		this.hieght = hieght;
	}
	public Integer getWeight()
	{
		return weight;
	}
	public void setWeight(Integer weight)
	{
		this.weight = weight;
	}
}
