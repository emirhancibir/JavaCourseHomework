package coffeeShopDemoWork.Concrete;

import coffeeShopDemoWork.Abstract.BaseCustomerManager;
import coffeeShopDemoWork.Entities.Customer;

public class NeroCustomerManager extends BaseCustomerManager {

	@Override
	public void save(Customer customer) {
		System.out.println("Saved to DB : " + customer.firstName + " " + 
	customer.lastName);

	}

}
