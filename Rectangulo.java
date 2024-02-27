public class Rectangulo {
    private double lado1;
    private double lado2;

    // Constructor
    public Rectangulo(double lado1, double lado2) {
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    public int calcularArea(int lado1, int lado2) {
        return lado1 * lado2;
    }

    public double calcularArea(double lado1, double lado2) {
        return lado1 * lado2;
    }

    public int calcularPerimetro(int lado1, int lado2) {
        return 2 * (lado1 + lado2);
    }

    public double calcularPerimetro(double lado1, double lado2) {
        return 2 * (lado1 + lado2);
    }

    public static void main(String[] args) {
        Rectangulo rectangulo = new Rectangulo(10.7, 3.5);

        System.out.println("Área del rectángulo: " + rectangulo.calcularArea(8, 9));
        System.out.println("Área del rectángulo: " + rectangulo.calcularArea(30.6, 40.8));
        System.out.println("Perímetro del rectángulo: " + rectangulo.calcularPerimetro(3, 6));
        System.out.println("Perímetro del rectángulo: " + rectangulo.calcularPerimetro(50.7, 45.7));
    }
}

