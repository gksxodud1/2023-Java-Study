import java.util.Arrays;
import java.util.Scanner;

public class BaseBallGame {
    Integer[] rand_num = new Integer[3];
    Integer[][] user_input = null;
    int strike_num = 0;
    int ball_num = 0;

    public int gameCount = 10;
    private String[] resultText = null;

    public BaseBallGame() {
        this.gameCount = 10;
        resultText = new String[gameCount];
        user_input = new Integer[gameCount][3];
    }

    public BaseBallGame(int count) {
        this.gameCount = count;
        resultText = new String[gameCount];
        user_input = new Integer[gameCount][3];
    }

    public void genNumber() {


        Scanner sc = new Scanner(System.in);
        int value = 0;

        //랜덤 수 만들기
        for (int i = 0; i < 3; i++) {
            value = (int) Math.floor(Math.random() * 10);


            //중복처리
            if (Arrays.asList(rand_num).indexOf(value) == -1 && value > 0) {
                rand_num[i] = value;
                System.out.println(rand_num[i]);
            } else {
                i--;
            }
        }
    }

    public void inputUserNumber(int scn) {
        Scanner sc = new Scanner(System.in);
        int value = 0;
            System.out.println(">>1~9 숫자를 하나씩 입력해 주세요.");
            user_input[scn] = new Integer[3];
            for (int i = 0; i < 3; i++) {
                value = sc.nextInt();
                if (Arrays.asList(user_input[scn]).indexOf(value) == -1 && value > 0) {
                    user_input[scn][i] = value;
                }else {
                    System.out.println("중복된 값이나 잘못된 값이 입력되었습니다. 다시 입력해주세요");
                    i--;
                }
            }
        }

    public int checkNumber(int scn) {

        int value = 0;

        int strike_num = 0;
        int ball_num = 0;
        int match_index = -1;
        int i = 0;
        for (int user_num : user_input[scn]) {
            match_index = Arrays.asList(rand_num).indexOf(user_num);
            if (match_index != -1) {
                System.out.println(">> " + match_index + " -" + user_num);
                if (match_index == i) {
                    strike_num++;
                } else {
                    ball_num++;
                }
            }
            i++;
        }

        String result = "" + (scn + 1) + "회차판정 -- " + strike_num + "스트라이크 " + ball_num + " 볼";
        System.out.println(result);
        resultText[scn] = result;

        return strike_num;
    }






    public void printResult() {
        System.out.println("입력한 모든 값 -----------------------");
        for (int i = 0; i < gameCount; i++) {
            if (user_input[i][0] > 0) {
                System.out.println("" + (i + 1) + "회차 입력 값:" + user_input[i][0] + "," + user_input[i][1] + "," + user_input[i][2]);

            }
        }
        System.out.println("전체 결과 보기 -----------------------");
        for (String res : resultText) {
            if (res != null && !res.equals("")) {
                System.out.println(res);
            }
        }
        System.out.println("---------------------------");
    }

}


