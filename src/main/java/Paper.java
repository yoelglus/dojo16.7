public class Paper implements Thing {
    @Override
    public Boolean beats(Thing thing) {
        return thing.losesTo(this);
    }

    @Override
    public Boolean losesTo(Rock rock) {
        return false;
    }

    @Override
    public Boolean losesTo(Paper paper) {
        return null;
    }

    @Override
    public Boolean losesTo(Scissors scissors) {
        return true;
    }
}
