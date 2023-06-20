package pattern.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ProductImpl {
    public static  void main(String[] args){
        // using stream API
        List< Product > filteredProducts = getProducts().stream()
                .filter((product) -> product.getPrice() > 25000f)
                .collect(Collectors.toList());
        filteredProducts.forEach(System.out::println);
    }
    private static List < Product > getProducts() {
        List < Product > productsList = new ArrayList< Product >();
        productsList.add(new Product(1, "HP Laptop", 25000f));
        productsList.add(new Product(2, "Dell Laptop", 30000f));
        productsList.add(new Product(3, "Lenevo Laptop", 28000f));
        productsList.add(new Product(4, "Sony Laptop", 28000f));
        productsList.add(new Product(5, "Apple Laptop", 90000f));
        return productsList;
    }
}
