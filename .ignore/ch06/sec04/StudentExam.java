package ch06.sec04;

public class StudentExam {
    public static void main(String[] args) {


        //Student 가 같은 경로에 있을 때 import 안해도 됨. 클래스명만 호출!
        Student s1 = new Student();
        System.out.println("s1 변수가 student 객체를 참조함.");

        Student s2 = new Student();
        System.out.println("s2 변수가 또 다른 student 객체를 참조함.");

    }
}
