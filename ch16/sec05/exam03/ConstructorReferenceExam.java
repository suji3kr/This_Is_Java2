package ch16.sec05.exam03;

public class ConstructorReferenceExam {
    public static void main(String[] args) {
        // Person 클래스의 인스턴스를 생성
        Person person = new Person();

        // 메서드 레퍼런스를 사용하여 Member 클래스의 생성자를 호출하고, Member 객체 m1을 생성
        Member m1 = person.getMember(Member::new);
        // 생성된 Member 객체 m1을 출력
        System.out.println(m1);
        System.out.println();

        // 메서드 레퍼런스를 사용하여 Member 클래스의 생성자를 호출하고, Member 객체 m2를 생성
        Member m2 = person.getMember2(Member::new);
        // 생성된 Member 객체 m2을 출력
        System.out.println(m2);
    }
}
