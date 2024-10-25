package ch16.sec05.exam01;

public class Computer {
    // 정적 메서드: 두 개의 double 값을 받아 그 합을 반환합니다.
    public static double staticMethod(double x, double y) {
        return x + y; // x와 y의 합을 반환
    }

    // 인스턴스 메서드: 두 개의 double 값을 받아 그 합을 반환합니다.
    public double instanceMethod(double x, double y) {
        return x * y; // x와 y의 합을 반환
    }
}
