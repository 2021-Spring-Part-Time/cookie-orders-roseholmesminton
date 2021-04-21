package cookies;


import java.util.Scanner;

public class OrderApp {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //  Add 4 orders
        MasterOrder myOrder = new MasterOrder();
        myOrder.addOrder(new CookieOrder("Tagalongs", 1));
        myOrder.addOrder(new CookieOrder("Thin Mints", 5));
        myOrder.addOrder(new CookieOrder("Samoas", 2));
        myOrder.addOrder(new CookieOrder("Tagalongs", 3));
        //Show the list
        System.out.println("Current Order");
        myOrder.showOrder();

        // Total the boxes purchased
        System.out.println();
        System.out.println("You have ordered " + myOrder.getTotalBoxes() + " boxes");
        System.out.println();
        // Remove a variety and give feedback on how many boxes were removed
        System.out.println("What would you like to remove? (specify a variety or none)");
        String varietyToRemove = input.nextLine();
        System.out.println("You are removing " + myOrder.getVarietyBoxes(varietyToRemove) + " " + varietyToRemove);
        myOrder.removeVariety(varietyToRemove);
        //Show the updated list
        System.out.println("Current Order");
        myOrder.showOrder();
        System.out.println();
    }
}


//Stretch
//Try doing live adds, removals and updates to your order, you will need a loop and some user input

//Stretchier
/*Specify a variety of cookie you want to remove and exactly how many boxes need to be removed
(now you are dealing with 2 parameters(requirements))
 */