package OnlineShopping;

public class Cust {
    private String name;
    private String phone;
    private KeranjangKuning cart;

    public Cust(String name, String phone) {
        this.name = name;
        this.phone = phone;
        this.cart = new KeranjangKuning();
    }

    public void addToCart(Product product, int quantity) {
        cart.addItem(product, quantity);
    }

    public void viewCart() {
        cart.viewItems();
    }

    public void checkout() {
        System.out.println("Halo, " + name + " (" + phone + ")!");
        System.out.println("Pesanan Anda telah dibuat:");
        cart.viewItems();
        System.out.printf("%-40s  %7s   Rp %,d%n", "Total", "", (int) cart.getTotalPrice());
        System.out.println("Terima kasih telah berbelanja!");
    }
}
