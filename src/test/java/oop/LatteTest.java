package oop;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Test;

import oop.beverages.Latte;
import oop.beverages.Coffee;

public class LatteTest {

    /*
     * This creates a new class to test the latte class. 
     */
    @Test
    public void testNewLatte() {
        Latte sweet = new Latte("Sweet");

        sweet.PlaceOrder("Peppermint");
        sweet.PlaceOrder("Caramel");
        sweet.PlaceOrder("Almond");

        /*
         * The try function attempts to take the peppermint order off the queue/order list.
         * It catches the exception (C)
         */
        // Latte peppermint;
        // try {
        //     peppermint = sweet.TakeOrder();
        // } catch (Exception a) {
        //     peppermint = new Latte("Fail");
        // }

        /*
         * Asserts sweet (peppermint) as an instance of a Latte
         */
        // assertEquals("Peppermint", sweet.getFlavor());
        // assert sweet.isCaffinated();
        // assert sweet instanceof Latte;

        /*
         * This function checks the size of the order list after peppermint is removed.
         */
        assertEquals(3, sweet.getOrder().size());

        /*
         * Asserts the type and properties of all drinks in the order list.
         */
        for (Coffee order : sweet.getOrder()) {
            assert order instanceof Latte;
            assert order.isCaffinated();
        }

        try{
            sweet.TakeOrder();
            sweet.TakeOrder();
            sweet.TakeOrder();
        } catch (Exception a) {
            fail("There are no orders.");
        }

        assert sweet.getOrder().isEmpty();
    }
}
