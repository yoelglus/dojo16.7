
public abstract class Thing {

    private GameLogic gameLogic;

    public Thing(GameLogic gameLogic) {
        this.gameLogic = gameLogic;
    }

    public Boolean beats(Thing thing) {
        return gameLogic.compare(this, thing);
    }
}
