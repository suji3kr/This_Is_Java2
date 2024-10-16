package ch07.sec03.exam01;

public class SmartPhone extends Phone {
    //extend 상속 받아야지 밑의 내용을 쓸 수 있음

    public SmartPhone(String model, String color){
//        super();      생략가능
        this.model = model;
        this.color = color;

        System.out.println("SmartPhone(String model, String color) 생성자 실행됨");
    }
}
