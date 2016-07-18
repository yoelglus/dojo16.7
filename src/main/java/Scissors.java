public class Scissors implements Thing {
    @Override
    public Boolean beats(Thing thing) {
        return thing.losesTo(this);
    }

    @Override
    public Boolean losesTo(Rock rock) {
        return true;
    }

    @Override
    public Boolean losesTo(Paper paper) {
        return false;
    }

    @Override
    public Boolean losesTo(Scissors scissors) {
        return null;
    }
}
