package ch06.sec07.exam03;

public class Korean {

    String nation = "대한민국";
    String name;
    String ssn;                         //필드선언

    public Korean(String name, String ssn) {   //인자 두개받는 생성자 시스템
        this.name = name;
        this.ssn = ssn;                     ///오버로딩 옵션은 생성자에서 말하는것에 따름
    }
    public Korean(String name) {    // 인자 하나받는 생성자 시스템
        this.name = name;
    }
}
