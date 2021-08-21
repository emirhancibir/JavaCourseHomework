package staticDemoWork;

public class Validator {
	static {
		System.out.println("Static Constructor Method is Worked");
	}
	
	public Validator() {
		System.out.println("Constructor is worked");
	}
	public static boolean valid(Product product) {
		//Genelde utility ler static olur newlemek için uðraþmamk için
		if (product.price > 0 && !product.name.isEmpty()) {
			return true;
		} else {
			return false;
		}
	}

}
