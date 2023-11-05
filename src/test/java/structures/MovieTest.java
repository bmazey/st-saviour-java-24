package structures;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class MovieTest {

    @Test
    public void testMovieQueue() {
        // create a new Movie Queue
        Movie FiveNightsAtFreddys = new Movie();

        // add a patron to the Patron Queue
        FiveNightsAtFreddys.enqueue("Freddy Fazbear");

        // ensure Patrons queue is not empty
        assertEquals(false, FiveNightsAtFreddys.isEmpty());

        // add more patrons to the Patrons queue
        FiveNightsAtFreddys.enqueue("Bonnie");
        FiveNightsAtFreddys.enqueue("Chica");
        FiveNightsAtFreddys.enqueue("Foxy");

        // ensure Freddie is still in front & Foxy is last
        assertEquals("Freddy Fazbear", FiveNightsAtFreddys.first());
        assertEquals("Foxy", FiveNightsAtFreddys.last());

        // start admitting patrons to the movie
        assertEquals("Freddy Fazbear", FiveNightsAtFreddys.dequeue());
        assertEquals("Bonnie", FiveNightsAtFreddys.dequeue());

        // ensure that Chica is next & Foxy is still last
        assertEquals("Chica", FiveNightsAtFreddys.first());
        assertEquals("Foxy", FiveNightsAtFreddys.last());

        // admit all patrons in line
        assertEquals("Chica", FiveNightsAtFreddys.dequeue());
        assertEquals("Foxy", FiveNightsAtFreddys.dequeue());

        // ensure no patrons are left in queue
        assertEquals(true, FiveNightsAtFreddys.isEmpty());
    }  
}
