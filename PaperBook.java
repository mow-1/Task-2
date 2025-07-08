import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class PaperBook extends Books {
    private int stock;

    public PaperBook(String ISBN, String name, int year, double price, String author, int stock) {
        super(ISBN, name, price, year, author);
        this.stock = stock;
    }

    @Override
    public boolean InStock() {
        return stock > 0;
    }

    @Override
    public double buy(int quantity, String email, String address) {
        if (quantity > stock) {
            throw new RuntimeException(" Out of Stock");
        }
        stock = stock - quantity;
        System.out.println("Book Will be shipped to: " + address);
        return price * quantity;
    }
}

