package music;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

import oop.music.Electronic;
import oop.music.Hiphop;
import oop.music.Music;
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
    public void testElectronic() {
        Electronic Vanished = new Electronic("Vanished", 4, "Crystal Castles");

        assertEquals("Raina listens to Vanished by Crystal Castles for 4 minutes.", Vanished.listen("Raina"));
    }
    @Test
    public void testHiphop() {
        Hiphop ElectricRelaxation = new Hiphop("Electric Relaxation", 4, "A Tribe Called Quest");

        assertEquals("Giovanna listens to Electric Relaxation by A Tribe Called Quest for 4 minutes.", ElectricRelaxation.listen("Giovanna"));
    }
    @Test
    public void testGenre() {
        ArrayList<Music> Genres = new ArrayList<Music>();
        
        Hiphop ElectricRelaxation = new Hiphop("Electric Relaxation", 4, "A Tribe Called Quest");
        Rock SmellsLikeTeenSpirit = new Rock("Smells Like Teen Spirit", 4, "Nirvana");
        Pop WeFoundLove = new Pop("We Found Love", 3, "Rihanna");

        Genres.add(ElectricRelaxation);
        Genres.add(SmellsLikeTeenSpirit);
        Genres.add(WeFoundLove);

        String title = Genres.get(Genres.size() - 1).getTitle();

        assert title.equals("We Found Love");

        // assert Genre instanceof Music;

        // assertEquals("All genres are music", this.genre);
    }
}
