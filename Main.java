package OnlineShopping;

public class Main {
    public static void main(String[] args) {
        Product satu = new Product("CARASUN - Solar Smart UV Sunscreen", 62000);
        Product dua = new Product("DEOREX - Body Odorizer Spray", 83000);
        Product tiga = new Product("Cadbury Dairy Milk Cokelat", 22000);

        Cust customer = new Cust("Syatira", "08123456789");
        customer.addToCart(satu, 1);
        customer.addToCart(dua, 1);
        customer.addToCart(tiga, 5);

        customer.checkout();
    }
}
