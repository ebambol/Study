package dao;

import dto.Product;
import java.util.ArrayList;

public class ProductRepository {
	// Product 클래스 타입의 객체를 저장하기위한 자료구조로 ArrayList 객체를 생성
	// private ArrayList listOfProducts_etc = new ArrayList();
	private ArrayList<Product> listOfProducts = new ArrayList<Product>();
	private static ProductRepository instance = new ProductRepository();
	
	public static ProductRepository getInstance() {
		return instance;
	}
	
	public void addProduct(Product product) {
		listOfProducts.add(product);
	}
	
	public ProductRepository() {
		Product phone = new Product("P1234","iPhone 6s", 800000);
		phone.setDescription("4.7인치, 해상도 1334x750");
		phone.setCategory("Smart Phone");
		phone.setManufacturer("Apple");
		phone.setUnitsInStock(1000);
		phone.setCondition("New");
		phone.setFilename("P1234.png");
		
		Product notebook = new Product("P1235","LG PC 그램", 1500000);
		notebook.setDescription("13.3인치, IPS LED display");
		notebook.setCategory("Notebook");
		notebook.setManufacturer("LG");
		notebook.setUnitsInStock(1000);
		notebook.setCondition("Refurbished");
		notebook.setFilename("P1235.png");
		
		Product tablet = new Product("P1236","Galaxy Tab S", 900000);
		tablet.setDescription("212.8인치, Super AMOLED display");
		tablet.setCategory("Tablet");
		tablet.setManufacturer("Samsung");
		tablet.setUnitsInStock(1000);
		tablet.setCondition("Old");
		tablet.setFilename("P1236.png");
		
		listOfProducts.add(phone);
		listOfProducts.add(notebook);
		listOfProducts.add(tablet);
	}
	
	public ArrayList<Product> getAllProducts(){
		return listOfProducts;
	}
	
	public Product getProductById(String productId) {
		Product productById = null;
		
		for(int i=0; i<listOfProducts.size();i++) {
			Product product = listOfProducts.get(i);
			if( product != null &&
				product.getProductId() != null &&
				product.getProductId().equals(productId)
			  ) {
				productById = product;
				break;
			}
		} // End of for
		return productById;
	}
	
}









