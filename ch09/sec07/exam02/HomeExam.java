package ch09.sec07.exam02;

public class HomeExam {
    public static void main(String[] args) {

        Home home = new Home();

        //필드사용
        home.use1();

        home.use2();

        home.use3(new RemoteControl() {
            @Override
            public void turnON() {
                System.out.println("난방을 켭니다.");
            }

            @Override
            public void turnOff() {
                System.out.println("난방을 끕니다.");
            }
        });
    }
}
