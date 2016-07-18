import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.nullValue;
import static org.junit.Assert.assertThat;

public class RockPaperScissorsTest {

    private Thing rock = new Rock();
    private Thing paper = new Paper();
    private Thing scissors = new Scissors();

    @Test
    public void rockBeatsRockReturnsNull() throws Exception {
        assertBeatsItselfReturnNull(rock);
    }

    @Test
    public void paperBeatsPaperReturnsNull() throws Exception {
        assertBeatsItselfReturnNull(paper);
    }

    @Test
    public void scissorsBeatsScissorsReturnsNull() throws Exception {
        assertBeatsItselfReturnNull(scissors);
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
    public void paperBeatsRock() throws Exception {
        assertThat(paper.beats(rock), is(true));
    }

    @Test
    public void paperLosesToScissors() throws Exception {
        assertThat(paper.beats(scissors), is(false));
    }

    @Test
    public void scissorsBeatsPaper() throws Exception {
        assertThat(scissors.beats(paper), is(true));
    }

    @Test
    public void scissorsLosesToRock() throws Exception {
        assertThat(scissors.beats(rock), is(false));
    }

    private void assertBeatsItselfReturnNull(Thing thing) {
        assertThat(thing.beats(thing), is(nullValue()));
    }
}
