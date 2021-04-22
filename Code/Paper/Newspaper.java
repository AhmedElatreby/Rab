package Code.Paper;

import java.util.Date;

import Code.Availability;
import Code.Publication;
import Code.Publisher;
import Code.People.Author;

public class Newspaper extends Paper {

    // private int age;

    public Newspaper(String title, int id, String edition, Author authorName, double price, Availability availability,
            Publisher publishe, int age) {
        super(title, id, edition, authorName, price, availability, publishe);
        // this.age = age;
    }

    // public int getAge() {
    //     return this.age;
    // }

    // public void setAge(int age) {
    //     this.age = age;
    // }

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

    /**
     * @param name
     */
    @Override
    public Author setAuthorName(Author authorName) {

    }

    @Override
    public void printDetails() {

    }


    @Override
    public Date getReleaseDate() {
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

}
