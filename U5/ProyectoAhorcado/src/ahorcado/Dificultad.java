package ahorcado;

public enum Dificultad {
    FACIL, NORMAL, DIFICIL;

    public static Dificultad determinarDificultad(String palabra) {
        int longitud = palabra.length();

        if (longitud <= 5) {
            return FACIL;
        } else if (longitud <= 10) {
            return NORMAL;
        } else {
            return DIFICIL;
        }
    }
}