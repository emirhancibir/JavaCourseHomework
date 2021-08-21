
public class primeNumberApp {

	public static void main(String[] args) {
		
		int sayi = 18;
		boolean asalmi = true;
		for (int i = 2; i < sayi; i++) {
			if (sayi % i == 0)
				asalmi=false;
			}
		if (asalmi == true ) {
			System.out.println("sayi asal");	
		}
		else if (asalmi== false ) {
			System.out.println("sayi asal degil");
			
		}
	}

}
