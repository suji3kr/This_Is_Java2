package ch06.sec07.exam03;

public class KoreanExam {
    public static void main(String[] args) {

        Korean kor1 = new Korean("kim");  //인자가 1개
        Korean kor2 = new Korean("park","blue");   // 인자가 2개

        System.out.println("1차 이름 "+ kor1.name);
        System.out.println("2차 이름 "+ kor2.name);
        System.out.println("2색상 "+ kor2.ssn);

    }
}
