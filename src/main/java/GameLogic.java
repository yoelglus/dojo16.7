import javafx.util.Pair;

import java.util.HashMap;
import java.util.Map;

public class GameLogic {

    private static Map<Pair<Class<? extends Thing>, Class<? extends Thing>>, Boolean> compareMap;

    static {
        compareMap = new HashMap<>();
        setRule(Rock.class, Paper.class, false);
        setRule(Rock.class, Scissors.class, true);
        setRule(Scissors.class, Rock.class, false);
        setRule(Scissors.class, Paper.class, true);
        setRule(Paper.class, Rock.class, true);
        setRule(Paper.class, Scissors.class, false);
    }

    private static Boolean setRule(Class<? extends Thing> first, Class<? extends Thing> second, Boolean value) {
        return compareMap.put(new Pair<>(first, second), value);
    }

    Boolean compare(Thing first, Thing second) {
        return compareMap.get(new Pair<>(first.getClass(), second.getClass()));
    }

}