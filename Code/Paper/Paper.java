package Code.Paper;

import Code.Availability;
import Code.IPublication;
import Code.Publication;
import Code.Publisher;
import Code.People.Author;

public abstract class Paper extends Publication {

    private int issue = 1;
    protected int isbn;

    public Paper(String title, int id, String edition, Author author, double price, Availability availability,
            Publisher publisher) {
        super(title, id, edition, author, availability, publisher, price);
        this.isbn = isbn;
    }

    public Paper(String title, int id, String edition, Author author, Publisher publisher, Availability availability,
            String type) {
        super(title, id, edition, author, availability, publisher, type);
        this.isbn = isbn;
    }

    /**
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
