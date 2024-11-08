package ch11.sec08;

public class java_test01 {

    // 추상 클래스 Calc
    abstract class Calc {
        // 더하기 메소드
        public int add(int a, int b) {
            return a + b;
        }

        // 뺄셈을 위한 추상 메소드
        public abstract int sub(int a, int b);
    }

    // Test03_BasicCalc 클래스: Calc 클래스를 상속받음
    public class Test03_BasicCalc extends Calc {

        // 1. add 메소드 오버로딩 (세 개의 숫자를 더하는 메소드)
        public int add(int a, int b, int c) {
            return a + b + c;
        }

        // 2. sub 메소드 구현 (뺄셈)
        @Override
        public int sub(int a, int b) {
            return a - b;
        }
    }

    public static void main(String[] args) {
        // 객체 생성
        java_test01 test = new java_test01();
        Test03_BasicCalc calc = test.new Test03_BasicCalc();

        // add 메소드 테스트
        System.out.println("Add 3 + 4 = " + calc.add(3, 4));             // 기존 add(int, int)
        System.out.println("Add 1 + 2 + 3 = " + calc.add(1, 2, 3));       // 오버로딩된 add(int, int, int)

        // sub 메소드 테스트
        System.out.println("Sub 7 - 4 = " + calc.sub(7, 4));             // sub(int, int)
    }
}
