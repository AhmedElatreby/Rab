package Code;
public abstract class Paper implements IPublication {
    private int isbn;

    
    /** 
     * @param isbn
     */
    public void Paper(int isbn) {
        this.isbn = isbn;

    }

}
