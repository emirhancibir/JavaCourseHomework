package polymorphismWork;

public class CustomerManager {
	private BaseLogger logger; ///private int x; gibi
	//constructor
	public CustomerManager(BaseLogger logge) {
		this.logger = logge;
	}
	public void add() {
		System.out.println("Musteri eklendi!");
		this.logger.log("log mesajý");
	}
	
	

}
