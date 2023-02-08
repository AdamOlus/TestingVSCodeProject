import java.util.Random;

class Person {
    String name;
    int age;
    Random r;

    Person(String name) {
        this.name = name;
        r = new Random();
        age = r.nextInt(100);
    }

    String getInfo() {
        return name + " is " + age + " years old.";
    }
}