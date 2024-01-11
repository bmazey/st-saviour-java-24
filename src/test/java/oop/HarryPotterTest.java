package oop;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import oop.entertainment.Books;
import oop.entertainment.HarryPotter;

public class HarryPotterTest {
    @Test
    public void testNewHarryPotter() {
        HarryPotter chamber = new HarryPotter("Chamber of Secrets");
        
        // Checks that name is chamber of secrets
        assertEquals("Chamber of Secrets", chamber.getTitle());

        // Assert that Chamber of secrets is physical
        assertEquals(true, chamber.isPhysical());

        // Assert that Chamber of secrets is a book
        assert chamber instanceof Books;
    }
}
