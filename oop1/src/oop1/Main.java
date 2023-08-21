package oop1;

public class Main {

	public static void main(String[] args) {
		

		Product product1 = new Product();
		product1.setName("Delongi Kahve Makinesi");
		product1.setDiscount(7);
		product1.setUnitPrice(7500);
		product1.setUnitInStock(3);
		product1.setImageUrl("iamge1.jpg");


		Product product2 = new Product();
		product2.setName("Smeg Kahve Makinesi");
		product2.setDiscount(7);
		product2.setUnitPrice(7500);
		product2.setUnitInStock(3);
		product2.setImageUrl("iamge2.jpg");


		Product product3 = new Product();
		product3.setName("Kitchen Air Kahve Makinesi");
		product3.setDiscount(7);
		product3.setUnitPrice(7500);
		product3.setUnitInStock(3);
		product3.setImageUrl("iamge3.jpg");

		System.out.println("<ul>");
		Product[] products = {product1,product2,product3};
		
		for (Product product : products) {
			System.out.println("<li>" + product.getName() + "</li>");
		}
		System.out.println("</ul>");
		
		IndividualCustomer individualCustomer = new IndividualCustomer();
		
		individualCustomer.setId(1);
		individualCustomer.setPhone("055555555");
		individualCustomer.setCustomerNumber("1234");
		individualCustomer.setFirstName("Soner");
		individualCustomer.setLastName("Şahin");
		
		
		CorporateCustomer corporateCustomer = new CorporateCustomer();
		
		corporateCustomer.setCompanyName("Kodlama.id");
		corporateCustomer.setCustomerNumber("2345");
		corporateCustomer.setId(2);
		corporateCustomer.setPhone("1234556788");
		corporateCustomer.setTaxNumber("111111111");
		
		
		System.out.println(individualCustomer.getId());
		

	}

}
