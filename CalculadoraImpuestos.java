public class CalculadoraImpuestos {
    public double calcularImpuestos(int ingresos) {
        return ingresos + 0.15;
    }

    public double calcularImpuestos(double ventas, double porcentajeImpuestos) {
        return ventas * (porcentajeImpuestos / 100);
    }

    public double calcularImpuestos(double dividendos, double porcentajeImpuestos, double exencion) {
        double impuestos = dividendos * (porcentajeImpuestos / 100);
        if (impuestos > exencion) {
            return impuestos - exencion;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        CalculadoraImpuestos calculadora = new CalculadoraImpuestos();

        System.out.println("Impuestos (solo ingresos): $" + calculadora.calcularImpuestos(10000));
        System.out.println("Impuestos (ventas y porcentaje de impuestos): $" + calculadora.calcularImpuestos(50000, 15.0));
        System.out.println("Impuestos (dividendos, porcentaje de impuestos y exención): $" + calculadora.calcularImpuestos(20000, 15.0, 5000));
    }
}
