package ch05.sec07;

public class MultidimensionArrayByValueListEx {
    public static void main(String[] args) {
        //2차원배열 생성
        int [][] scores = {
                {80, 90, 96},
                {76, 88}
        };

        //배열의 길이
        System.out.println("1차원 배열 길이(반의 수): "+ scores.length);
        System.out.println("2차원 배열 길이( 첫번째 반의 학생수): "+ scores[0].length);
        System.out.println("2차원 배열 길이( 두번째 반의 학생수): "+ scores[0].length);

        //첫번째의 반의 세번째 학생의 점수 읽기
        System.out.println("scores [0][2]: " + scores[0][2]);

        //두번째의 반의 두번째 학생의 점수 읽기
        System.out.println("scores [1][1]: " + scores[1][1]);

        //첫번째 반의 평균점수 구하기
        int class1sum = 0;
        for(int i =0; i<scores[0].length; i++){
            class1sum+= scores[0][i];
        }
        double class1Avg = (double) class1sum /scores[0].length;
        System.out.println("첫 번째 반의 평균: " + class1Avg);


        //두번째 반의 평균점수 구하기
        int class2sum = 0;
        for(int i =0; i<scores[1].length; i++){
            class2sum+= scores[1][i];
        }
        double class2Avg = (double) class2sum /scores[1].length;
        System.out.println("첫 번째 반의 평균: " + class2Avg);


        //전체 평균점수 구하기
        int totalStudent = 0;
        int totalSum = 0;

        for(int i =0; i<scores.length; i++){
            totalStudent += scores[i].length;
            for (int k =0; k<scores[i].length; k++){
                totalSum += scores[i][k];
            }
        }
        double totalAvg = (double) totalSum /totalStudent;
        System.out.println("전체 학생의 평균: " + totalAvg);

    }
}
