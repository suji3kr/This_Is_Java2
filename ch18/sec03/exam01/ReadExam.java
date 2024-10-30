package ch18.sec03.exam01;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class ReadExam {
    public static void main(String[] args) {
        try{
            InputStream is = new FileInputStream("C:/Temp/test.db");
            //데이터 출발지를 test.db로 하는 입력 스트림 생성

            while (true){
                int data = is.read();       // 1바이트씩 일기
                if (data == -1) break;      //파일 끝에 도달했을 경우 = EOF 'End of file' 를 만나면 멈춰라
                System.out.println(data);
            }
            is.close(); //입력 스트림을 닫고 사용 메모리 해제
        }catch (FileNotFoundException e){
            e.printStackTrace();

        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
