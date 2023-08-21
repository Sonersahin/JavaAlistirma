package oopWithLayeredApp;

import oopWithLayeredApp.bussines.ProductManager;
import oopWithLayeredApp.core.logging.DatabaseLogger;
import oopWithLayeredApp.core.logging.FileLogger;
import oopWithLayeredApp.core.logging.Logger;
import oopWithLayeredApp.core.logging.MailLogger;
import oopWithLayeredApp.dataAccess.HibernatProductDao;
import oopWithLayeredApp.entiites.Product;

public class Main {

	public static void main(String[] args) throws Exception {
		Product product1 = new Product(1, "Iphone 14 pro max", 73000);
		Logger[] loggers = {new DatabaseLogger(),new FileLogger(),new MailLogger()};
		
		ProductManager productManager = new ProductManager(new HibernatProductDao(), loggers);
		productManager.add(product1);

	}

}
