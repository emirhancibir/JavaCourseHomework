
public class cokBoyutluDiziler {

	public static void main(String[] args) {
		
		String [] [] dizi= 
			{{"Ýst","Edirne","Tekirdag"},{"Ankara","Kayseri","Konya"},{"Samsun","Ordu","Trabzon"}};
		//System.out.println(dizi.length);
		
		for (int i = 0; i <= 2; i++) {
			System.out.println("----------------------");
			for (int j = 0; j < dizi.length; j++) {
				System.out.println(dizi[i][j]);
				
			}
			
		}
		
		
		
	}
}
