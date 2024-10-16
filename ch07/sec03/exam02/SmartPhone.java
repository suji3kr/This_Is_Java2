package ch07.sec03.exam02;

public class SmartPhone extends Phone {

    //자식생성자 선언 - 부모님이 기존 내용까지 정리해서 처리해주세요.
    public SmartPhone(String model, String color){
        super(model, color); //이때는 내용까지 부모한테 가져오는 것이기 때문에 super선언 필요

        System.out.println("SmartPhone(String model, String color) 생성자 실행됨");
    }
}
