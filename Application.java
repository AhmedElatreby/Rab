import Code.Paper.Book;
import Code.Paper.Magazine;
import Code.Paper.Newspaper;
import Code.People.Author;

public class Application {
    
    /** 
     * @param args
     */
    public static void main(String[] args) {
        Book book = new Book("title", 10, 1, "author", 1.3, true, "publishe", 11);
        Newspaper np = new Newspaper("the sun", 1, "1st", "Rab", .99, true, "NP", 16);
        Magazine m = new Magazine("the sun", 1, "1st", "Rab", .99, true, "NP", 16, "sport");
        Author a = new Author("authorName", "10-05-1981");
        // m.setTitle();
        m.setAuthor("ss");
        
        

        System.out.println(book.details());

        System.out.println("----------------------------------");
        
        System.out.println(np.details());
        System.out.println("----------------------------------");
        System.out.println(m.details());
        System.out.println("----------------------------------");
        System.out.println(a.getAuthor());
    }
}
