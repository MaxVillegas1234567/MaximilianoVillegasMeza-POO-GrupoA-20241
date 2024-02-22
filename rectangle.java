 class rectangle {
    public static void main(String[] args) {
        rectangulo rectang1 = new rectangulo(7,10);
        System.out.println(rectang1.base);
        System.out.println(rectang1.altura);
        System.out.println(rectang1.area());
        System.out.println("_");
        rectangulo rectang2 = new rectangulo(34,9);
        System.out.println(rectang2.base);
        System.out.println(rectang2.altura);
        System.out.println(rectang2.area());
        System.out.println("_");
        rectangulo rectang3 = new rectangulo(50,20);
        System.out.println(rectang3.base);
        System.out.println(rectang3.altura);
        System.out.println(rectang3.area());
        System.out.println("_");
        rectangulo rectang4 = new rectangulo(6,28);
        System.out.println(rectang4.base);
        System.out.println(rectang4.altura);
        System.out.println(rectang4.area());
    }
}

class rectangulo {
    double base;
    double altura;
    double area;
    double perimetro;

    public rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
        this.area = calcularArea();
        this.perimetro = calcularPerimetro();
    }

    public double area() {
        return area;
    }

    public double perimetro() {
        return perimetro;
    }

    private double calcularArea() {
        return base * altura;
    }

    private double calcularPerimetro() {
        return (base * 2) + (altura * 2);
    }
}


