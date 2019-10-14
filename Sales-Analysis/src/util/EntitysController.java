package util;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import model.Customer;
import model.Sales;
import model.Salesman;

public class EntitysController {

	public static Sales createSales(String[] sale) {
		Sales sales = new Sales();
		sales.setSalesId(Integer.parseInt(sale[1]));
		sales.setSaleValue(returnSaleValue(sale[2]));
		// sales.setSalesmanName(checkSalesman(sale[3]));
		sales.setSalesmanName(sale[3]);
		return sales;
	}

	// public static Salesman checkSalesman(String salesmanName) {
	// for (Salesman sMan : MyFileHandler.salesman) {
	// if (sMan.getName().equals(salesmanName)) {
	// return sMan;
	// }
	// }
	// return null;
	// }

	public static double returnSaleValue(String item) {
		String[] splitedItem = item.replace("[", "").replace("]", "").split(",");
		double itemValue = 0.0;
		if (splitedItem.length > 0) {
			for (String it : splitedItem) {
				String[] columns = it.split("-");
				if (columns.length == 3) {
					itemValue = Double.parseDouble(columns[1]) * Double.parseDouble(columns[2]);

				}
			}
		}
		return itemValue;
	}

	public static Salesman createSalesman(String[] salesmanString) {
		Salesman salesman = new Salesman();
		salesman.setCpf(salesmanString[1]);
		salesman.setName(salesmanString[2]);
		salesman.setSalary(Double.parseDouble(salesmanString[3]));
		return salesman;
	}

	public static Customer createCustomer(String[] cust) {
		Customer customer = new Customer();
		customer.setCnpj(cust[1]);
		customer.setName(cust[2]);
		customer.setBusinessArea(cust[3]);
		return customer;
	}

	public static int mostExpansiveSale(List<Sales> sales) {
		Sales sale = sales.get(0);

		for (Sales sal : sales) {
			if (sal.getSaleValue() > sale.getSaleValue())
				sale.setSaleValue(sal.getSaleValue());
			else
				continue;
		}

		return sale.getSalesId();
	}

	public static String worstSalesman(List<Salesman> salesMan, ArrayList<Sales> sales) {
		Map<String, Double> map = new HashMap<String, Double>();
		for (Salesman salesM : salesMan) {
			double salesMValue = 0.0;
			for (Sales sal : sales) {
				if (sal.getSalesmanName().equals(salesM.getName())) {
					salesMValue += sal.getSaleValue();
				}
			}
			map.put(salesM.getName(), salesMValue);
		}
		double worstValue = map.get(salesMan.get(0).getName());
		String nameWorst = salesMan.get(0).getName();
		for (Entry<String, Double> pair : map.entrySet()) {
			if (worstValue < pair.getValue()) {
				nameWorst = pair.getKey();
				worstValue = pair.getValue();
			}

		}

		return nameWorst;
	}

}
