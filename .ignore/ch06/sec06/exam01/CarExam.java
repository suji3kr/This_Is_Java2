package ch06.sec06.exam01;

public class CarExam {
    public static void main(String[] args) {

        Car myCar = new Car();

        System.out.println("모델명: " + myCar.model);
        System.out.println("시동 여부 : " + myCar.start);
        System.out.println("현재 속도 : " + myCar.speed);
        System.out.println("기어 변속 : " + myCar.gear);
        System.out.println();
    }
}
