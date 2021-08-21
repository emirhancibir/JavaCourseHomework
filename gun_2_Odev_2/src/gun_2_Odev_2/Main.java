package gun_2_Odev_2;

public class Main {

	public static void main(String[] args) {
		sayiBulmaca();
		
	}
	public static void sayiBulmaca() {
		int[] sayilar = {1,2,6,7,9,0};
		int aranacak = 1;
		
		boolean varmi= false;
		
		for (int say : sayilar) {
			if (say == aranacak) 
				varmi = true;	
		}
		if (varmi== true) 
			mesajVer("Sayi mevcuttur : " + aranacak);
		else 
			mesajVer("Sayi mevcut degildir : " + aranacak);
	}
	//method isimleri camel case yazýlýr
	public static void mesajVer(String mesaj) {
		System.out.println(mesaj);
	}

}
