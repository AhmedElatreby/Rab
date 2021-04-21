package Code.Paper;

import java.util.Date;

import Code.Availability;
import Code.Publication;
import Code.Publisher;
import Code.People.Author;

public class Book extends Paper {

    public Book(String title, int id, String edition, Author author, double price, Availability availability,
    Publisher publishe, int age) {
        super(title, id, author, price, availability, publisher);
    }

    @Override
    public void setTitle() {

    }

    /**
     * @return String
     */
    @Override
    public String getTitle() {
        return null;
    }

    @Override
    public void setAuthor() {

    }

    @Override
    public void printDetails() {

    }

    @Override
    public Date getReleaseDate() {
        return null;
    }

    @Override
    public void setReturnDate(boolean returned) {

    }

    @Override
    public Author getAuthor() {
        return null;
    }

}