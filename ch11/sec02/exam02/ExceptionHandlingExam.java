package ch11.sec02.exam02;

public class ExceptionHandlingExam {
    public static void main(String[] args) {
        // 첫 번째 try-catch 블록
        try {
            Class.forName("java.lang.String");
            System.out.println("java.lang.String 클래스가 존재합니다.");
        } catch (ClassNotFoundException e) {
            System.out.println("java.lang.String 클래스가 존재하지 않습니다.");
            e.printStackTrace();
        }

        System.out.println();

        // 두 번째 try-catch 블록
        try {
            Class.forName("java.lang.String2");
            System.out.println("java.lang.String2 클래스가 존재합니다.");
        } catch (ClassNotFoundException e) {
            System.out.println("java.lang.String2 클래스가 존재하지 않습니다.");
            e.printStackTrace();
        }
    }
}
