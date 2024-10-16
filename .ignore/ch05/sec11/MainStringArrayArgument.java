package ch05.sec11;

public class MainStringArrayArgument {
    public static void main(String[] args) {

        if(args.length !=2){
            System.out.println("프로그램 입력값이 부족");
            System.exit(0);  //exit 정삭적으로 종료해라
        }

        String strNum1 =args[0];
        String strNum2 =args[1];   //argument로 받으면 Int로 바꿔야 함

        int num1 = Integer.parseInt(strNum1);
        int num2 = Integer.parseInt(strNum2);               // int 정수로 바꾼후

        int result = num1 +num2;                            // 더하기
        System.out.println(num1+"+"+num2+"="+result);        // sum 대신에 result
    }
}
