package staticDemoWork;

public class ProductManager {
	public void add(Product product) {

		if (Validator.valid(product) == true) {
			System.out.println("Product is added ! => " + product.name);
		} else {
			System.out.println("Product could not be added !\nIs Unvalid Product");
		}
	}
	//Validator validator = new Validator();

}
