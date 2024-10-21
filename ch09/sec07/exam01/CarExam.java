package ch09.sec07.exam01;

public class CarExam {
    public static void main(String[] args) {
        Car car = new Car();

        car.run1();//필드사용

        car.run2();//로컬변수사용

        car.run3(new Tire() {   //익명 자식 객체가 대입된 매개변수 사용
            @Override
            public void roll() {
                System.out.println("익명 자식 객체 3이 굴러갑니다.");
            }
        });
    }
}
