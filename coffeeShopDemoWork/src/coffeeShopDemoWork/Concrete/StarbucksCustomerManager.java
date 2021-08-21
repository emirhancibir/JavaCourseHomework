package coffeeShopDemoWork.Concrete;

import java.rmi.RemoteException;

import coffeeShopDemoWork.Abstract.BaseCustomerManager;
import coffeeShopDemoWork.Abstract.CustomerCheckService;
import coffeeShopDemoWork.Entities.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager{
	
	private CustomerCheckService customerCheckService;

	public StarbucksCustomerManager(CustomerCheckService checkService) {
		this.customerCheckService = checkService;
	}
	
	@Override
	public void save(Customer customer) throws NumberFormatException, RemoteException {
		if (customerCheckService.checkIfRealPerson(customer)) {
			super.save(customer);//super miras birakan classý çaðýrýr
		}else {
			System.out.println("Hatali kullanici girisi");
		}
		

	}

}
