package ch06.sec07.exam01;

public class CarExam {
    public static void main(String[] args) {
        Car myCar = new Car("그랜저", "검정", 250);

        System.out.println("모델명: " + myCar.model);
        System.out.println("색: " + myCar.color);
        System.out.println("최고 속도: " + myCar.maxSpeed);
    }
}
