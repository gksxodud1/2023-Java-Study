package week16;
import java.io.*;
import java.util.Scanner;

public class TangsuYuk {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("탕수육 게임을 시작합니다.");
        System.out.println("단어를 선택하세요");
        System.out.println("1. apple || 2. banana || 3. peach");
        try {
            BufferedReader reader = new BufferedReader(new FileReader("C:/Temp/Text.txt"));
            int userCase = sc.nextInt();
            while (userCase != 1 && userCase != 2 && userCase != 3) {
                System.out.println("올바른 숫자를 입력하세요");
                userCase = sc.nextInt();
            }
            String data = null;
            for(int i=0; i<userCase; i++){
                data = reader.readLine();
            }
            System.out.println("제시어 : " + data);
            reader.close();
            char[] arr = data.toCharArray();
            System.out.println("시작합니다");
            int i=0;
            String userAnswer;
            int score = 0;
            while (true) {
                if(i== arr.length) {
                    i = 0;
                }
                System.out.println(arr[i]);
                i++;
                if(i== arr.length) {
                    i = 0;
                }
                userAnswer = sc.next();
                char use = userAnswer.charAt(0);
                if(use != arr[i]) {
                    System.out.println("실패!");
                    break;
                }
                score++;
                i++;
                if(i== arr.length) {
                    i = 0;
                }
            }
            System.out.println("게임이 종료되었습니다 " + score + "회 연속 성공!");

        } catch (FileNotFoundException e) {
            System.out.println("파일이 없습니다." + e.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }








    }
}

