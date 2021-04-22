package Code.Paper;

import java.util.Date;

import Code.Availability;
import Code.Publication;
import Code.Publisher;
import Code.People.Author;

public class Book extends Paper {
    private String review;

    public Book(String review, int issue, int isbn, String title, int id, String edition, Author authorName) {
        super(issue, isbn, title, id, edition, authorName);
        this.review = review;
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

    // @Override
    // public void setAuthorName() {

    // }

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

    public String getReview() {
        return this.review;
    }

    @Override
    public Availability getAvailability() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void setAvailability(Availability availability) {
        // TODO Auto-generated method stub

    }

    @Override
    public Publisher getPublisher() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public String getReturnDate() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public String getEdition() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Author getAuthorName() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void setAuthor() {
        // TODO Auto-generated method stub
        
    }

}