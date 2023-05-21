package hw1week.java;

public class arr {
    public static void main(String[] args) {
        int[] arr = {10,20,30};    //대상 지정 생성   //배열 변수 선언과 배열 생성
        int sum = 0;              //총합과 평균 구하기
        for (int i =0; i<3; i++) {     //3번 반복
            sum += arr[i];
        }
        System.out.println("총합:" + sum);
        double avg = (double) sum/arr.length;    //메모리크기  저장되는 값의 허용범위 때문에 더블을 썻다. //연산자가 4개 가 들어감
        System.out.println("평균 : " + avg);
    }
}


