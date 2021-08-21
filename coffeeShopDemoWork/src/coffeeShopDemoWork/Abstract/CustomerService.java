package coffeeShopDemoWork.Abstract;

import java.rmi.RemoteException;

import coffeeShopDemoWork.Entities.Customer;

public interface CustomerService {
	void save(Customer customer) throws NumberFormatException, RemoteException;
}
