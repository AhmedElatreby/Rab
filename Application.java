import Code.Book;
import Code.Magazine;
import Code.Newspaper;

public class Application {
    
    /** 
     * @param args
     */
    public static void main(String[] args) {
        Book book = new Book("book", "book", 2.0);
        Newspaper np = new Newspaper("Newspaper", "Newspaper", 2.0);
        Magazine m = new Magazine("Magazine", "Magazine", 2.0);
        // m.setTitle();
        m.setAuthor("ss");
        
        

        System.out.println(book.details());

        System.out.println("----------------------------------");
        
        System.out.println(np.details());
        System.out.println("----------------------------------");
        System.out.println(m.details());
        System.out.println(m.getAuthor());
    }
}
