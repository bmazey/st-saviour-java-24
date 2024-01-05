package oop;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import oop.entertainment.Books;
import oop.entertainment.HarryPotter;

public class HarryPotterTest {
    @Test
    public void testNewHarryPotter() {
        HarryPotter chamber = new HarryPotter("Chamber of Secrets");
        
        // checks that the name is chamber of secrets
        assertEquals("Chamber of Secrets", chamber.getTitle());

        // checks if it is physical
        assertEquals(true, chamber.isPhysical());

        // Assert that it is a book
        assert chamber instanceof Books; 
        
    }
}
