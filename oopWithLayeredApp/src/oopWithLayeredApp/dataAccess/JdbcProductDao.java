package oopWithLayeredApp.dataAccess;

import oopWithLayeredApp.entiites.Product;

public class JdbcProductDao implements ProductDao{
	public void add(Product product) {
		System.out.println("JDBC ile veritabanına eklendi");
	}
}

//
