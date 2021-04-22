package Code.Paper;

import java.util.Date;

import Code.Availability;
import Code.Publication;
import Code.Publisher;
import Code.People.Author;

public class Magazine extends Paper {

    private String type;

    public Magazine(String title, int id, String edition, Author authorName, Availability availability,
    Publisher publisher, double price, String type) {
        super(title, id, edition, authorName, publisher, price, availability, type);
        this.type = type;
    }

    public String getType(){
        return this.type;
    }

    @Override
    public Date getReleaseDate() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Author setAuthorName(Author authorName) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public Author getAuthorName() {
        // TODO Auto-generated method stub
        return null;
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
    public void setReturnDate(boolean returned) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public Author getAuthorName() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void printDetails() {
        // TODO Auto-generated method stub
        
    }

    
}
