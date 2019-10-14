package model;

public class Sales {

	private int salesId;
	private double saleValue;
	private String salesmanName;

	public int getSalesId() {
		return salesId;
	}

	public double getSaleValue() {
		return saleValue;
	}

	public String getSalesmanName() {
		return salesmanName;
	}

	public void setSalesId(int salesId) {
		this.salesId = salesId;
	}

	public void setSaleValue(double saleValue) {
		this.saleValue = saleValue;
	}

	public void setSalesmanName(String salesmanName) {
		this.salesmanName = salesmanName;
	}

}
