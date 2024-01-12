package oop.beverages;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import oop.beverages.Cappuchino;
import oop.beverages.Coffee;

public class CappuccinoTest {
/**
 * This creates a new class to test the class Cappuccino.
 */
    @Test
    public void testNewCappuccino() {
        /**
         * This test checks the flavor of the Cappuccino.
         */
        Cappuchino mocha = new Cappuchino("Mocha");

        /**
         * This test adds an order of mocha to the order list.
         */
        assertEquals("Mocha", mocha.getFlavor());

        /**
         * This test checks the size of the order list.
         */
        assertEquals(0, mocha.getOrder().size());

        /**
         * This test checks if the mocha is caffinated.
         */
        assertEquals(true, mocha.isCaffienated());

        /**
         * This test declares mocha an instance of a coffee.
         */
        assert mocha instanceof Coffee;

        /**
         * This test checks if the mocha has a smell.
         */
        assertEquals("Mocha smells chocolatey!", mocha.smell("chocolatey"));

        Cappuchino americano = new Cappuchino("Americano");

        assert americano.getFlavor().equals("Americano");

        assert americano.smell("bitter").equals("Americano smells bitter!");

    }
}