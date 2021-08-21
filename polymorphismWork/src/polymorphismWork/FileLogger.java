package polymorphismWork;

public class FileLogger extends BaseLogger {
	//override da bu base te zaten log metodu var onu eziyoruz bunu kullanýyoruz
	public void log(String message) {
		System.out.println("Logged to file : " +message);
	}
}
