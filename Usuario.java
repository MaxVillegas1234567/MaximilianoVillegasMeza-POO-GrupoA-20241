import java.util.ArrayList;
import java.util.List;

public class Usuario {
    private static int nextId = 1;
    private int id;
    private String nombre;
    private List<Libro> librosRentados;

    public Usuario(String nombre) {
        this.id = nextId++;
        this.nombre = nombre;
        this.librosRentados = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public List<Libro> getLibrosRentados() {
        return librosRentados;
    }

    public void rentarLibro(Libro libro) {
        librosRentados.add(libro);
    }
}
