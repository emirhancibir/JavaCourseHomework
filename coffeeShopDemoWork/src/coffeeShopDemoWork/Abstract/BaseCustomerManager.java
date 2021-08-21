package coffeeShopDemoWork.Abstract;

import java.rmi.RemoteException;

import coffeeShopDemoWork.Entities.Customer;

public abstract class BaseCustomerManager implements CustomerService {

	@Override
	public void save(Customer customer) throws NumberFormatException, RemoteException{
		System.out.println("Saved to DB : " + customer.firstName + " " + 
	customer.lastName);

	}
	
	

}
