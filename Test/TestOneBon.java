package Test;

import java.util.Scanner;

public class TestOneBon {
    public static void main(String[] args) {
        String [] name;
        int [][] score;
        float [] avg;

        int n = 0;

        Scanner sc = new Scanner(System.in);
        System.out.print("COUNT :");
        n= sc.nextInt();

        name = new String[n];
        score = new int[n][4];
        avg = new float[n];

        for (int  i=0; i<n; i++) {
            name[i] = sc.next();
            for (int j=0; j< (score[i].length) -1; j++) {
                score[i][j] = sc.nextInt();
                score[i][3] += score[i][j];

            }
            avg[i] = score[i][3]/3.0f;

        }
        for (int i = 0; i <n; i++) {
            System.out.println("name:" + name[i]);
            System.out.println("score1:" + score[i][0]);
            System.out.println("score2: " + score[i][1]);
            System.out.println("score3:" + score[i][2]);
            System.out.println("total: " + score[i][3]);
            System.out.println("average:" + avg[i]);

        }
    }
}
