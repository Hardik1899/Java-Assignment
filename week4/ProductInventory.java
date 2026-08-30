public class ProductInventory {
    public void main(String[] args){

    }
class Product{
     String code;
    String name;
     double unitPrice;
     int quantity;

     static int productCount = 0;
    public Product(String code, String name, double unitPrice) {
        this(code, name, unitPrice, 0);
    }

    public Product(String code, String name, double unitPrice, int quantity) {
        this.code = code;
        this.name = name;
        this.unitPrice = unitPrice;
        this.quantity = quantity;
        productCount++;
    }
    public boolean restock(int amount) {
        if (amount <= 0) {
            return false;
        }else {
            quantity += amount;
            return true;
        }
    }

    public boolean sell(int amount) {
        if (amount <= 0 || amount > quantity) {
            return false;
        }else {
            quantity -= amount;
            return true;
        }
    }

    public double getInventoryValue() {
        return (unitPrice * quantity);
    }

    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }
    public double getUnitPrice() {
        return unitPrice;
    }

    public int getQuantity() {
        return quantity;
    }
    public static int getProductCount() {
        return productCount;
    }

    @Override
    public String toString() {
        return "Product{" + "code ='" + code + " " + ", name ='" + name + " " + ", unitPrice =" + unitPrice + ", quantity=" + quantity + ", inventoryValue =" + getInventoryValue() + '}';
    }
}

    public class Productinventory {
        public void main(String[] args) {
            Product product1 = new Product("P101", "Laptop", 55000);
            Product product2 = new Product("P102", "Mouse", 800, 20);
            Product product3 = new Product("P103", "Keyboard", 1500, 10);

            System.out.println("Initial Products:");
            System.out.println(product1);
            System.out.println(product2);
            System.out.println(product3);

            System.out.println("\nRestocking Laptop by 5:");
            System.out.println("Restock successful: " + product1.restock(5));

            System.out.println("\nSelling 3 Mouse:");
            System.out.println("Sale successful: " + product2.sell(3));

            System.out.println("Trying to sell 100 Keyboard:\n");
            System.out.println("Sale successful: " + product3.sell(100));

            System.out.println("\nUpdated Products:");
            System.out.println(product1);
            System.out.println(product2);
            System.out.println(product3);

            System.out.println("\nTotal products created: " + Product.getProductCount());
        }
}
}
