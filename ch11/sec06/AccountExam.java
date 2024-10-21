package ch11.sec06;

public class AccountExam {
    public static void main(String[] args) {
        Account account = new Account();
        //예금하기
        account.deposit(10000);
        System.out.println("예금액 : "+ account.getBalance());

        //출금하기
        try {
            account.withdraw(30000);
        }catch (InsufficientException e){                  // e 이 변수에 예외 기록
            String message = e.getMessage();
            System.out.println(message);
        }
    }
}
