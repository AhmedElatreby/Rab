package Code;

import java.util.Date;

import Code.People.Author;

public interface IPublication {

    public void setTitle();

    public int getID();

    public Availability getAvailability();

    public void setAvailability(Availability availability);

    public Date getReleaseDate();

    public Publisher getPublisher();

    public String getTitle();

    public String getReturnDate();

    public void setAuthor();

    public void setReturnDate(boolean returned);

    public Author getAuthor();

    public String getEdition();

    public void printDetails();

}
