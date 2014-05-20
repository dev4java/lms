package com.yswsoft.lms.core.entity.front;

import java.io.Serializable;
import java.sql.Date;

/**
 * @author root
 *
 */
public class Reader implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Long id;
	private Long jobNumber;//工号
	private int type;
	private int dept;
	private String loginEmail;
	private String name;
	private String password;
	private Date createTime;
	private int level;//借阅权限 
	private int status;//状态 0有效 1失效
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
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}
	public int getDept() {
		return dept;
	}
	public void setDept(int dept) {
		this.dept = dept;
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
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	
	
	

}
