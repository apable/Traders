package com.traders.models;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class SalesDetails implements Serializable{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id ;
	String grainName;
	Date  date;
	String bill; 
	String party ;
	int gstNumber ;
	int quantity ;
	int rate ;
	long amount;
	int receivedAt;
	long difference;
	int bag ;
	public String getGrainName() {
		return grainName;
	}
	public void setGrainName(String grainName) {
		this.grainName = grainName;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getBill() {
		return bill;
	}
	public void setBill(String bill) {
		this.bill = bill;
	}
	public String getParty() {
		return party;
	}
	public void setParty(String party) {
		this.party = party;
	}
	public int getGstNumber() {
		return gstNumber;
	}
	public void setGstNumber(int gstNumber) {
		this.gstNumber = gstNumber;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public int getRate() {
		return rate;
	}
	public void setRate(int rate) {
		this.rate = rate;
	}
	public long getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public int getReceivedAt() {
		return receivedAt;
	}
	public void setReceivedAt(int receivedAt) {
		this.receivedAt = receivedAt;
	}
	public long getDifference() {
		return difference;
	}
	public void setDifference(long l) {
		this.difference = l;
	}
	public int getBag() {
		return bag;
	}
	public void setBag(int bag) {
		this.bag = bag;
	}
	@Override
	public String toString() {
		return "SalesDetails [id=" + id + ", grainName=" + grainName + ", date=" + date + ", bill=" + bill + ", party="
				+ party + ", gstNumber=" + gstNumber + ", quantity=" + quantity + ", rate=" + rate + ", amount="
				+ amount + ", receivedAt=" + receivedAt + ", difference=" + difference + ", bag=" + bag + "]";
	}
}
