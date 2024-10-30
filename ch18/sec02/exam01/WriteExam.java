package ch18.sec02.exam01;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class WriteExam {
    public static void main(String[] args) {
        try{
            OutputStream os = new FileOutputStream("C:/Temp/test.db");
            byte a = 10;
            byte b = 20;
            byte c = 30;

            os.write(a);
            os.write(b);
            os.write(c);
            //1byte씩 출력

            os.flush();
            // 버퍼에 저장된 데이터를 강제로 출력,  (파일, 네트워크, 소켓으로 ) 버퍼가 가득차거나 스크림이 닫힐때
            // 자동으로 플러쉬됨, 하지만 즉시 보내려면 직접 flush()호출  -ex)새로고침기능

            os.close();
            //출력 스트림을 닫아 사요한 메모리를 해제


        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
