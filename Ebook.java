public class Ebook extends Books{
        private String filetype;
        public Ebook(String ISBN, String name, int year, double price, String author, String filetype){
            super(ISBN,name,price,year,author);
            this.filetype=filetype;
        }
        public boolean InStock(){
            return true;
        }

        @Override
        public double buy(int quantity, String email, String address) {
            if (quantity!=1){
                throw new RuntimeException("You can't buy more then 1 book");
            }
            System.out.println("MailService will send book to:"+email);
            return price;
        }
    }
