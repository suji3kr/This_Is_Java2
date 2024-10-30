package ch18.sec02.exam02;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class WriteExam {
    public static void main(String[] args) {
        try{
            OutputStream os = new FileOutputStream("C:/Temp/test2.db");
            byte[] array ={10,20,30};

            os.write(array);

            os.flush();
            // 버퍼에 저장된 데이터를 출력

            os.close();
            //출력 스트림을 닫아 메모리를 해제


        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
