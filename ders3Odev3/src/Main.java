import ders3Odev3.bussines.ProductManager;
import ders3Odev3.core.logging.Logger;
import ders3Odev3.entities.CourseCategory;
import ders3Odev3.entities.Course;
import ders3Odev3.core.logging.DatabaseLogger;
import ders3Odev3.core.logging.FileLogger;
import ders3Odev3.core.logging.MailLogger;
import ders3Odev3.dataAccess.*;

public class Main {
		
		public static void main(String[] args) throws Exception {
			CourseCategory category = new CourseCategory(1, "Java");
			Course product1 = new Course(1, "Java Kursu", category, 50);
			Logger[] loggers = { new DatabaseLogger(), new FileLogger(), new MailLogger() };
			
			ProductManager productManager = new ProductManager(new HibernateProductDao(), loggers);
			productManager.add(product1);

		

	}

}
