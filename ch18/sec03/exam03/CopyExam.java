package ch18.sec03.exam03;

import lombok.SneakyThrows;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class CopyExam {
    @SneakyThrows
    public static void main(String[] args) throws Exception{

        // 원본 파일과 대상 파일 경로 정의
        String originalFilename = "C:/Temp/binary.txt"; // 원본 파일 경로
        String targetFilename = "C:/Temp/binary2.txt"; // 대상 파일 경로

// 원본 파일을 읽기 위한 InputStream 생성
        InputStream is = new FileInputStream(originalFilename);
// 대상 파일을 쓰기 위한 OutputStream 생성
        OutputStream os = new FileOutputStream(targetFilename);

// 복사 과정 중 바이트 데이터를 저장할 버퍼
        byte[] data = new byte[1024];      // 1KB 버퍼 크기
        while (true) {
            // InputStream에서 버퍼로 바이트를 읽어오기
            int num = is.read(data);
            // 더 이상 읽을 데이터가 없으면 루프 종료
            if (num == -1) break;
            // 읽은 바이트를 OutputStream에 쓰기
            os.write(data, 0, num);
        }

// 모든 데이터가 쓰였는지 확인하기 위해 OutputStream을 플러시
        os.flush();
// OutputStream 닫기
        os.close();
// InputStream 닫기
        is.close();

// 콘솔에 성공 메시지 출력
        System.out.println("복사가 잘되었습니다."); // "복사가 완료되었습니다."
    }

}
