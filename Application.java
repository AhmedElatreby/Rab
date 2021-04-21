import Code.Paper.Book;
import Code.Paper.Magazine;
import Code.Paper.Newspaper;
import Code.People.Author;

public class Application {
    
    /** 
     * @param args
     */
    public static void main(String[] args) {
        Book book = new Book("title", 1, "edition", "author", 1, true, "publishe");
        Newspaper np = new Newspaper("the sun", 1, "1st", "Rab", .99, true, "NP");
        Magazine m = new Magazine("the sun", 1, "1st", "Rab", .99, true, "NP", "sport");
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
