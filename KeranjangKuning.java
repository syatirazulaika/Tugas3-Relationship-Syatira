package OnlineShopping;

import java.util.ArrayList;
import java.util.List;

public class KeranjangKuning {
    private List<Wishlist> items;

    public KeranjangKuning() {
        this.items = new ArrayList<>();
    }

    public void addItem(Product product, int quantity) {
        items.add(new Wishlist(product, quantity));
    }

    public void viewItems() {
        System.out.println("=== Keranjang Belanja ===");
        for (Wishlist item : items) {
            System.out.printf("%-40s | %2d pcs | Rp %,d%n", 
                item.getProduct().getName(), 
                item.getQuantity(), 
                (int)(item.getProduct().getPrice() * item.getQuantity())
            );
        }
        System.out.println("=========================");
    }

    public double getTotalPrice() {
        double total = 0;
        for (Wishlist item : items) {
            total += item.getProduct().getPrice() * item.getQuantity();
        }
        return total;
    }
}
