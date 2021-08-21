package coffeeShopDemoWork.Abstract;

import java.rmi.RemoteException;

import coffeeShopDemoWork.Entities.Customer;

public interface CustomerCheckService {
	boolean checkIfRealPerson(Customer customer) throws NumberFormatException, RemoteException;
	
	
}
