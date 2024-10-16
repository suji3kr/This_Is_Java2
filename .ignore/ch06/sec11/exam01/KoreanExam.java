package ch06.sec11.exam01;

public class KoreanExam {
    public static void main(String[] args) {

        Korean K1 = new Korean("123456-1234567", "김자바");


        System.out.println(K1.nation);
        System.out.println(K1.ssn);
        System.out.println(K1.name);

        //K1.nation ="USA";
        //K1.ssn = "123-12-1234";

        K1.name= "김자바";
    }
}
