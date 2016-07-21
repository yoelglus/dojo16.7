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
    public void rockBeatsRockReturnsNull() throws Exception {
        assertBeatsItselfReturnNull(rock);
    }

    @Test
    public void rockBeatsScissors() throws Exception {
        assertThat(rock.beats(scissors), is(true));
    }

    @Test
    public void rockLosesToPaper() throws Exception {
        assertThat(rock.beats(paper), is(false));
    }

    @Test
    public void rockLosesToSpock() throws Exception {
        assertThat(rock.beats(spock), is(false));
    }

    @Test
    public void rockBeatsLizard() throws Exception {
        assertThat(rock.beats(lizard), is(true));
    }

    @Test
    public void paperBeatsPaperReturnsNull() throws Exception {
        assertBeatsItselfReturnNull(paper);
    }

    @Test
    public void paperBeatsRock() throws Exception {
        assertThat(paper.beats(rock), is(true));
    }

    @Test
    public void paperLosesToScissors() throws Exception {
        assertThat(paper.beats(scissors), is(false));
    }

    @Test
    public void paperBeatsSpock() throws Exception {
        assertThat(paper.beats(spock), is(true));
    }

    @Test
    public void paperLosesToLizard() throws Exception {
        assertThat(paper.beats(lizard), is(false));
    }

    @Test
    public void scissorsBeatsScissorsReturnsNull() throws Exception {
        assertBeatsItselfReturnNull(scissors);
    }

    @Test
    public void scissorsBeatsPaper() throws Exception {
        assertThat(scissors.beats(paper), is(true));
    }

    @Test
    public void scissorsLosesToRock() throws Exception {
        assertThat(scissors.beats(rock), is(false));
    }

    @Test
    public void scissorsLosesToSpock() throws Exception {
        assertThat(scissors.beats(spock), is(false));
    }

    @Test
    public void scissorsBeatsLizard() throws Exception {
        assertThat(scissors.beats(lizard), is(true));
    }

    @Test
    public void spockVsSpockReturnNull() throws Exception {
        assertBeatsItselfReturnNull(spock);
    }

    @Test
    public void spockBeatsScissors() throws Exception {
        assertThat(spock.beats(scissors), is(true));
    }

    @Test
    public void spockBeatsRock() throws Exception {
        assertThat(spock.beats(rock), is(true));
    }

    @Test
    public void spockLosesToPaper() throws Exception {
        assertThat(spock.beats(paper), is(false));
    }

    @Test
    public void spockLosesToLizard() throws Exception {
        assertThat(spock.beats(lizard), is(false));
    }

    @Test
    public void lizardVsLizardReturnNull() throws Exception {
        assertBeatsItselfReturnNull(lizard);
    }

    @Test
    public void lizardLosesToRock() throws Exception {
        assertThat(lizard.beats(rock), is(false));
    }

    @Test
    public void lizardLosesToScissors() throws Exception {
        assertThat(lizard.beats(scissors), is(false));
    }

    @Test
    public void lizardBeatsPaper() throws Exception {
        assertThat(lizard.beats(paper), is(true));
    }

    @Test
    public void lizardBeatsSpock() throws Exception {
        assertThat(lizard.beats(spock), is(true));
    }

    private void assertBeatsItselfReturnNull(Thing thing) {
        assertThat(thing.beats(thing), is(nullValue()));
    }
}
