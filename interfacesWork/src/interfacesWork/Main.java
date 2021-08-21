package interfacesWork;

public class Main {

	public static void main(String[] args) {
//		CustomerDal customerDal = new MySqlCustomerDal();
//		customerDal.add();
		
		CustomerManager customerManager = new CustomerManager(new SqlServerCustomerDal());

		customerManager.add();

	}

}
