package com.yswsoft.lms.core.entity.manage.admin;

import java.io.Serializable;
import java.util.Date;

/**
 * @author root
 *
 */
public class AdminUser implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Long id;
	private Long jobNumber;//工号
	private String loginEmail;
	private String name;
	private String password;
	private Date createTime;
	private int level;//权限等级
	private int status;//状态
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getJobNumber() {
		return jobNumber;
	}
	public void setJobNumber(Long jobNumber) {
		this.jobNumber = jobNumber;
	}
	public String getLoginEmail() {
		return loginEmail;
	}
	public void setLoginEmail(String loginEmail) {
		this.loginEmail = loginEmail;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	
	
	
}
