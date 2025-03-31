package Week3.Task3;

public class Main {
    public static void main(String[] args) {
        Product prod1 = new Product("Rooh Afza", 1200.0);
        Product prod2 = new Product("Shan Masala", 600.0);

        Product.setDiscount(200);

        prod1.calculateDiscountedPrice();
        prod2.calculateDiscountedPrice();


        System.out.println("Week3.Task3.Product: " + prod1.productName + " Original Price: " + prod1.price + " Discounted Price: " + prod1.calculateDiscountedPrice());
        System.out.println("Week3.Task3.Product: " + prod2.productName + " Original Price: " + prod2.price + " Discounted Price: " + prod2.calculateDiscountedPrice());
        System.out.println("Week3.Task3.Product " + prod1.compareDisocunt(prod2) + " has a higher discounted price.");
    }
}