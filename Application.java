
public class Application {
    public static void main(String[] args) {
        Book book = new Book(null, null, 0);
        Newspaper np = new Newspaper(null, null, 0);
        Magazine m = new Magazine(null, null, 0);
        m.setTitle();
        m.setAuthor();
        
        

        System.out.println(book.details());

        System.out.println("----------------------------------");
        
        System.out.println(np.details());
        System.out.println("----------------------------------");
        System.out.print(m.getAuthor());
    }
}
