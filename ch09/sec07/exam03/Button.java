package ch09.sec07.exam03;

public class Button {

    // 정적 멤버 인터페이스
    public static interface ClickListener{
        void onClick();
    }

    //필드
    private ClickListener clickListener;

    //메소드
    public void setClickListener(ClickListener clickListener){
        this.clickListener = clickListener;
    }

    public void click(){
        this.clickListener.onClick();
    }
}