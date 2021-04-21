package cookies;


/*Write this class to keep track of 2 pieces of instance data: variety of cookie and numBoxes purchased
        Create the constructor to handle this data and 2 accessor methods*/

public class CookieOrder {

    private int numBoxes;

public CookieOrder(String variety, int localNumBoxes) {
    this.numBoxes = localNumBoxes;

}
    public int getNumBoxes(){
        return this.numBoxes;
    }

}
