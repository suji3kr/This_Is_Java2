package ch05.sec03;

public class GarbageObjectExam {
    public static void main(String[] args) {

        String hobby ="여행";
        hobby =null;

        String kind1= "자동차";  //자동차의 메모리 위치
        String kind2 = kind1;   //두 메모리 위치가 같다
        System.out.println("kind1: "+ kind2);
        System.out.println(kind1 == kind2); //주소 비교 결과는?? true
    }
}


