package yes_static;

public class Person {
    String name;
    static int population;


    public Person(String name) {
        this.name = name;
        population++;
    }
}
