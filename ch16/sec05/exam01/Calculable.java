package ch16.sec05.exam01;

@FunctionalInterface
public interface Calculable {
    // 두 개의 double 값을 받아 계산 결과를 반환하는 추상 메서드
    double calc(double x, double y);
}
