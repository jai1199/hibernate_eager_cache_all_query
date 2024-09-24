package com.jsp.in.EagerAndLazy;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

import org.hibernate.annotations.ForeignKey;

@Entity
public class Orders {
@Id
private int oId;
private String oName;
private String oState;
@ManyToOne
private Customer customer;

public Customer getCustomer() {
	return customer;
}
public void setCustomer(Customer customer) {
	this.customer = customer;
}
public int getoId() {
	return oId;
}
public void setoId(int oId) {
	this.oId = oId;
}
public String getoName() {
	return oName;
}
public void setoName(String oName) {
	this.oName = oName;
}
public String getoState() {
	return oState;
}
public void setoState(String oState) {
	this.oState = oState;
}
@Override
public String toString() {
	return "Orders [oId=" + oId + ", oName=" + oName + ", oState=" + oState + ", customer=" + customer + "]";
}


}
