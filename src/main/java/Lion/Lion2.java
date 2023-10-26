package Lion;

public class Lion2 {
    public static void main(String[] args) {
        Person.age = 20;
        Person.name = "홍길동";
        System.out.println(Person.age + " " + Person.name);
    }
}

class Person {
    static int age;
    static String name = "";
}