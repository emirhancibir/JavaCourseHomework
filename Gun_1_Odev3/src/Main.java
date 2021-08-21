
public class Main {

	public static void main(String[] args) {
		double[] sayilar = {39.4,1.6,6.3,7.1};
		double toplam = 0;
		double enB = sayilar[0];
		
		for (double say : sayilar) {
			System.out.println(say);
			if (say>enB) {
				enB = say;				
			}
			toplam +=say;
			}
		System.out.println("Sayilarinin toplami : "+toplam);
		System.out.println("-------------------------------------------");
		
		/*if (sayilar[1]>enB) {
			enB=sayilar[1];
		}
		if (sayilar[2]>enB) {
			enB=sayilar[2];
		}
		if (sayilar[3]>enB) {
			enB=sayilar[3];
		}*/
		System.out.println("Sayilarin enbuyugu = "+ enB);
	}

}
