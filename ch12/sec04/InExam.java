//import java.io.IOException;
//
//public class InExam {
//    public static void main(String[] args) throws IOException {
//        int speed = 0;
//        int keyCode = 0;
//
//        while (true) {
//            // 현재 속도를 출력
//            System.out.println("-------------------------");
//            System.out.println("1. 가속 | 2. 감속 | 3. 중지");
//            System.out.println("-------------------------");
//            System.out.println("현재 속도 = " + speed);
//            System.out.print("선택 : ");
//
//            // 사용자 입력 받기
//            keyCode = System.in.read();
//
//            // Enter 키를 눌렀을 때는 무시
//            if (keyCode == 13 || keyCode == 10) {
//                continue; // Enter 키는 무시하고 다음 반복으로
//            }
//
//            // 사용자 입력에 따른 동작
//            if (keyCode == 49) { // '1' 키
//                speed++;
//            } else if (keyCode == 50) { // '2' 키
//                speed--;
//            } else if (keyCode == 51) { // '3' 키
//                break; // 종료
//            }
//
//            // 입력 버퍼 비우기
//            System.in.read(); // 이 라인 추가로 Enter를 소비
//        }
//        System.out.println("프로그램 종료");
//    }
//}
