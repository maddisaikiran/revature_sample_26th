package hashSet;

import java.util.HashSet;
import java.util.Set;

public class ProductMain {

	public static void main(String[] args) {
		Set<Product> ProductList = new HashSet<>();
		ProductList.add(new Product(100, "Laptop", 26000.22, 3.3f, 3));
		ProductList.add(new Product(101, "Smart watch", 5010.22, 2.9f,2));
		ProductList.add(new Product(190, "nike shoes", 1100.22, 2.3f,2));
		ProductList.add(new Product(200, "Laptop", 31200.26, 4.7f,5));
		ProductList.add(new Product(100, "Inverter", 22000.22, 2.3f, 3));
		ProductList.add(new Product(100, "Laptop", 12000.22, 2.3f, 2));
		ProductList.add(new Product(190, "Reebok shoes", 1100.22, 2.3f,2));
		ProductList.add(new Product(190, "Laptop", 21000.22, 1.3f,4));
		ProductList.add(new Product(200, "Tv set", 10000.98, 4.3f,5));
		ProductList.add(new Product(200, "Denver Deo", 13040.52, 5.3f,6));
		printProductList(ProductList);

	}
       public static void printProductList(Set<Product> ProductList) {
    	   for(Product p : ProductList) {
    		   System.out.println(p);
    	   }
       }
}
