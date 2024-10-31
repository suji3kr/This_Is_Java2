package ch18.sec07.exam01;

import java.io.*;

public class BufferExam {
    public static void main(String[] args) throws Exception{
        String originalFilePath1 = BufferExam.class.getResource("originalFile.jpg").getPath();
        String targetFilePath1 = "C:/Temp/targetFile1.jpg";

        FileInputStream fis = new FileInputStream(originalFilePath1);
        FileOutputStream fos = new FileOutputStream(originalFilePath1);

        //입출력 스트림 + 버퍼 스트림 생성
        String originalFilePath2 = BufferExam.class.getResource("originalFile2.jpg").getPath();
        String targetFilePath2 = "C:/Temp/targetFile2.jpg";

        FileInputStream fis2 = new FileInputStream(originalFilePath2);
        FileOutputStream fos2 = new FileOutputStream(originalFilePath2);

        BufferedInputStream bis = new BufferedInputStream(fis2);
        BufferedOutputStream bos = new BufferedOutputStream(fos2);

        //버퍼를 사용하지 않고 복사
        long nonBufferTime = copy(fis, fos);
        System.out.println("버퍼 미사용:\t" + nonBufferTime + "ns");

        //버퍼를 사용하고 복사
        long bufferTime = copy(bis, bos);
        System.out.println("버퍼 사용:\t" + bufferTime + "ns");

        fis.close();
        fos.close();
        bis.close();
        bos.close();

    }

    public  static long copy(InputStream is, OutputStream os) throws Exception{
        //시작시간 설정
         long start = System.nanoTime();


         while(true){
             int data =is.read();
             if (data == -1) break;
             os. write(data);
         }
         os.flush();
         //끝시간 저장
        long end = System.nanoTime();
        //복사시간 리턴
        return (end-start);
    }
}
