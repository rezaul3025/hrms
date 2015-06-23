package com.hrms.app.core.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import org.hibernate.annotations.Type;

@Entity(name="user_info")
public class User implements Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private Integer Id;
	@Column(name="username", length=20)
	private String userName;
	@Column(name="password")
	private String password;
	@Column(name="enabled")
	@Type(type="boolean")
	private Boolean enabled;
	@Column(name="roles", length=200)
	private String roles;
	@Column(name="first_name", length=50)
	private String firstName;
	@Column(name="last_name", length=50)
	private String lastName;
	@Column(name="title", length=65)
	private String title;
	@Column(name="address", length=512)
	private String address;
	public Integer getId()
	{
		return Id;
	}
	public void setId(Integer id)
	{
		Id = id;
	}
	public String getUserName()
	{
		return userName;
	}
	public void setUserName(String userName)
	{
		this.userName = userName;
	}
	public String getPassword()
	{
		return password;
	}
	public void setPassword(String password)
	{
		this.password = password;
	}
	public Boolean getEnabled()
	{
		return enabled;
	}
	public void setEnabled(Boolean enabled)
	{
		this.enabled = enabled;
	}
	public String getRoles()
	{
		return roles;
	}
	public void setRoles(String roles)
	{
		this.roles = roles;
	}
	public String getFirstName()
	{
		return firstName;
	}
	public void setFirstName(String firstName)
	{
		this.firstName = firstName;
	}
	public String getLastName()
	{
		return lastName;
	}
	public void setLastName(String lastName)
	{
		this.lastName = lastName;
	}
	public String getTitle()
	{
		return title;
	}
	public void setTitle(String title)
	{
		this.title = title;
	}
	public String getAddress()
	{
		return address;
	}
	public void setAddress(String address)
	{
		this.address = address;
	}

}
