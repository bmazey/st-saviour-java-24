package oop;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Test;

import oop.beverages.Latte;
import oop.beverages.Coffee;

public class LatteTest {

    /**
     * This creates a new class to test the latte class. 
     */
    @Test
    public void testNewLatte() {
        Latte sweet = new Latte("Sweet");

        sweet.PlaceOrder("Peppermint");
        sweet.PlaceOrder("Caramel");
        sweet.PlaceOrder("Almond");

        /**
         * This function checks the size of the order list after peppermint is removed.
         */
        assertEquals(3, sweet.getOrder().size());

        /**
         * Asserts the type and properties of all drinks in the order list.
         */
        for (Coffee order : sweet.getOrder()) {
            assert order instanceof Latte;
            assert order.isCaffeinated();
        }

        /**
         * Try removes all orders from the order list and catches the error if the list is empty.
         */
        try{
            sweet.TakeOrder();
            sweet.TakeOrder();
            sweet.TakeOrder();
        } catch (Exception a) {
            fail("There are no orders.");
        }

        /**
         * Returns true or false if the order list is empty.
         */
        assert sweet.getOrder().isEmpty();
    }
}
