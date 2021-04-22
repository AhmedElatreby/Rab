package Code.Paper;

import Code.Availability;
import Code.Publication;
import Code.Publisher;
import Code.People.Author;

public abstract class Paper extends Publication {

    private int issue = 1;
    private int isbn;

    public Paper(int issue, int isbn, String title, int id, String edition, Author authorName) {
        super(title, id, edition, authorName);
        this.isbn = isbn;
        this.issue = issue;

    }

    // public Paper(String title, int id, String edition, Author author, Publisher
    // publisher, double price, Availability availability, String type) {
    // super(title, id, edition, author, publisher, availability);
    // this.isbn = isbn;
    // }

    /**
     * @return 
     * @return int
     */
    public int getIssue() {
        return this.issue;
    }

    /**
     * @param isbn
     */
    public int getIsbn() {
    return this.isbn;

    }
    

}
