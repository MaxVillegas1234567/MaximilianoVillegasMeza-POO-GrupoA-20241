public class Libro {
    private static int nextId = 1;
    private int id;
    private String nombre;
    private String autor;
    private boolean rentado;

    public Libro(String nombre, String autor) {
        this.id = nextId++;
        this.nombre = nombre;
        this.autor = autor;
        this.rentado = false;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getAutor() {
        return autor;
    }

    public boolean isRentado() {
        return rentado;
    }

    public void setRentado(boolean rentado) {
        this.rentado = rentado;
    }
}
