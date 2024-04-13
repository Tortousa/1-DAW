package Classes;

public class Session {
    private User currentUser = new User();
    private boolean logged;
    private final String FILE_PATH = ".\\assets\\files\\";
    private final String USERS_FILE = "users.txt";

    public Session() {
        this.logged = false;
        this.currentUser = new User();
    }
    public void login() {
        System.out.println("\nInicio de sesión");
        System.out.print("Usuario: ");
        String username = Input.getString();
        System.out.print("Contraseña: ");
        String password = Input.getString();
        // Leer archivo de usuarios
        // Si el usuario y contraseña coinciden, establecer el usuario actual y cambiar el estado de logged a true
        // Si no, mostrar mensaje de error
    }
    public void signup() {
        System.out.println("\nNuevo usuario");
        System.out.print("Usuario: ");
        String username = Input.getString();
        System.out.print("Nombre: ");
        String name = Input.getString();
        System.out.print("NIF: ");
        String nif = Input.getString();
        System.out.print("Email: ");
        String email = Input.getString();
        System.out.print("Dirección: ");
        String address = Input.getString();
        System.out.print("Fecha de nacimiento: ");
        String birthdate = Input.getString();
        System.out.print("Contraseña: ");
        String password = Input.getString();
        // Leer archivo de usuarios
        // Si el usuario no existe, añadirlo al archivo de usuarios
        // Si el usuario ya existe, mostrar mensaje de error
    }
    public boolean isLogged() {
        return this.logged;
    }
    public void showUser() {
        System.out.println("\nUsuario actual");
        System.out.println("Usuario: " + this.currentUser.username);
        System.out.println("Nombre: " + this.currentUser.name);
        System.out.println("NIF: " + this.currentUser.nif);
        System.out.println("Email: " + this.currentUser.email);
        System.out.println("Dirección: " + this.currentUser.address);
        System.out.println("Fecha de nacimiento: " + this.currentUser.birthdate);
        System.out.println("Rol: " + this.currentUser.role);
    }
    public void logout() {
        System.out.println("\nSesión cerrada");
        logged = false;
        this.currentUser = new User();
    }
}



