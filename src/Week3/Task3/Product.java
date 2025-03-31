package Week3.Task3;

public class Product {
    String productName;
    double price;
    static double discount;

    public Product(String productName, double price){
        this.productName = productName;
        this.price = price;
    }

    public static void setDiscount(double discountvalue){
        discount = discountvalue;
    }

    public double calculateDiscountedPrice(){
        return price - discount;
    }

    public String compareDisocunt(Product other){
        double prod1Discount = this.calculateDiscountedPrice();
        double prod2Discount = other.calculateDiscountedPrice();

        if(prod1Discount > prod2Discount){
            return this.productName;
        } else if (prod1Discount < prod2Discount) {
            return other.productName;
        } else {
            return "Both products have the same discounted price";
        }

    }


}
