package ch05.sec03;

public class ReferenceVariableCompareExam {
    public static void main(String[] args) {

        int[] arr1;  //1차원배열  /[] [] [] 면 행 열 (3차원)
        int[] arr2;
        int[] arr3;

        arr1 = new int[] {1,2,3};  // 대입되는 값을 보고 차원을 결정 하겠다.
        arr2 = new int[] {1,2,3};
        arr3 =  arr2;

        System.out.println(arr1 ==  arr2);
        System.out.println(arr2 ==  arr3); //둘이 주소가 같을 까>? 값이 아니고 주소, 값은 equals
    }
}
