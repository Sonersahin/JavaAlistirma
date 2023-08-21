package pollymorphismDemo;

public class Main {

	public static void main(String[] args) {
		//BaseLogger[] loggers = new BaseLogger[] {new FileLogger(),new EmailLogger(),new DatabaseLogger(),new ConsoleLogger()};
		//for (BaseLogger baseLogger : loggers) {
			//baseLogger.Log("Log Mesajı");
		//}
		
		CustomerManager customerManager = new CustomerManager(new FileLogger());
		customerManager.Add();
	}

}
