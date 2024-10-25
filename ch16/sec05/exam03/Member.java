package ch16.sec05.exam03;
public class Member {
    // Member 클래스의 필드: 사용자 ID와 이름
    private String id;
    private String name;

    // ID만을 매개변수로 받는 생성자
    public Member(String id) {
        this.id = id; // 필드 id에 매개변수 id 값을 할당
        System.out.println("Member(String id)"); // 생성자 호출 확인 메시지
    }

    // ID와 이름을 매개변수로 받는 생성자
    public Member(String id, String name) {
        this.id = id; // 필드 id에 매개변수 id 값을 할당
        this.name = name; // 필드 name에 매개변수 name 값을 할당
        System.out.println("Member(String id, String name)"); // 생성자 호출 확인 메시지
    }

    // 객체의 문자열 표현을 반환하는 메서드
    @Override
    public String toString() {
        // id와 name 정보를 포함한 문자열 생성
        String info = " { id: " + id + ", name: " + name + " }";
        return info; // 생성한 문자열 반환
    }
}
