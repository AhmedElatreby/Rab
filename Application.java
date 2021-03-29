
public class Application {
    public static void main(String[] args) {
        Book book = new Book();
        Newspaper np = new Newspaper();
        Magazine m = new Magazine();
        m.setTitle();
        m.setAuthor();
        

        book.Paper(15582);
        System.out.println(book.toString());

        System.out.println("----------------------------------");
        
        np.Paper(2222);
        System.out.println(np.toString());
        System.out.println("----------------------------------");
        System.out.print(m.getAuthor());
    }
}
