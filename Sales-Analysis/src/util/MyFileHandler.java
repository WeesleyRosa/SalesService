package util;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

import model.Customer;
import model.Sales;
import model.Salesman;

public class MyFileHandler {

	private ArrayList<Customer> customer = new ArrayList<Customer>();
	private ArrayList<Sales> sales = new ArrayList<Sales>();
	static ArrayList<Salesman> salesman = new ArrayList<Salesman>();
	private Salesman worstSalesman = null;
	private Sales expansiveSale = null;

	public void processFiles(File[] files) throws FileNotFoundException {
		int i = 0;
		while (i != files.length - 1) {
			Scanner scanner = new Scanner(files[i]);
			while (scanner.hasNextLine()) {
				String line = scanner.nextLine();
				String[] parsedLine = line.split("ç");
				if (parsedLine[0].equals("001")) {
					salesman.add(EntitysController.createSalesman(parsedLine));
				}

				else if (parsedLine[0].equals("002")) {
					customer.add(EntitysController.createCustomer(parsedLine));
				}

				else if (parsedLine[0].equals("003")) {
					sales.add(EntitysController.createSales(parsedLine));
				}

			}
			scanner.close();
		}

	}

	public void createFile(String directory) throws FileNotFoundException {
		File file = new File(directory);
		PrintWriter pw = new PrintWriter(file);
		pw.println("Amount of salesman: " + salesman.size());
		pw.println("Amount of clients: " + customer.size());
		pw.println("ID of the most expensive sale: " + EntitysController.mostExpansiveSale(sales));
		pw.println("Worst salesman: " + EntitysController.worstSalesman(salesman, sales));

	}

	public ArrayList<Customer> getCustomer() {
		return customer;
	}

	public ArrayList<Sales> getSales() {
		return sales;
	}

	public ArrayList<Salesman> getSalesman() {
		return salesman;
	}

	public Salesman getWorstSalesman() {
		return worstSalesman;
	}

	public Sales getExpansiveSale() {
		return expansiveSale;
	}

	public void setCustomer(ArrayList<Customer> customer) {
		this.customer = customer;
	}

	public void setSales(ArrayList<Sales> sales) {
		this.sales = sales;
	}

	public void setSalesman(ArrayList<Salesman> salesman) {
		MyFileHandler.salesman = salesman;
	}

	public void setWorstSalesman(Salesman worstSalesman) {
		this.worstSalesman = worstSalesman;
	}

	public void setExpansiveSale(Sales expansiveSale) {
		this.expansiveSale = expansiveSale;
	}

}
