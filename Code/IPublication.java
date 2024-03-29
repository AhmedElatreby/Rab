package Code;

import java.util.Date;

import Code.People.Author;

public interface IPublication {

    public void setTitle();

    public int getIssue();

    public int getID();

    public Availability getAvailability();

    public void setAvailability(Availability availability);

    public Date getReleaseDate();

    public Publisher getPublisher();

    public String getTitle();

    public String getReturnDate();

    public Author setAuthorName(Author authorName);

    public void setReturnDate(boolean returned);

    public Author getAuthorName();

    public String getEdition();

    public void printDetails();

    public int getPrice();

}
