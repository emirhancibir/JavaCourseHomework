package coffeeShopDemoWork;

import java.rmi.RemoteException;

import coffeeShopDemoWork.Abstract.BaseCustomerManager;
import coffeeShopDemoWork.Adapters.MernisServiceAdapter;

import coffeeShopDemoWork.Concrete.StarbucksCustomerManager;
import coffeeShopDemoWork.Entities.Customer;

public class Main {

	public static void main(String[] args) throws NumberFormatException, RemoteException {
		Customer customer1 = new Customer(1, "Emirhan", "Cýbýr", 2001, "12345678911");

		
		BaseCustomerManager customerManager = new StarbucksCustomerManager(new MernisServiceAdapter());
		customerManager.save(customer1);

	}

}
