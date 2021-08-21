
public class Main {

	public static void main(String[] args) {
		Product product = new Product();
		product.setName("Asus");
		product.setId(1);
		product.setPrice(15000);
		product.setStockAmount(15);
		product.setDescription("16gb ram");
		System.out.println(product.getCode());
		
		ProductManager productManager = new ProductManager();

		productManager.Add(product);// icine product turunde bir product ver diyor bizde
		// yukarda lower case product ý icine veriyoruz
		

	}

}
