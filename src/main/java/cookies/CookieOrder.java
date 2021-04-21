package cookies;


/*Write this class to keep track of 2 pieces of instance data: variety of cookie and numBoxes purchased
        Create the constructor to handle this data and 2 accessor methods*/

public class CookieOrder {

    private int numBoxes;
    private String variety;

public CookieOrder(String localVariety, int localNumBoxes) {
    this.numBoxes = localNumBoxes;
    this.variety = localVariety;

}
    public int getNumBoxes(){
        return this.numBoxes;
    }

    public String getVariety() {
    return this.variety;
    }
}
