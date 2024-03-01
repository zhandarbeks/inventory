public class SaleItem implements Product {
    private String name;
    private double price;
    private Discount discountStrategy;
    
    public SaleItem(String name, double price, Discount discountStrategy){
        this.name = name;
        this.price = price;
        this.discountStrategy = discountStrategy;
    }
    
    @Override
    public void displayInfo() {
        double discountedPrice = discountStrategy.applyDiscount(price);
        System.out.println((name + " - $" + discountedPrice + " (Discounted)"));
    }
}
