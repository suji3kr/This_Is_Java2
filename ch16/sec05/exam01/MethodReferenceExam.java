package ch16.sec05.exam01;

public class MethodReferenceExam {
    public static void main(String[] args) {

        Person person = new Person();
//person.action((x,y)-> Computer.staticMethod(x,y));
        // Computer 클래스의 정적 메서드(staticMethod)를 메서드 레퍼런스로 사용하여 action 메서드 호출
        person.action(Computer::staticMethod);


        Computer com = new Computer();
//person.action((x,y)-> com.instanceMethod(x,y));
        // Computer 클래스의 인스턴스 메서드(instanceMethod)를 메서드 레퍼런스로 사용하여 action 메서드 호출
        person.action(com::instanceMethod);
    }
}

