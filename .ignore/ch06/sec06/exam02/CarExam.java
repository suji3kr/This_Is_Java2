package ch06.sec06.exam02;

public class CarExam {
    public static void main(String[] args) {

        Car myCar = new Car();

        System.out.println("제작회사: " + myCar.company);
        System.out.println("모델명: " + myCar.model);
        System.out.println("색 : " + myCar.color);
        System.out.println("최고 속도 : " + myCar.maxspeed);
        System.out.println("현재 속도 : " + myCar.speed);
        System.out.println();

        myCar.speed = 60;
        System.out.println("수정된 속도: "+ myCar.speed);
    }
}