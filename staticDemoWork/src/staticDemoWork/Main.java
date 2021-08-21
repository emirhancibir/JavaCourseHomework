package staticDemoWork;

public class Main {

	public static void main(String[] args) {
		ProductManager manager = new ProductManager();
		
		Product product = new Product(14,"Keyboard",56);

		manager.add(product);
		
/* Cok onemli !!! // neden her methodu static yapm�yoruz dersek
 * C�nk� static te uygulama kapanana kadar s�rekli bellkete kal�yor
 * oysa new ledi�imiz zaman bellekte �rne�i olu�uyor i�i bitince siliniyor
 * Yine cok onemli!!!!!!!! static te Constructor methodlar new leyince �al���r
 * 
 * Inner Class static olabilir ama Upper class olamaz*/
		
		DatabaseHelper.Crud.delete();
		DatabaseHelper.Connection.createConnection();
	}

}
