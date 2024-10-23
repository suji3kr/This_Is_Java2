package ch13.sec03.exam01;

public class GenericExam {
    public static <T> Box<T> boxing(T t){
        Box<T> box = new Box<T>();
        box.set(t);
        return box;
    }


    public static void main(String[] args) {
        Box<Integer> box1 =boxing(100);
        int inValue = box1.get();
        System.out.println(inValue);

        Box<String> box2 =boxing("김가나");
        String strValue = box2.get();
        System.out.println(strValue);

    }
}
