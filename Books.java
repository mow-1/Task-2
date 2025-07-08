public abstract class Books{
    public String ISBN;
    public String name;
   public double price;
   public int year;
    public String author;
    public Books(String ISBN,String name,double price,int year,String author)
    {
        this.ISBN=ISBN;
        this.name=name;
        this.price=price;
        this.year=year;
        this.author=author;
    }
    public String getISBN(){
        return ISBN;
    }
    public int getYear(){
        return year;
    }
    public abstract boolean InStock();
    public abstract double buy(int quantity,String email, String address);
}
