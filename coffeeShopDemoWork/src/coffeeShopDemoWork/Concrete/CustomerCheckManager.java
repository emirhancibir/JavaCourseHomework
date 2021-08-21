package coffeeShopDemoWork.Concrete;

import coffeeShopDemoWork.Abstract.CustomerCheckService;
import coffeeShopDemoWork.Entities.Customer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class CustomerCheckManager implements CustomerCheckService {

	@Override
	public boolean checkIfRealPerson(Customer customer) {
		KPSPublicSoapProxy mernis = new KPSPublicSoapProxy();
		return true;
	}

}
