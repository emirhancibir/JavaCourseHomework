
public class uygulama2 {

	public static void main(String[] args) {
		int[] sayilar = {1,2,6,7,9,0};
		int aranacak = 5;
		boolean varmi= false;
		for (int say : sayilar) {
			if (say == aranacak) 
				varmi = true;	
		}
		if (varmi== true) 
			System.out.println("sayi var");
		else 
			System.out.println("sayi yok");
		
	}

}
