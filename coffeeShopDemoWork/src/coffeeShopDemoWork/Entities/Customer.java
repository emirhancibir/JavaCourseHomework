package coffeeShopDemoWork.Entities;

import coffeeShopDemoWork.Abstract.Entity;

public class Customer implements Entity {

	public int id;
	public String firstName;
	public String lastName;
	public int dateOfBirth;
	public String nationalityId;
	
	public Customer() {
		
	}
	
	
	public Customer(int id, String firstName, String lastName, int dateOfBirth, String nationalityId) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.dateOfBirth = dateOfBirth;
		this.nationalityId = nationalityId;
	}

}
