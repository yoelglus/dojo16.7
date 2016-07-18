
public class Rock implements Thing {
    @Override
    public Boolean beats(Thing thing) {
        return thing.losesTo(this);
    }

    @Override
    public Boolean losesTo(Rock rock) {
        return null;
    }

    @Override
    public Boolean losesTo(Paper paper) {
        return true;
    }

    @Override
    public Boolean losesTo(Scissors scissors) {
        return false;
    }
}
