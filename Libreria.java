import java.util.ArrayList;
import java.util.List;

public class Libreria {
    private List<Usuario> usuarios;
    private List<Libro> libros;

    public Libreria() {
        this.usuarios = new ArrayList<>();
        this.libros = new ArrayList<>();
    }

    public void registrarUsuario(String nombre) {
        Usuario usuario = new Usuario(nombre);
        usuarios.add(usuario);
    }

    public void registrarLibro(String nombre, String autor) {
        Libro libro = new Libro(nombre, autor);
        libros.add(libro);
    }

    public void rentarLibro(int idUsuario, int idLibro) {
        Usuario usuario = buscarUsuarioPorId(idUsuario);
        Libro libro = buscarLibroPorId(idLibro);

        if (usuario != null && libro != null && !libro.isRentado()) {
            usuario.rentarLibro(libro);
            libro.setRentado(true);
            System.out.println("El libro se rento con exito.");
        } else {
            System.out.println("No se pudo rentar el libro.");
        }
    }

    public void listarUsuarios() {
        System.out.println("*** USUARIOS REGISTRADOS ***");
        for (Usuario usuario : usuarios) {
            System.out.println(usuario.getNombre());
        }
    }

    public void listarLibros() {
        System.out.println("*** LIBROS REGISTRADOS ***");
        for (Libro libro : libros) {
            System.out.println(libro.getNombre() + " - " + libro.getAutor());
        }
    }

    public void listarUsuariosConLibros() {
        System.out.println("*** USUARIOS CON LIBROS RENTADOS ***");
        for (Usuario usuario : usuarios) {
            if (!usuario.getLibrosRentados().isEmpty()) {
                System.out.println(usuario.getNombre());
            }
        }
    }

    public void listarLibrosNoRentados() {
        System.out.println("*** LIBROS NO RENTADOS ***");
        for (Libro libro : libros) {
            if (!libro.isRentado()) {
                System.out.println(libro.getNombre() + " - " + libro.getAutor());
            }
        }
    }

    public void listarLibrosRentados() {
        System.out.println("*** LIBROS RENTADOS ***");
        for (Libro libro : libros) {
            if (libro.isRentado()) {
                System.out.println(libro.getNombre() + " - " + libro.getAutor());
            }
        }
    }

    private Usuario buscarUsuarioPorId(int id) {
        for (Usuario usuario : usuarios) {
            if (usuario.getId() == id) {
                return usuario;
            }
        }
        return null;
    }

    private Libro buscarLibroPorId(int id) {
        for (Libro libro : libros) {
            if (libro.getId() == id) {
                return libro;
            }
        }
        return null;
    }
}
