import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;


public class test22 {




    public static void main(String[] args) {

        ArrayList<HashMap<String,Object>> list = new ArrayList<HashMap<String,Object>>();   //선언및 대입

        int n=0;

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

        for(int i = 0;i<n;i++) {
            HashMap<String, Object> personMap =  new HashMap<String,Object>();
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
            personMap.put("score", score);

            avg = total/3.0f;
            personMap.put("avg", avg);

            list.add(personMap);
        }



        System.out.println("검색할 과목을 입력하세요. 0=국어 , 1=영어 , 2=수학");
        int userInput = sc.nextInt();
        int High = 0;
        list.forEach((scores, value) -> {
            System.out.println(s + ":" + userInput);
        });

        //for(int i=0;i<n;i++) {
            //HashMap<String, Object> personMap = list.get(i);
            //System.out.println("name : " + personMap.get("name"));
           // ArrayList<Integer> scores = (ArrayList<Integer>) personMap.get("score");

            // 입력한 과목의 점수를 가지고 리스트의  0번째값하고 i번째의 값을 비교해서 i번째 값이 크다면 High를 i에 넣는것
           // if (((ArrayList<Integer>) (list.get(High).get("score"))).get(userInput) < ((ArrayList<Integer>) (list.get(i).get("score"))).get(userInput)) { //해시맵에서 가져온 첫번째 값과
             //   High = i;
           // }


            System.out.println("국어 : " + scores.get(0));
            System.out.println("영어 : " + scores.get(1));
            System.out.println("수학 : " + scores.get(2));
            System.out.println("total : " + scores.get(3));
            System.out.println("average : " + personMap.get("avg"));

        }
        //선택한 과목 1등 출력
        System.out.println("선택한 과목 1등: " + list.get(High).get("name")) ;
    }

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
