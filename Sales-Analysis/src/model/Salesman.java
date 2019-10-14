package model;

public class Salesman {

	private String name;
	private double salary;
	private String cpf;
	private double salesValue = 0.0;

	public String getName() {
		return name;
	}

	public double getSalary() {
		return salary;
	}

	public String getCpf() {
		return cpf;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public double getSalesValue() {
		return salesValue;
	}

	public void setSalesValue(double salesValue) {
		this.salesValue = salesValue;
	}
	
	

}
