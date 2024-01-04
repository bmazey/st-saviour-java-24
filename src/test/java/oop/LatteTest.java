package oop;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Test;

import oop.beverages.Latte;
import oop.beverages.Coffee;

public class LatteTest {
    @Test
    public void testNewLatte() {
        Latte sweet = new Latte("Sweet");

        sweet.PlaceOrder("Peppermint");
        sweet.PlaceOrder("Caramel");
        sweet.PlaceOrder("Almond");

        Latte peppermint;
        try {
            peppermint = sweet.TakeOrder();
        } catch (Exception a) {
            peppermint = new Latte("Placeholder");
        }

        assertEquals("Peppermint", peppermint.getFlavor());
        assert peppermint.isCaffinated();
        assert peppermint instanceof Latte;

        assertEquals(2, sweet.getOrder().size());

        for (Coffee order : sweet.getOrder()) {
            assert order instanceof Latte;
            assert order.isCaffinated();
        }

        try{
            sweet.TakeOrder();
            sweet.TakeOrder();
        } catch (Exception a) {
            fail("There are no orders.");
        }

        assert sweet.getOrder().isEmpty();
    }
}
