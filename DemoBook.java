public class DemoBook extends Books{
    public DemoBook(String ISBN, String name, double price,int year,String author){
        super(ISBN,name,0.0,year,author);
    }

        @Override
        public boolean InStock() {
            return false;
        }

        @Override
        public double buy(int quantity, String email, String address) {
            throw new RuntimeException(" Not For Sale! ");
        }
    }
