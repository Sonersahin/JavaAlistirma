package classesWithAttributes;

public class Main {

	public static void main(String[] args) {
		
		Product product = new Product();
		product.description="test";
		product.id = 1;
		product.name ="Laptop";
		product.price=270000;
		product.stockAmount=4;
		
		ProductManager manager = new ProductManager();
		manager.Add(product);
		
	}

}
