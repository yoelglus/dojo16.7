
abstract class Thing {

    private GameLogic gameLogic;

    Thing(GameLogic gameLogic) {
        this.gameLogic = gameLogic;
    }

    Boolean beats(Thing thing) {
        return gameLogic.playMatch(this, thing);
    }
}
