package Code;

import java.util.Date;

import Code.People.Author;
import Code.Paper.Book;

public abstract class Publication implements IPublication {

    // create variables
    private String title;
    private int id;
    protected String edition;
    private double price;
    // private Author authorName;
    // private Availability availability;
    // protected static Publisher publisher;
    // private Date returnDate = null;

    public Publication(String title, int id, String edition,double price)
    // , double price, Availability availability,
    // Publisher publisher)
    {

        this.title = title;
        this.id = id;
        this.edition = edition;
        this.price = price;
        // this.authorName = authorName;
        // this.availability = availability;
        // this.publisher = publisher;
    }

    // // Overloading
    // public Publication(String title, int id, Availability availability, Publisher
    // publisher) {
    // this.title = title;
    // this.id = id;
    // this.availability = availability;
    // this.publisher = publisher;
    // }

    /**
     * @return String
     */
    @Override
    public String getTitle() {
        return this.title;
    }

    /**
     * @return int
     */
    public int getID() {
        return this.id;
    }

    /**
     * @return String
     */
    public String getEdition() {
        return this.edition;
    }

    // /**
    // * @return String
    // // */
    // public Author getAuthor() {
    //     return this.authorName;
    // }

    // /**
    // * @return Availability
    // */
    // public Availability getAvailability() {
    // return this.availability;
    // }

    // /**
    // * @return Publisher
    // */
    // public Publisher getPublisher() {
    // return this.publisher;
    // }

    // /**
    // * @return String
    // */
    // public String getReturnDate() {
    // return "Return Date: " + this.returnDate;
    // }

    public void setTitle() {
        this.title = title;
    }

    /**
     * @param name
     * @return 
    //  */
    // public Author setAuthorName(Author authorName) {
    //     return this.authorName = authorName;
    // }

    // /**
    // * @param availability
    // */
    // public void setAvailability(Availability availability) {
    // if (availability == Availability.BORROWED || availability ==
    // Availability.RESERVED) {
    // this.setReturnDate(false);
    // }

    // else {
    // this.setReturnDate(true);
    // }
    // }

    // /**
    // * @param returned
    // */
    // public void setReturnDate(boolean returned) {
    // this.returnDate = null;
    // }

    public void printDetails() {
    System.out.println(getTitle() + ". " + "£" + price);

    }

    public int getPrice(){
        System.out.println("£" + price);
        return id;
    }

    /**
     * @return String
     */
    public String details() {
        return String.format("%nEdition: %s%nIssue number: %s%nPaper Name: %s%nID Number: %s%nPrice: ", this.edition,
                this.getIssue(), this.edition, this.title, this.id, this.getPrice());

    }
}
