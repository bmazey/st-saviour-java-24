package music;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import oop.music.Hiphop;
import oop.music.Pop;
import oop.music.Rock;

public class MusicTest {

    @Test
    public void testPop() {
        Pop WeFoundLove = new Pop("We Found Love", 3, "Rihanna");

        assertEquals("Raina listens to We Found Love by Rihanna for 3 minutes.", WeFoundLove.listen("Raina"));
    }

    @Test
    public void testRock() {
        Rock SmellsLikeTeenSpirit = new Rock("Smells Like Teen Spirit", 4, "Nirvana");

        assertEquals("Giovanna listens to Smells Like Teen Spirit by Nirvana for 4 minutes.", SmellsLikeTeenSpirit.listen("Giovanna"));
    }

    @Test
    public void testHiphop() {
        Hiphop ElectricRelaxation = new Hiphop("Electric Relaxation", 4, "A Tribe Called Quest");

        assertEquals("Giovanna listens to Electric Relaxation by A Tribe Called Quest for 4 minutes.", ElectricRelaxation.listen("Giovanna"));
    }
}
