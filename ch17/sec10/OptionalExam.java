package ch17.sec10;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;

public class OptionalExam {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();


//        예외발생 (java.util.NoSuchElementException)
//        double avg = list.stream()
//                .average()
//                .getAsDouble();


        //방법 1 값이 없을 때 사용, 그러나 코드길어짐.. -> 타인의 가독성이 좋아짐
        OptionalDouble optional = list.stream()
                .mapToInt(Integer :: intValue)
                .average();
        if(optional.isPresent()) {
            System.out.println("방법1_평균:" + optional.getAsDouble());

        }else {
            System.out.println("방법1_평균: 0.0");
        }


        //방법 2  일반적인 사용 방법 값이 없을 때 + 어떻게 든 값이 나오기 때문에 에러 잘보임
        double avg = list.stream()
                .mapToInt(Integer::intValue)
                .average()
                .orElse(0.0);
        System.out.println("방법2_평균 " + avg);

        //방법 3  값이 있을 때만 출력 = 명확하게 명시적 표현됨
        list.stream()
                .mapToInt(Integer ::intValue)
                .average()
                .ifPresent(a-> System.out.println("방법3_평균 : "+a));
    }
}
