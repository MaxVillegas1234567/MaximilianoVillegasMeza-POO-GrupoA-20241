import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Libreria libreria = new Libreria();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n*** MENÚ ***");
            System.out.println("1. Registrar usuario");
            System.out.println("2. Registrar libro");
            System.out.println("3. Rentar libro");
            System.out.println("4. Listar usuarios registrados");
            System.out.println("5. Listar libros registrados");
            System.out.println("6. Listar usuarios con libros rentados");
            System.out.println("7. Listar libros no rentados");
            System.out.println("8. Listar libros rentados");
            System.out.println("9. Salir");

            System.out.print("Ingrese la opción de lo que desee realizar: ");
            int opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el nombre del usuario: ");
                    String nombreUsuario = scanner.nextLine();
                    libreria.registrarUsuario(nombreUsuario);
                    break;
                case 2:
                    System.out.print("Ingrese el nombre del libro: ");
                    String nombreLibro = scanner.nextLine();
                    System.out.print("Ingrese el autor del libro: ");
                    String autorLibro = scanner.nextLine();
                    libreria.registrarLibro(nombreLibro, autorLibro);
                    break;
                case 3:
                    System.out.print("Ingrese el ID del usuario: ");
                    int idUsuario = scanner.nextInt();
                    System.out.print("Ingrese el ID del libro: ");
                    int idLibro = scanner.nextInt();
                    libreria.rentarLibro(idUsuario, idLibro);
                    break;
                case 4:
                    libreria.listarUsuarios();
                    break;
                case 5:
                    libreria.listarLibros();
                    break;
                case 6:
                    libreria.listarUsuariosConLibros();
                    break;
                case 7:
                    libreria.listarLibrosNoRentados();
                    break;
                case 8:
                    libreria.listarLibrosRentados();
                    break;
                case 9:
                    System.out.println("Saliendo del menu");
                    scanner.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        }
    }
}
