package abstractDemoWork;

public class Main {

	public static void main(String[] args) {
		CustomerManager customerManager = new CustomerManager();
		customerManager.baseDatabaseManager = new SqlServerDBManager();
		customerManager.getCustomers();

	}

}
