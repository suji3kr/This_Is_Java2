package ch12.sec04;

public class Exitexam
{
    public static void main(String[] args) {
        for(int i=0;  i<10; i++){
            //i값 출력
            System.out.println(i);
            if(i == 5){
               //JVM 프로세스 종료
                System.out.println("프로세스 강제종료");
                System.exit(0);//정상종료 0, 비정상종료 1,-1
            }
        }
    }
}
