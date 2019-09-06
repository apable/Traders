package com.traders.models.request;


public class GrainsRequest  implements Cloneable{
	
	private String grainName;
	PurchaseDetailsRequest purchaseDetails  ;

	SalesDetailsRequest salesDetails;
	public String getGrainName() {
		return grainName;
	}
	public void setGrainName(String grainName) {
		this.grainName = grainName;
	}
	
	public PurchaseDetailsRequest getPurchaseDetails() {
		return purchaseDetails;
	}
	public void setPurchaseDetails(PurchaseDetailsRequest purchaseDetails) {
		this.purchaseDetails = purchaseDetails;
	}
	public SalesDetailsRequest getSalesDetails() {
		return salesDetails;
	}
	public void setSalesDetails(SalesDetailsRequest salesDetails) {
		this.salesDetails = salesDetails;
	}
	@Override
	public String toString() {
		return "GrainsRequest [grainName=" + grainName + ", purchaseDetails=" + purchaseDetails + ", salesDetails="
				+ salesDetails + "]";
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}
