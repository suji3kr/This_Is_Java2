package ch06.sec14;

public class Car {          //퍼블릭 외부접근가능
    private  int speed;                 //private 직접 대입이 안됨,  클래스 내부호출만 가능 외부호출 불가.
    private  boolean stop;

    public  int getSpeed(){             //Public 은 외부 호출,  private 때문에 get 으로만 호출.
        return speed;
    }

    public void setSpeed(int speed) {   //set 으로만  입력해봐.(대입)
        if(speed <0){
            this.speed = 0;
        }else {
            this.speed = speed;
        }
    }

    public boolean isStop(){           // boolean 참이냐 거짓이냐
        return stop;
    }

    public void setStop(boolean stop) {
        this.stop = stop;
        if(stop == true) this.speed =0;
    }
}
