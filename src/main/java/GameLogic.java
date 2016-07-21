import javafx.util.Pair;

import java.util.HashSet;
import java.util.Set;

class GameLogic {

    private static Set<Pair<Class<? extends Thing>, Class<? extends Thing>>> winningMatches;

    static {
        winningMatches = new HashSet<>();
        setWinningMatch(Paper.class, Rock.class);
        setWinningMatch(Rock.class, Scissors.class);
        setWinningMatch(Spock.class, Rock.class);
        setWinningMatch(Rock.class, Lizard.class);
        setWinningMatch(Scissors.class, Paper.class);
        setWinningMatch(Paper.class, Spock.class);
        setWinningMatch(Lizard.class, Paper.class);
        setWinningMatch(Spock.class, Scissors.class);
        setWinningMatch(Scissors.class, Lizard.class);
        setWinningMatch(Lizard.class, Spock.class);
    }

    private static Boolean setWinningMatch(Class<? extends Thing> first, Class<? extends Thing> second) {
        return winningMatches.add(new Pair<>(first, second));
    }

    Boolean playMatch(Thing first, Thing second) {
        if (sameSign(first, second)) {
            return null;
        }
        return winningMatches.contains(createMatch(first, second));
    }

    private Pair<Class<? extends Thing>, Class<? extends Thing>> createMatch(Thing first, Thing second) {
        return new Pair<>(first.getClass(), second.getClass());
    }

    private boolean sameSign(Thing first, Thing second) {
        return first.getClass().equals(second.getClass());
    }

}
