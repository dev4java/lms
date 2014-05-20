package com.yswsoft.lms.core.entity.manage.relation;

import java.io.Serializable;
import java.sql.Date;

public class Relation_ReaderBooking implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Long id;
	private Long bookid;
	private Long readerid;
	
	private Date createTime;
	private Date borrowTime;
	private Date returnTime;
	
	private int status;//归还状态 0已经归还 1正常未归还 2超期未归还
	
	
	
}
