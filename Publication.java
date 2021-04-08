public abstract class Publication implements IPublication {
    private String title, author;
    private double price;

    public Publication(String title, String author, double price) {

        this.title = title;
        this.author = author;
        this.price = price;
    }

    public void setTitle() {
        this.title = title;
    }

    public String getTitle() {
        return this.title;
    }

    public void setAuthor() {
        this.author = author;
    }

    public String getAuthor() {
        return this.author;
    }

    public void printDetails() {
        System.out.println(getTitle() + ". " + "£" + price);

    }

    public String details() {
        return String.format("%nPaper Name: %s%nAuther Name: %s%nPrice: £%s", this.title, this.author, this.price);

    }
}
