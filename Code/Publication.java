package Code;
public abstract class Publication implements IPublication {
    private String title, author;
    private double price;

    protected Publication(String title, String author, double price) {

        this.title = title;
        this.author = author;
        this.price = price;
    }

    public void setTitle() {
        this.title = title;
    }

    
    /** 
     * @return String
     */
    public String getTitle() {
        return this.title;
    }

    
    /** 
     * @param name
     */
    public void setAuthor(String name) {
        this.author = author;
    }

    
    /** 
     * @return String
     */
    public String getAuthor() {
        return this.author;
    }

    public void printDetails() {
        System.out.println(getTitle() + ". " + "£" + price);

    }

    
    /** 
     * @return String
     */
    public String details() {
        return String.format("%nPaper Name: %s%nAuther Name: %s%nPrice: £%s", this.title, this.author, this.price);

    }
}
