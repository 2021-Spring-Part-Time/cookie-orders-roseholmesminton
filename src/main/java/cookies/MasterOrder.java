package cookies;

 /*Declare your ArrayList and name it orders
        Create an empty constructor and the following methods*/

import java.util.ArrayList;
import java.util.List;

public class MasterOrder {
    List<CookieOrder> orders = new ArrayList<>();

    public void addOrder(CookieOrder cookieOrder) {
        orders.add(cookieOrder);
    }

    public int getTotalBoxes() {
        int boxes = 0;
        for (CookieOrder order : orders) {
            boxes += order.getNumBoxes();
        }
        return boxes;
    }

    public void removeVariety(String variety) {
        for (int i = orders.size() - 1; i >= 0; i--) {
            if (orders.get(i).getVariety().equals(variety)) {
                orders.remove(i);
            }

        }
    }
}



