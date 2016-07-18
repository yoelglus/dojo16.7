
public interface Thing {
    Boolean beats(Thing thing);
    Boolean losesTo(Rock rock);
    Boolean losesTo(Paper paper);
    Boolean losesTo(Scissors scissors);
}
