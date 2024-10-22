package ch13.sec02.exam01;


//generic타입
public class Product <K, M>{

    //field
    private K kind; //종류라고하자
    private M model;

    //method


    public K getKind() {return kind;}
    public M getModel() {return model;}

    public void setKind(K kind) {this.kind = kind;}
    public void setModel(M model) {this.model = model;}
}
