import java.util.ArrayList;
import java.util.List;

public class Inventory{
    public List<Books> books;
    public Inventory(){
        books= new ArrayList<>();
    }
    public void addBook(Books book){
        books.add(book);
        System.out.println("Book Added");
    }
    public void RemoveBooks(int years){
        int currentYear=java.time.Year.now().getValue();
        for (int i=0; i<books.size();){
            Books book=books.get(i);
            if ((currentYear - book.getYear()) > years){
                books.remove(i);
                System.out.println("Book Removed");
            }
            else
                i++;
        }
    }
    public double BuyBook(String ISBN,int quantity, String email, String address){
        Books f=null;
        for (Books book:books){
            if (book.getISBN().equals(ISBN)){
                f=book;
                break;
            }
        }
        if (f==null){
            throw new RuntimeException("Book Not found");
        }
        return f.buy(quantity,email,address);
    }
}
