package coffeeShopDemoWork.Adapters;

import java.rmi.RemoteException;

import coffeeShopDemoWork.Abstract.CustomerCheckService;
import coffeeShopDemoWork.Entities.Customer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements CustomerCheckService {
	KPSPublicSoapProxy mernis = new KPSPublicSoapProxy();

	public boolean checkIfRealPerson(Customer customer) throws RemoteException, NumberFormatException {

		boolean result = mernis.TCKimlikNoDogrula(Long.parseLong(customer.nationalityId),
				customer.firstName.toUpperCase(), customer.lastName, customer.dateOfBirth);

		if (result == true) {
			System.out.println("Giris Basarili\nSaved to DB : " + customer.firstName + " " + customer.lastName);
			return true;
		} else {
			System.out.println("Hatali Giris");
			return false;
		}
	}

}
