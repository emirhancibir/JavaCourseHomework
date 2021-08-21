package staticDemoWork;

public class Main {

	public static void main(String[] args) {
		ProductManager manager = new ProductManager();
		
		Product product = new Product(14,"Keyboard",56);

		manager.add(product);
		
/* Cok onemli !!! // neden her methodu static yapmýyoruz dersek
 * Cünkü static te uygulama kapanana kadar sürekli bellkete kalýyor
 * oysa new lediðimiz zaman bellekte örneði oluþuyor iþi bitince siliniyor
 * Yine cok onemli!!!!!!!! static te Constructor methodlar new leyince çalýþýr
 * 
 * Inner Class static olabilir ama Upper class olamaz*/
		
		DatabaseHelper.Crud.delete();
		DatabaseHelper.Connection.createConnection();
	}

}
