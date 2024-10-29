package yes_static;

public class Test {
    public static void main(String[] args) {

        Person p1 = new Person("A");
        System.out.println(p1.population);   //1

        Person p2 = new Person("A");
        System.out.println(p2.population);   //2

        Person p3 = new Person("A");
        System.out.println(p3.population);   //2


    }
}
