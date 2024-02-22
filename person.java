// Person.java
class Person {
    String name;
    int age;
    String gender;

    public Person(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public static void main(String[] args) {
        Person person1 = new Person("Juan", 20, "Male");
        System.out.println(person1.name);
        System.out.println(person1.age);
        System.out.println(person1.gender);
        System.out.println("_");
        Person person2 = new Person("Martha", 40, "Female");
        System.out.println(person2.name);
        System.out.println(person2.age);
        System.out.println(person2.gender);
        System.out.println("_");
        Person person3 = new Person("Luis", 18, "Male");
        System.out.println(person3.name);
        System.out.println(person3.age);
        System.out.println(person3.gender);
        System.out.println("_");
        Person person4 = new Person("Itzel", 19, "Female");
        System.out.println(person4.name);
        System.out.println(person4.age);
        System.out.println(person4.gender);
    }
}
