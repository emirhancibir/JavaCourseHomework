package gun_2_Odev;

public class Main {

	public static void main(String[] args) {
		Category category1 = new Category("Kurslarým","https://www.kodlama.io/courses/enrolled");
		
		Category category2 = new Category("Tüm Kurslar", "https://www.kodlama.io/courses");
		
		Category[] categories = {category1,category2};
		
		for (Category category : categories) {
			System.out.println(category.name);
		}
		
		SignInManaager signInManaager = new SignInManaager();
		
		signInManaager.signIn("ahmet", "ahmet123");
		
	}

}
