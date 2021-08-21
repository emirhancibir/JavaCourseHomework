package gun_2_Odev_2;

public class Methods_2 {

	public static void main(String[] args) {
		
		System.out.println(topla(5, 10));
		int toplam = topla2(5,4,5);
		System.out.println(toplam);
		
	}
	public static void ekle() {
		System.out.println("eklendi");
	}
	public static void sil() {
		System.out.println("silindi");
	}
	public static void guncelle() {
		System.out.println("guncellendi");		
	}
	public static int topla(int a,int b) {//sadece iki sayi gonderilebilir
		int toplam = a+b;
		return toplam;
	}
	//birden fazla sayi gondermek icin //VARIABLE ARGUMENTS kullanýlýr
	public static int topla2(int... sayilar) {//girilen sayilari array olarak tutar
		int toplam = 0;
		for (int sayi : sayilar) {
			//toplam = toplam + sayi;
			toplam += sayi;
		}
		return toplam;
	}
}
