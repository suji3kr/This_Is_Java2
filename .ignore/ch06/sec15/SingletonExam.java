package ch06.sec15;

public class SingletonExam {
    public static void main(String[] args) {

//        Singleton obj1 = new Singleton();
//        Singleton obj2 = new Singleton();


        Singleton obj1 = Singleton.getSingleton();
        Singleton obj2 = Singleton.getSingleton();

        if(obj1 == obj2){
            System.out.println("같은 Singleton 객체");
        }else{
            System.out.println("같은 Singleton 객체");
        }
    }
}
