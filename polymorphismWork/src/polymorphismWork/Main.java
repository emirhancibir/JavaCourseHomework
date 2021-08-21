package polymorphismWork;

public class Main {

	public static void main(String[] args) {
		/*FileLogger logger = new FileLogger();
		logger.log("log mesajý");*/
		
		//int[] sayilar = new int[] {5,5,5,6};
		
// 		BaseLogger[] loggers = new BaseLogger[] {new FileLogger(), new DatabaseLogger(),
// 				new EmailLogger(), new ConsoleLogger()};
// 		 
// 		for (BaseLogger logger : loggers) {
//			logger.log("Log kodlari");
//		}
		CustomerManager customerManager = new CustomerManager(new FileLogger());
 		customerManager.add();
	}

}
