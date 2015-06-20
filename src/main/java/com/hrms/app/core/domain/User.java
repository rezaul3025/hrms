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
	@Column(name="username")
	private String userName;
	@Column(name="password")
	private String password;
	@Column(name="enabled")
	@Type(type="boolean")
	private Boolean enabled;
	@OneToMany(fetch = FetchType.LAZY,mappedBy="user")
	private List<Role> roles = new ArrayList<>();
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
	public List<Role> getRoles()
	{
		return roles;
	}
	public void setRoles(List<Role> roles)
	{
		this.roles = roles;
	}
	
}
