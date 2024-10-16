package ch05.sec06;

public class ArrayCreateByValueListExam {
    public static void main(String[] args) {
        //배열 변수 선언
        int [] scores;
        //배열 변수에 배열을 대입
        scores = new int[]{83, 90, 87};
        //배열 항목의 총합을 구하고 출력
        int sum1 =0;
        for(int i=0; i<3; i++){
            sum1 += scores[i];
        }
        System.out.println("총합: " + sum1);   //표준함수가 Class 안에 있으면 메서드가됨 mathod.

        printItem(new int[] {83, 90,87});
    }
    public static void printItem(int[] scores){// 인자 파라메드
        for(int i=0; i<3; i++){
            System.out.println("score["+i+"]:"+scores[i]);   // 사용자 정의 함수+
        }
    }
}

