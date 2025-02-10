package ahorcado;

public class Palabra {
    private String palabra;
    private char[] estado;

    public Palabra(String palabra) {
        this.palabra = palabra.toLowerCase();
        this.estado = new char[palabra.length()];
        for (int i = 0; i < palabra.length(); i++) {
            estado[i] = '_';
        }
    }

    public String mostrarEstado() {
        return new String(estado);
    }

    public boolean actualizarEstado(char letra) {
        letra = Character.toLowerCase(letra);
        boolean letraEncontrada = false;
        for (int i = 0; i < palabra.length(); i++) {
            if (palabra.charAt(i) == letra) {
                estado[i] = letra;
                letraEncontrada = true;
            }
        }
        return letraEncontrada;
    }

    public boolean esAdivinada() {
        return palabra.equals(new String(estado));
    }

    public String getPalabra() {
        return palabra;
    }

    public void completar() {
        for (int i = 0; i < estado.length; i++) {
            estado[i] = palabra.charAt(i);
        }
    }
}