package SungJuck;
import java.util.*;

public class Test {


    public static void main(String[] args) {

        ArrayList<HashMap<String, Object>> list = new ArrayList<HashMap<String, Object>>();   //선언및 대입

        int n = 0;   //3명의 학생의 각 점수를 입력하고  평균이 제일 높은 학생을 출력하세요

        Scanner sc = new Scanner(System.in);
        System.out.print("Count : ");
        n = sc.nextInt();


        String name = "";
        ArrayList<Integer> score = null;
        int total = 0;
        int kor = 0;
        int eng = 0;
        int math = 0;
        double avg = 0.0;
        int TopMathScore = 0;


        for (int i = 0; i < n; i++) {
            HashMap<String, Object> personMap = new HashMap<String, Object>();
            System.out.print("Name : ");
            name = sc.next();
            personMap.put("name", name);

            score = new ArrayList<Integer>();
            System.out.print("국어점수 : ");
            kor = sc.nextInt();
            score.add(kor);
            total += kor;
            System.out.print("영어점수 : ");
            eng = sc.nextInt();
            score.add(eng);
            total += eng;
            System.out.print("수학점수 : ");
            math = sc.nextInt();
            score.add(math);
            total += math;
            score.add(total);
            score.add(TopMathScore);

            personMap.put("score", score);

            avg = total / 3.0f;
            personMap.put("avg", avg);

            list.add(personMap);
        }


        for (int i = 0; i < n; i++) {
            HashMap<String, Object> personMap = list.get(i);   //오브젝트는 최상위 기능  그래서 인티저 float 다 가져올수 있음
            System.out.println("name : " + personMap.get("name"));

            ArrayList<Integer> scores = (ArrayList<Integer>) personMap.get("score");
            System.out.println("국어 : " + scores.get(0));
            System.out.println("영어 : " + scores.get(1));
            System.out.println("수학 : " + scores.get(2));
            System.out.println("total : " + scores.get(3));
            System.out.println("average : " + personMap.get("avg"));

            Collections.sort(scores);
            System.out.println("학번의 오름차순으로 정렬 후...");
            for (scores.sort((Comparator<? super Integer>) score); ; ) {
                System.out.println(total);


                System.out.println("=======================================");


//    public static void main(String[] args) {
//        String []name;
//        int [][]score;
//        float []avg;
//
//        int n=0;
//
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Count : ");
//        n = sc.nextInt();
//
//        name = new String[n];
//        score = new int[n][4];
//        avg = new float[n];
//
//        for(int i = 0;i<n;i++) {
//            name[i] = sc.next();
//            for(int j=0;j<(score[i].length)-1;j++) {
//                score[i][j] = sc.nextInt();
//                score[i][3] += score[i][j];
//            }
//            avg[i] = score[i][3]/3.0f;
//        }
//
//        for(int i=0;i<n;i++) {
//            System.out.println("name : " + name[i]);
//            System.out.println("score1 : " + score[i][0]);
//            System.out.println("score2 : " + score[i][1]);
//            System.out.println("score3 : " + score[i][2]);
//            System.out.println("total : " + score[i][3]);
//            System.out.println("average : " + avg[i]);
//        }
//    }
            }
        }
    }
}