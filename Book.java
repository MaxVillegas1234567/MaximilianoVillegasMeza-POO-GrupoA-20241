public class Book {
        public static void main(String[] args) {
            libro lib1 = new libro();
            lib1.title = "Harry Potter y el Cáliz de Fuego";
            lib1.author = "J.K. Rowling";
            lib1.year = 2001;
            System.out.println(lib1.title);
            System.out.println(lib1.author);
            System.out.println(lib1.year);
            System.out.println("_");

            libro lib2 = new libro();
            lib2.title = "La Razón de Estar Contigo";
            lib2.author = "W. Bruce Cameron";
            lib2.year = 2016;
            System.out.println(lib2.title);
            System.out.println(lib2.author);
            System.out.println(lib2.year);
            System.out.println("_");

            libro lib3 = new libro();
            lib3.title = "El Diario de Ana Frank";
            lib3.author = "Ana Frank";
            lib3.year = 1947;
            System.out.println(lib3.title);
            System.out.println(lib3.author);
            System.out.println(lib3.year);
            System.out.println("_");

            libro lib4 = new libro();
            lib4.title = "La Teoría del Todo: El Origen y el Destino del Universo";
            lib4.author = "Stephen Hawking";
            lib4.year = 2002;
            System.out.println(lib4.title);
            System.out.println(lib4.author);
            System.out.println(lib4.year);
            System.out.println("_");
        }
}


class libro{
        String title = "Harry Potter y el cáliz de fuego";
        String author = "J.K. Rowling";
        int year = 2001;
    }


