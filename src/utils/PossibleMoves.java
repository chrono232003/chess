package utils;

public enum PossibleMoves {

    KNIGHT("Hydrogen"),
    HE("Helium"),
    // ...
    NE("Neon");

    public final String label;

    private PossibleMoves(String label) {
        this.label = label;
    }


}
