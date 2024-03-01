public class Main {
    public static void main(String[] args) {
        Product item1 = new Item("Laptop", 1000);
        Product item2 = new Item("Headphones", 100);

        Discount percentageDiscount = new PercentageDiscount(10);

        Product saleItem1 = new SaleItem("Smartphone", 500, percentageDiscount);
        Product saleItem2 = new SaleItem("Tablet", 300, percentageDiscount);

        Inventory inventory = new Inventory();
        inventory.addProduct(item1);
        inventory.addProduct(item2);
        inventory.addProduct(saleItem1);
        inventory.addProduct(saleItem2);

        inventory.displayInventory();
    }
}

