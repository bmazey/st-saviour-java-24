package oop;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import oop.beverages.Cappuccino;
import oop.beverages.Coffee;

public class CappuccinoTest {
/*
 * This creates a new class to test the class Cappuccino.
 */
    @Test
    public void testNewCappuccino() {
        /*
         * This test checks the flavor of the Cappuccino.
         */
        Cappuccino mocha = new Cappuccino("Mocha");

        /*
         * This test adds an order of mocha to the queue/order list.
         */
        assertEquals("Mocha", mocha.getFlavor());

        /*
         * This test checks the size of the queue/order list.
         */
        assertEquals(0, mocha.getOrder().size());

        /*
         * This test checks if the mocha cappuccion is caffinated.
         */
        assertEquals(true, mocha.isCaffinated());

        /*
         * This test declares mocha an instance of a coffee.
         */
        assert mocha instanceof Coffee;

        /*
         * This test checks if the smell variable follows. Someone is smelling the drink.
         */
        assertEquals("Mocha smells like Chocolate!", mocha.smell("Chocolate"));

    }
}
