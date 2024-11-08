package ch11.sec08;

public class Test02_Person {
    private String firstName;
    private String lastName;
    private int age;
    private double height;

    // 생성자
    public Test02_Person(String firstName, String lastName) {
        super();
        this.firstName = firstName;
        this.lastName = lastName;
    }

    // 나이를 설정하는 setAge() 메소드
    public void setAge(int age) {
        if (age > 0) { // 나이가 0보다 큰 값이어야 하므로 유효성 검사를 추가할 수 있습니다.
            this.age = age;
        } else {
            System.out.println("나이는 양의 정수여야 합니다.");
        }
    }

    // 나이를 반환하는 getAge() 메소드
    public int getAge() {
        return age;
    }

    // 키를 설정하는 setHeight() 메소드
    public void setHeight(double height) {
        if (height > 0) { // 키는 0보다 큰 값이어야 하므로 유효성 검사를 추가할 수 있습니다.
            this.height = height;
        } else {
            System.out.println("키는 양의 값이어야 합니다.");
        }
    }

    // 키를 반환하는 getHeight() 메소드 (선택 사항, 필요하면 추가)
    public double getHeight() {
        return height;
    }

    // 사람의 정보 출력 (선택 사항)
    public void printPersonInfo() {
        System.out.println("Name: " + firstName + " " + lastName);
        System.out.println("Age: " + age);
        System.out.println("Height: " + height);
    }
}
