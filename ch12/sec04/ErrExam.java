package ch12.sec04;

public class ErrExam {
    public static void main(String[] args) {
        try{
            int value = Integer.parseInt("1oo");
        }catch (NumberFormatException e){

            System.out.println("에러확인");
            System.err.println("[에러내용]");
            System.err.println(e.getMessage());
        }
    }
}
