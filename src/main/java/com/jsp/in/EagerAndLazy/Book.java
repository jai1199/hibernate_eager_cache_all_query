package com.jsp.in.EagerAndLazy;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.mysql.cj.x.protobuf.MysqlxDatatypes.Scalar.String;

@Entity
public class Book {
	@Id
	private int bId;
	private String bName;
	@ManyToOne
	private Student s;

	public Student getS() {
		return s;
	}

	public void setS(Student s) {
		this.s = s;
	}

	public int getbId() {
		return bId;
	}

	public void setbId(int bId) {
		this.bId = bId;
	}

	public String getbName() {
		return bName;
	}

	public void setbName(String bName) {
		this.bName = bName;
	}


}
