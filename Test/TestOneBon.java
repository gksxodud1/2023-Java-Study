package Test;

import java.util.*;

public class TestOneBon {
    public static void main(String[] args) {
        List<Map<String, Object>> list = new ArrayList<Map<String, Object>>();
        Map<String,String> h1 = new HashMap<>();
        Map<String,Integer> h2 = new HashMap<>();
        Map<String,Float> h3 = new HashMap<>();



        int n = 0;

        Scanner sc = new Scanner(System.in);
        System.out.print("COUNT :");
        n= sc.nextInt();



        for (int  i=0; i<n; i++) {
            h1[i][1] = sc.next();
            for (int j=0; j< (h2[i].length) -1; j++) {
                h2[i][j] = sc.nextInt();
                h2[i][3] += h2[i][j];

            }
            h3[i] = h2[i][3]/3.0f;

        }
        for (int i = 0; i <n; i++) {
            System.out.println("name:" + h1[i]);
            System.out.println("score1:" + h2[i][0]);
            System.out.println("score2: " + h2[i][1]);
            System.out.println("score3:" + h2[i][2]);
            System.out.println("total: " + h2[i][3]);
            System.out.println("average:" + h3[i]);

        }
    }
}

