package oop;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import oop.entertainment.books;
import oop.mammals.Mammal;
import oop.mammals.Platypus;
import oop.entertainment.HarryPotter;

public class HarryPotterTest {
    @Test
    public void testNewHarryPotter() {
        HarryPotter chamber = new HarryPotter("Chamber of Secrets");
        
        // First check name.
        assertEquals("Chamber of Secrets", chamber.getCreative());

        // Check default size of nest.
        assertEquals(0, chamber.getStory().size());

        // Assert that Perry is warm-blooded.
        assertEquals(true, chamber.isPhysical());

        // Assert that Perry is a Mammal
        assert chamber instanceof books;
    }
}
