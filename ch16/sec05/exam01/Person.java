package ch16.sec05.exam01;

public class Person {
    // Calculable 인터페이스를 구현한 객체의 calc 메서드를 호출하여 결과를 출력하는 메서드
    public void action(Calculable calculable) {
        // calc 메서드를 호출하고 결과를 result 변수에 저장
        double result = calculable.calc(10, 4);
        // 결과를 콘솔에 출력
        System.out.println("결과:  " + result);
    }
}
