package interfacesWork;

public class MySqlCustomerDal implements CustomerDal{

	@Override
	public void add() {
		System.out.println("MySql DB added");
		
	}

}
