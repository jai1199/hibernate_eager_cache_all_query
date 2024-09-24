package com.jsp.in.EagerAndLazy;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Cacheable;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

@Entity
@Cacheable
@Cache(usage=CacheConcurrencyStrategy.READ_ONLY)
class Student {
	@Id
private int sId;
private String sName;
@OneToMany(mappedBy = "s")
private List<Book> bList=new ArrayList<Book>();
public List<Book> getbList() {
	return bList;
}
public void setbList(List<Book> bList) {
	this.bList = bList;
}
public int getsId() {
	return sId;
}
public void setsId(int sId) {
	this.sId = sId;
}
public String getsName() {
	return sName;
}
public void setsName(String sName) {
	this.sName = sName;
}
@Override
public String toString() {
	return "Student [sId=" + sId + ", sName=" + sName + "]";
}


}
