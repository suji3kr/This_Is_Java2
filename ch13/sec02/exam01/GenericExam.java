package ch13.sec02.exam01;

public class GenericExam {
    public static void main(String[] args) {

        //K는 tv로 대체, M은 String으로 대체
        Product<Tv, String> product1 = new Product<>();

        product1.setKind(new Tv());
        product1.setModel("스마트 Tv");

        Tv tv = product1.getKind();
        String tvModel = product1.getModel();


        //
        Product<Car, String> product2 = new Product<>();

        product2.setKind(new Car());
        product2.setModel("suv자동차");

        Car car= product2.getKind();
        String carModel = product2.getModel();

    }
}
