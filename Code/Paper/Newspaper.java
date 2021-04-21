package Code.Paper;

import java.util.Date;

import Code.Availability;
import Code.Publication;
import Code.Publisher;
import Code.People.Author;

public class Newspaper extends Paper {

    private int age;

    public Newspaper(String title, int id, String edition, Author author, double price, Availability availability,
            Publisher publishe, int age) {
        super(title, id, edition, author, price, availability, publishe, age);
        this.age = age;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public void setTitle() {
        // TODO Auto-generated method stub

    }

    /**
     * @return String
     */
    @Override
    public String getTitle() {
        // TODO Auto-generated method stub
        return null;
    }

    /**
     * @param name
     */
    @Override
    public void setAuthor(String name) {
        // TODO Auto-generated method stub

    }

    @Override
    public void printDetails() {
        // TODO Auto-generated method stub

    }

    @Override
    public void setAuthor() {
        // TODO Auto-generated method stub

    }

    @Override
    public Date getReleaseDate() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Author getAuthor() {
        // TODO Auto-generated method stub
        return null;
    }

}
