package Code.Paper;

import java.util.Date;

import Code.Availability;
import Code.Publication;
import Code.Publisher;
import Code.People.Author;

public class Magazine extends Paper {

    private String type;

    public Magazine(String title, int id, String edition, Author author, Availability availability,
    Publisher publisher, double price, String type) {
        super(title, id, edition, author, publisher, price, availability, type);
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
    public void setAuthor() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public Author getAuthor() {
        // TODO Auto-generated method stub
        return null;
    }

    
}
