package model;

public class Customer {

	private String cnpj;
	private String name;
	private String businessArea;

	public String getCnpj() {
		return cnpj;
	}

	public String getName() {
		return name;
	}

	public String getBusinessArea() {
		return businessArea;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setBusinessArea(String businessArea) {
		this.businessArea = businessArea;
	}

	@Override
	public String toString() {
		return "Customer [cnpj=" + cnpj + ", name=" + name + ", businessArea=" + businessArea + "]";
	}

}
