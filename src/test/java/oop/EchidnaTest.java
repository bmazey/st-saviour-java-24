package oop;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Test;

import oop.mammals.Echidna;
import oop.mammals.Monotreme;

public class EchidnaTest {
    
    @Test
    public void testNewEchidna() {
        Echidna emmy = new Echidna("Emmy");
        
        emmy.layEgg("Knuckles");
        emmy.layEgg("Sonic");
        emmy.layEgg("Tails");

        // Try to hatch.
        Echidna knuckles;
        try {
            knuckles = emmy.hatch();
        } catch (Exception e) {
            knuckles = new Echidna("Wrong");
        }

        // Check knuckles instance.
        assertEquals("Knuckles", knuckles.getName());
        assert knuckles.isWarmBlooded();
        assert knuckles instanceof Echidna;

        // Check size of nest.
        assertEquals(2, emmy.getNest().size());

        // Assert type and properties of all eggs in nest.
        for (Monotreme egg : emmy.getNest()) {
            assert egg instanceof Animal;
            assert egg.isWarmBlooded();
        }

        // Clear the nest.
        try {
            emmy.hatch();
            emmy.hatch();
        } catch (Exception e) {
            fail("Unable to hatch.");
        }

        // Assert nest is empty.
        assert emmy.getNest().isEmpty();
    }
}
