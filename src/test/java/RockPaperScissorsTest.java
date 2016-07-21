import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.nullValue;
import static org.junit.Assert.assertThat;

public class RockPaperScissorsTest {

    private Thing rock;
    private Thing paper;
    private Thing scissors;
    private Thing spock;
    private Thing lizard;

    @Before
    public void setUp() throws Exception {
        GameLogic gameLogic = new GameLogic();
        rock = new Rock(gameLogic);
        paper = new Paper(gameLogic);
        scissors = new Scissors(gameLogic);
        spock = new Spock(gameLogic);
        lizard = new Lizard(gameLogic);
    }

    @Test
    public void draw_if_two_of_the_same_sign() throws Exception {
        assertDrawIfTwoOf(rock, paper, scissors, lizard, spock);
    }

    @Test
    public void scissors_cuts_paper() throws Exception {
        assertBeats(scissors, paper);
    }

    @Test
    public void paper_covers_rock() throws Exception {
        assertBeats(paper, rock);
    }

    @Test
    public void rock_crashes_lizard() throws Exception {
        assertBeats(rock, lizard);
    }

    @Test
    public void lizard_poisons_spock() throws Exception {
        assertBeats(lizard, spock);
    }

    @Test
    public void spock_smashes_scissors() throws Exception {
        assertBeats(spock, scissors);
    }

    @Test
    public void scissors_decapitates_lizard() throws Exception {
        assertBeats(scissors, lizard);
    }

    @Test
    public void lizard_eats_paper() throws Exception {
        assertBeats(lizard, paper);
    }

    @Test
    public void paper_disproves_spock() throws Exception {
        assertBeats(paper, spock);
    }

    @Test
    public void spock_vaporizes_rock() throws Exception {
        assertBeats(spock, rock);
    }

    @Test
    public void rock_blunts_scissors() throws Exception {
        assertBeats(rock, scissors);
    }

    private static void assertBeats(Thing first, Thing second) {
        assertThat(first.beats(second), is(true));
    }

    private static void assertDrawIfTwoOf(Thing... things) {
        for (Thing thing: things) {
            assertThat(thing.beats(thing), is(nullValue()));
        }
    }
}
