package com.traders.models;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import org.springframework.beans.factory.annotation.Autowired;

@Entity
public class Grains implements Serializable{
	
	private String grainName;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@OneToOne(cascade=CascadeType.ALL)
    @JoinColumn( name = "grainName", referencedColumnName = "grainName", insertable = false, updatable = false)
	@Autowired PurchaseDetails purchaseDetails  ;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name = "grainName", referencedColumnName = "grainName", insertable = false, updatable = false)
	@Autowired SalesDetails salesDetails ;

	public String getGrainName()  {
		return grainName; 
	}

	public void setGrainName(String grainName) {
		this.grainName = grainName;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	public PurchaseDetails getPurchaseDetails() {
		return purchaseDetails;
	}
	
	public void setPurchaseDetails(PurchaseDetails purchaseDetails) {
		this.purchaseDetails = purchaseDetails;
	}
	
	public SalesDetails getSalesDetails() {
		return salesDetails;
	}
	
	public void setSalesDetails(SalesDetails salesDetails) {
		this.salesDetails = salesDetails;
	}

	@Override
	public String toString() {
		return "Grains [grainName=" + grainName + ", id=" + id + "]";
	}

}
