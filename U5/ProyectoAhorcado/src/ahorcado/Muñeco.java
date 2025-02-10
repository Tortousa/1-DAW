package ahorcado;

public class Muñeco {
    public static void dibujar(int errores) {
        switch (errores) {
            case 0:
                System.out.println("   _____");
                System.out.println("  |     |");
                System.out.println("        |");
                System.out.println("        |");
                System.out.println("________|");
                break;
            case 1:
                System.out.println("   _____");
                System.out.println("  |     |");
                System.out.println("  O     |");
                System.out.println("        |");
                System.out.println("________|");
                break;
            case 2:
                System.out.println("   _____");
                System.out.println("  |     |");
                System.out.println("  O     |");
                System.out.println("  |     |");
                System.out.println("________|");
                break;
            case 3:
                System.out.println("   _____");
                System.out.println("  |     |");
                System.out.println("  O     |");
                System.out.println(" /|     |");
                System.out.println("________|");
                break;
            case 4:
                System.out.println("   _____");
                System.out.println("  |     |");
                System.out.println("  O     |");
                System.out.println(" /|\\    |");
                System.out.println("________|");
                break;
            case 5:
                System.out.println("   _____");
                System.out.println("  |     |");
                System.out.println("  O     |");
                System.out.println(" /|\\    |");
                System.out.println("_/_\\____|");
                break;
            default:
                System.out.println("¡Ahorcado!");
        }
    }
}