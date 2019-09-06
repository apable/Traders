package com.traders.models.request;

import java.util.Date;

public class SalesDetailsRequest {
	
	Date  date;
	String bill; 
	String party ;
	private int gstNumber;
	int quantity ;
	int rate ;
	int amount;
	int receivedAt;
	int difference;
	int bag ;
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
	public int getAmount() {
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
	public int getDifference() {
		return difference;
	}
	public void setDifference(int difference) {
		this.difference = difference;
	}
	public int getBag() {
		return bag;
	}
	public void setBag(int bag) {
		this.bag = bag;
	}
	@Override
	public String toString() {
		return "SalesDetails [date=" + date + ", bill=" + bill + ", party=" + party + ", quantity=" + quantity
				+ ", rate=" + rate + ", amount=" + amount + ", receivedAt=" + receivedAt + ", difference=" + difference
				+ ", bag=" + bag + "]";
	}
}
