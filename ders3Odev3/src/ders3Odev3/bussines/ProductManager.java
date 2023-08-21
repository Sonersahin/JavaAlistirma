package ders3Odev3.bussines;

import ders3Odev3.core.logging.Logger;
import ders3Odev3.dataAccess.ProductDao;
import ders3Odev3.entities.Course;

public class ProductManager {
	private ProductDao productDao;
	private Logger[] loggers;
	
	public ProductManager(ProductDao productDao, Logger[] loggers) {
		this.productDao = productDao;
		this.loggers = loggers;
	}

	public void add(Course product) throws Exception {
	    if (product.getPrice() < 0) {
	        throw new Exception("Kursun fiyatı 0'dan küçük olamaz!");
	    }

	    if (isCategoryNameDuplicated(product)) {
	        throw new Exception("Aynı kategori adına sahip başka bir ürün zaten var!");
	    }

	    productDao.add(product);

	    for (Logger logger : loggers) {
	        logger.log(product.getName());
	    }
	}

	private boolean isCategoryNameDuplicated(Course product) {
		return false;
	}


}
