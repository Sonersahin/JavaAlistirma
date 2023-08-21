package ders3Odev3.dataAccess;

import ders3Odev3.entities.Course;

public class HibernateProductDao implements ProductDao{
	public void add(Course product) {
		System.out.println("Hibernate ile veritabanına eklendi");
	}
}
