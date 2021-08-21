
public class Strings {

	public static void main(String[] args) {
		String mesaj = "java programlama";
		
		System.out.println(mesaj.length());
		System.out.println("-------------------");
		for (int i = 0; i < mesaj.length(); i++) {
			System.out.println(mesaj.charAt(i));
		}
		System.out.println("-------------------------");
		
		String yeniMesaj = mesaj.concat(" dili");
		//concat concatenation(birlestirme)
		
		System.out.println(yeniMesaj);
		System.out.println("----------------");
		
		
		char[] karakterler = new char[mesaj.length()];
		mesaj.getChars(0, mesaj.length(), karakterler, 0);
		//0 dan basla, mesaj uzunluðuna kadar,karakterler dizisine ata, 0 dan itibaren
		for (char k : karakterler) {
			System.out.println(k);
			}
		System.out.println("----------------------");
		System.out.println(yeniMesaj.replace(' ', '_'));
		
		System.out.println(mesaj.substring(5, 16));
		//5 dahil 15 dahil degil
		System.out.println("------------------------");
		
		for (String msj : yeniMesaj.split(" ") ) {
			System.out.println(msj);
		}
		System.out.println("---------------");
		String[] words= yeniMesaj.split(" ");
		System.out.println(words[1]);
	}

}
