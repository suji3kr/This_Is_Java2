package ch06.sec15;

public class Singleton {
    //Private 접근 권한을 갖는 정적 필드의선언과 초기화
    private static Singleton singleton = new Singleton();

    private Singleton(){}  //private접근권한을 갖는 생성자 선언

    public static Singleton getSingleton(){
        return singleton;
    }

}
