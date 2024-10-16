package ch06.sec08.exam01;

public class CalculatorExam {
    public static void main(String[] args) {
        Calculator myCalc = new Calculator();

        myCalc.powerOn();

        //덧셈 결과를 리턴받아 result1변수에 대입
        int result1 = myCalc.plus(5,6);
        System.out.println("result1 :"+ result1);
        int x = 10;
        int y = 4;


        //divide ()메소드 호출시 변수 x y의 값을 매개값으로 제공,
        //나눗셈 결과흫 리턴받아 result2변수에 대입
        double result2 = myCalc.divide(x,y);
        System.out.println("result2 :"+ result2);


        //리턴값이 없는 메소드 호출
        myCalc.powerOff();
    }
}

