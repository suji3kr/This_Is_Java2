package ch14.sec04.exam03;
//쓰레드 사용시 결과가 동시 프린팅(선점형)
import java.awt.*;

public class BeePrintExam {
    public static void main(String[] args) {

        //익명 자식 객체
        Thread thread = new Thread(){
            @Override
            public void run() {
                Toolkit toolkit = Toolkit.getDefaultToolkit();

                for(int i=0; i<5; i++){
                    toolkit.beep();
                    try {Thread.sleep(500);} catch(Exception e){}
                }
            }
        };

        thread.start(); //Thread ^호출하고 위 프린트와 밑에 프린트가 동시 실행됨

        for(int i=0; i<5; i++){
            System.out.println("띵");
            try {Thread.sleep(500);} catch(Exception e){}
        }
    }
}
