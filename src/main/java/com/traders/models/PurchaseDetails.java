package com.traders.models;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class PurchaseDetails implements Serializable{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id  ;
	String grainName;
	Date date; 
	String genes; 
	int quantity ;
	int rate ;
	long amount ;
	int closingStock;
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
	public String getGenes() {
		return genes;
	}
	public void setGenes(String genes) {
		this.genes = genes;
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
	public int getClosingStock() {
		return closingStock;
	}
	public void setClosingStock(int closingStock) {
		this.closingStock = closingStock;
	}	
	@Override
	public String toString() {
		return "PurchaseDetails [id=" + id + ", grainName=" + grainName + ", date=" + date + ", genes=" + genes
				+ ", quantity=" + quantity + ", rate=" + rate + ", amount=" + amount + ", closingStock=" + closingStock
				+ "]";
	}
}
