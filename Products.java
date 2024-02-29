public class Products {
    private String nombre;
    private double precio;
    private int stock;

    public Products(String nombre, double precio, int stock) {
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }

    public Products(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
        this.stock = 0;

    }

    public String getNombre() {

        return nombre;
    }

    public void setNombre(String nombre) {
        if (nombre != null) {
            this.nombre = nombre;
        } else {
            System.out.println("El nombre no puede ser nulo.");
        }
    }

    public double getPrecio() {

        return precio;
    }

    public void setPrecio(double precio) {
        if (precio >= 0) {
            this.precio = precio;
        } else {
            System.out.println("El precio no puede ser negativo.");
        }
    }

    public int getStock() {

        return stock;
    }

    public void setStock(int stock) {
        if (stock >= 0) {
            this.stock = stock;
        } else {
            System.out.println("El stock no puede ser negativo.");
        }
    }


    public void aumentarStock(int cantidad) {
        if (cantidad > 0) {
            this.stock += cantidad;
            System.out.println("Se ha aumentado el stock de " + this.nombre + " en " + cantidad + " unidades.");
        } else {
            System.out.println("La cantidad debe ser mayor a 0");
        }

        }
    public void reducirStock(int cantidad) {
        if (cantidad > 0 && cantidad <= this.stock) {
            this.stock -= cantidad;
            System.out.println("Se ha reducido el stock de " + this.nombre + " en " + cantidad + " unidades.");
        } else if (cantidad <= 0) {
            System.out.println("La cantidad debe ser mayor a 0");
        } else {
            System.out.println("No hay suficiente stock disponible para reducir en " + cantidad + " unidades.");
        }
    }

    }
