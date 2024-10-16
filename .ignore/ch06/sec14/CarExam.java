package ch06.sec14;

public class CarExam {
    public static void main(String[] args) {

        Car myCar = new Car();

        myCar.setSpeed(-50);
        System.out.println("현재 속도 : "+myCar.getSpeed());

        myCar.setSpeed(60);
        System.out.println("현재 속도 : "+myCar.getSpeed());

        if(!myCar.isStop()){                 // ! stop 이 아니면
            myCar.setStop(true);             // true 멈추게 하라
        }
        System.out.println("현재 속도 : " +myCar.getSpeed());
    }
}
