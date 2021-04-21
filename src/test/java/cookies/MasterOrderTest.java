package cookies;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class MasterOrderTest {

    @Test
    public void shouldReturnTotalBoxesOfOne() {
        MasterOrder underTest = new MasterOrder();
        CookieOrder cookieOrderTest = new CookieOrder("", 1);
        underTest.addOrder(cookieOrderTest);
        int check = underTest.getTotalBoxes();

        assertThat(check , is(1));
    }
    @Test
    public void shouldReturnTotalBoxesOfTwo() {
     MasterOrder underTest = new MasterOrder();
        CookieOrder cookieOrderTest = new CookieOrder("", 1);
        CookieOrder cookieOrderTest2 = new CookieOrder("",1);
        underTest.addOrder(cookieOrderTest);
        underTest.addOrder(cookieOrderTest2);
        int check = underTest.getTotalBoxes();

        assertThat(check , is(2));
    }
    @Test
    public void shouldReturnTotalBoxesAsOneAfterRemoval(){
        MasterOrder underTest = new MasterOrder();
        CookieOrder cookieOrderTest = new CookieOrder("thin mints", 1);
        CookieOrder cookieOrderTest2 = new CookieOrder("samoas",1);
        underTest.addOrder(cookieOrderTest);
        underTest.addOrder(cookieOrderTest2);
        underTest.removeVariety("thin mints");
        int check = underTest.getTotalBoxes();

        assertThat(check, is(1));
    }
    @Test
    public void shouldReturnTotalBoxesAsOneAfterRemovalOfTwoThinMintsOrders(){
        MasterOrder underTest = new MasterOrder();
        CookieOrder cookieOrderTest = new CookieOrder("thin mints", 1);
        CookieOrder cookieOrderTest2 = new CookieOrder("samoas",1);
        CookieOrder cookieOrderTest3 = new CookieOrder("thin mints", 3);
        underTest.addOrder(cookieOrderTest);
        underTest.addOrder(cookieOrderTest2);
        underTest.addOrder(cookieOrderTest3);
        underTest.removeVariety("thin mints");
        int check = underTest.getTotalBoxes();

        assertThat(check, is(1));
    }

    @Test
    public void shouldReturnTotalOfFourForThinMints(){
        MasterOrder underTest = new MasterOrder();
        CookieOrder cookieOrderTest = new CookieOrder("thin mints", 3);
        CookieOrder cookieOrderTest2 = new CookieOrder("samoas",1);
        CookieOrder cookieOrderTest3 = new CookieOrder("thin mints", 1);
        underTest.addOrder(cookieOrderTest);
        underTest.addOrder(cookieOrderTest2);
        underTest.addOrder(cookieOrderTest3);
        int check = underTest.getVarietyBoxes("thin mints");

        assertThat(check, is(4));
    }
}