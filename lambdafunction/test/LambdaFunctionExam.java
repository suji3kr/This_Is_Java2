package lambdafunction.test;

public class LambdaFunctionExam {
    public static void main(String[] args) {
        // 람다식 (익명객체)를 다루기 위한 참조변수의 타입은 함수형 인터페이스로 한다.
        MyFunction2 f = (a, b) -> a > b ? a : b;

        int value = f.max(3, 5);
        System.out.println("value=" + value);
    }
}


