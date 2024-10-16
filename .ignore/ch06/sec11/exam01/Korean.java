package ch06.sec11.exam01;

public class Korean {
    final String nation ="대한민국";
    final String ssn;

    //final은 변경이 안됨
    //없이 String nation 하면 다른 매개에서 연달아 적용가능 값이 변경됨.

    String name;

    public Korean(String ssn, String name){
        this.ssn =ssn;
        this.name = name;
    }
}
