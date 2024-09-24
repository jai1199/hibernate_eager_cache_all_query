package com.jsp.in.EagerAndLazy;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import org.hibernate.annotations.ForeignKey;

@Entity
public class Customer {
	@Id
private int cid;
private String cName;
private String cLocation;
@OneToMany(mappedBy = "customer")
private List<Orders> olist=new ArrayList<Orders>();
public List<Orders> getOlist() {
	return olist;
}
public void setOlist(List<Orders> olist) {
	this.olist = olist;
}
public int getCid() {
	return cid;
}
public void setCid(int cid) {
	this.cid = cid;
}
public String getcName() {
	return cName;
}
public void setcName(String cName) {
	this.cName = cName;
}
public String getcLocation() {
	return cLocation;
}
public void setcLocation(String cLocation) {
	this.cLocation = cLocation;
}
@Override
public String toString() {
	return "Customer [cid=" + cid + ", cName=" + cName + ", cLocation=" + cLocation + ", olist=" + olist + "]";
}

}
