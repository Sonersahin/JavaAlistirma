package oopWithLayeredApp.dataAccess;

import oopWithLayeredApp.entiites.Product;

public class HibernatProductDao implements ProductDao{
	public void add(Product product) {
		System.out.println("Hibernate ile veritabanına eklendi");
	}
}
