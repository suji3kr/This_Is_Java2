package ch18.sec04.exam02;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class ReadExam {

    public static void main(String[] args) {
        try {
            Reader reader = null; // Reader 객체 선언

            // 1문자씩 읽기
            reader = new FileReader("C:/Temp/test.txt"); // 파일을 읽기 위한 FileReader 생성
            while (true) {
                int data = reader.read(); // 1문자 읽기
                if (data == -1) break; // 더 이상 읽을 데이터가 없으면 루프 종료
                System.out.print((char)data);
            }
            reader.close(); // Reader 닫기
            System.out.println(); // 줄 바꿈

            // 문자 배열로 읽기
            reader = new FileReader("C:/Temp/test.txt"); // 파일을 읽기 위한 FileReader 재생성
            char[] data = new char[100]; // 문자 배열 선언
            while (true) {
                int num = reader.read(data); // 문자 배열로 읽기
                if (num == -1) break; // 더 이상 읽을 데이터가 없으면 루프 종료
                for (int i = 0; i < num; i++) {
                    System.out.print(data[i]); // 읽은 문자 출력
                }
            }
            reader.close(); // Reader 닫기

        } catch (FileNotFoundException e) {
            e.printStackTrace(); // 파일이 없을 경우 예외 처리
        } catch (IOException e) {
            e.printStackTrace(); // I/O 오류 발생 시 예외 처리
        }

    }
}
