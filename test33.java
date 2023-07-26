import java.util.*;

public class test33 {



        public static void main(String[] args) {
            Map<String, List<Integer>> scoresMap = new HashMap<>();
            Scanner sc = new Scanner(System.in);
            System.out.println("Count : ");
            int n = sc.nextInt();
            for (int i = 0; i<n; i++) {
                System.out.println("학생 이름 : ");
                String name = sc.next();
                List<Integer> scores = new ArrayList<>();
                for (int j = 1; j <= 3; j++) {
                    System.out.println(name + "의" + j + "점수");
                    int score = sc.nextInt();
                    scores.add(score);
                }
                scoresMap.put(name, scores);
            }

            String highAvgStu = null;  //값 넣을 변수 생성
            float highAvg = 0.0f;  // 얘도

            for (String name: scoresMap.keySet()) {
                List<Integer> scores = scoresMap.get(name);
                int total = scores.get(0) + scores.get(1) + scores.get(3);  //점수 합산
                float avg = total / 3.0f;   //나누기 3

                if (avg > highAvg) {
                    highAvg = avg;
                    highAvgStu =name;       //평균이 highavg 보다 높으면 avg 값이 highavg 로 가고 highavgstu 에 그 애 이름 넣어주기
                }

            }
            if (highAvgStu != null) {
                System.out.println("\n\n평균 1등 :");
                System.out.println("이름:"+ highAvgStu);
                List<Integer> scores = scoresMap.get(highAvgStu);
                System.out.println("첫 번쨰 점수 : " + scores.get(0));
                System.out.println("첫 번쨰 점수 : " + scores.get(1));
                System.out.println("첫 번쨰 점수 : " + scores.get(2));
                int total = scores.get(0)+scores.get(1)+scores.get(2);
                System.out.println("총점 : " + total);
                System.out.println("평균:" + highAvg);
            }else {
                System.out.println("잘못된 접근입니다.");
            }

        }
    }





