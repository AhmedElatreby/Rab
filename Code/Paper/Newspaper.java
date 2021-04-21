package Code.Paper;

import java.util.Date;

import Code.Availability;
import Code.Publication;
import Code.Publisher;
import Code.People.Author;

public class Newspaper extends Paper {

    // private int age;

    public Newspaper(String title, int id, String edition, Author author, double price, Availability availability,
            Publisher publishe, int age) {
        super(title, id, edition, author, price, availability, publishe);
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
    public void setAuthor(String name) {

    }

    @Override
    public void printDetails() {

    }

    @Override
    public void setAuthor() {

    }

    @Override
    public Date getReleaseDate() {
        return null;
    }

    @Override
    public Author getAuthor() {
        return null;
    }

}
