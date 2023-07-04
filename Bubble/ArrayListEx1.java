package Bubble;

import java.util.*;

public class ArrayListEx1 {


    // 4번째와 5번째 숫자 바꾸기 메소드
    public static void change4to5(ArrayList<Integer> arrList) {
        int fourNum, fiveNum;   //값지정
        System.out.println("change4to5 실행");

        fourNum = arrList.get(3);   //넣어줄 위치 지정
        fiveNum = arrList.get(4);

        System.out.println("4번째 숫자 : " + fourNum);
        System.out.println("5번째 숫자 : " + fiveNum);

        arrList.remove(3);       //4번째 숫자 5번째 숫자 위치 바꾸기
        arrList.add(3, fiveNum);
        arrList.remove(4);
        arrList.add(4, fourNum);

        // 강사님이 알려주신 방법
        /*
         * int temp = 0
         * temp = arrList.get(3);
         * arrList.set(3, arrList.get(4));
         * arrList.set(4, temp);
         */

        System.out.println("4번째와 5번째가 바뀐 ranList");
        System.out.println(arrList);

    }

    // 오름차순으로 정렬 메소드
    public static void bubbleSortNum(ArrayList<Integer> arrList) {
        System.out.println("Bubble Sort 실행");
        int temp;

        for(int i = 0; i < arrList.size(); i++) {    //오름차순 정렬
            for(int j = 0; j < arrList.size(); j++) {
                if(arrList.get(i) < arrList.get(j)) {
                    temp = arrList.get(i);
                    arrList.set(i, arrList.get(j));
                    arrList.set(j, temp);
                }
            }
        }
        System.out.println("Bubble Sort 된 리스트");  //출력
        System.out.println(arrList);
    }

    public static void main(String[] args) {
        Random random = new Random();
        ArrayList<Integer> ranList = new ArrayList<Integer>();

        for(int i = 0; i < 10; i++) {    //랜덤값 1에서 100 까지 지정
            ranList.add(random.nextInt(101));
        }
        System.out.println("ranList : ");
        System.out.println(ranList);
        System.out.println();

        change4to5(ranList);
        System.out.println();

        bubbleSortNum(ranList);
        System.out.println();
    }


}

//ranList :
//[89, 18, 73, 90, 15, 67, 77, 51, 45, 40]
//
//change4to5 실행
//4번째 숫자 : 90
//5번째 숫자 : 15
//4번째와 5번째가 바뀐 ranList
//[89, 18, 73, 15, 90, 67, 77, 51, 45, 40]
//
//Bubble Sort 실행
//Bubble Sort 된 리스트
//[15, 18, 40, 45, 51, 67, 73, 77, 89, 90]