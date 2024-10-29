package lambdafunction.test;

@FunctionalInterface // 함수형 인터페이스는 단 하나의 추상 메소드만 가져야 함
interface MyFunction2 {
    int max(int a, int b);
}