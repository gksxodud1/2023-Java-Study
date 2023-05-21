package hw1week.java;

import java.util.Random;
import java.util.Scanner;

public class hw2 {
    public static void main(String[] args) {
        int randInt = (int) ((Math.random() * 10) + 1);
        Scanner scanner = new Scanner(System.in);
        int chance = 5;
        for (int i = 1; i <= chance; i++) {
            System.out.println("숫자를 입력해주세요: ");
            String num1 = scanner.nextLine();
            int userPick = Integer.parseInt(scanner.nextLine());

            if (randInt == userPick) {
                System.out.println(i + "번 만에 맞췄음 ㅊㅋㅊㅋ");
                break;
            } else if (randInt > userPick) {
                System.out.println("업");
            } else if (randInt < userPick) {
                System.out.println("따운");

            }

        }
        System.out.println("정답은" + randInt + "였습니다.");
    }
}


