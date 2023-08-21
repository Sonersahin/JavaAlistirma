package ders3Odev3.dataAccess;

import ders3Odev3.entities.Course;

public class JdbcProductDao implements ProductDao{

	@Override
	public void add(Course product) {
		System.out.println("Jdbc ile veritabanına eklendi");
		
	}

}
