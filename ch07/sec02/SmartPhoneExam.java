package ch07.sec02;

public class SmartPhoneExam {
    public static void main(String[] args) {
        //SmartPhone 객체 생성
        SmartPhone myPhone = new SmartPhone("갤럭시" , "은색");

        //Phone 으로 부터 상속받은 필드읽기
        System.out.println("모델: "+ myPhone.model);
        System.out.println("색상: "+ myPhone.color);

        //SmartPhone 필드읽기
        System.out.println("와아파이 상태: "+myPhone.wifi);

        //Phone으로 부터 받은 메소드 호출
        myPhone.bell();
        myPhone.sendVoid("여보세요");
        myPhone.receivedVoid("안녕하세요~ 000입니다.");
        myPhone.sendVoid("아 네~ 안녕하세요! ");
        myPhone.hangUp();

         //smartPhone의 메소드 호출
        myPhone.setWifi(true); // 와이파이 상태를 변경
        myPhone.internet();   //인터넷에 연결합니다.
    }
}
