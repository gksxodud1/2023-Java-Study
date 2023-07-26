package Week10Game;
import java.util.Scanner;


public class Game {



    public static void main(String[] args) {

        int gameCount = 3;

        System.out.println(">>>>>>> 숫자야구 게임을 시작합니다.");
        Scanner sc = new Scanner(System.in);
        int value = 1;
        int value2 = 2;
        int value3 = 3;

        while(value == 1) {

            System.out.println("\n\n>> 새로운 게임을 시작합니다.");
            startGame(gameCount);

            System.out.println(">> 게임 시작 ");
            value = sc.nextInt();


                while (value2 == 2) {
                 value2 (ArrayList<CaseInfo> caseList) {


                    System.out.println(">> 게임 성적 보기 ");
                    value2 = sc.nextInt();

                    System.out.println("\n\n입력한 모든 값 ------------------------------ ");


                    for (CaseInfo obj : caseList) {
                        Integer[] user_input = obj.getUser_input();
                        System.out.println("" + obj.getCaseNo() + "회차 입력 값 : " +  user_input[0] + " , " + user_input[1] + " , " + user_input[2]);
                    }
                    System.out.println("\n전체 결과 보기 ------------------------------ ");

                    for (CaseInfo obj : caseList) {
                        System.out.println(obj.getResultText());
                    }
                    System.out.println("---------------------------------------- ");   //2번 눌렀을때 이게 나오기만 하면대 그걸 왜못해 ???

                }
            }



            }
            while (value3 == 3) {
                System.out.println(">> 종료");
                value3 = sc.nextInt();
                break;
            }

            System.out.println(">>>>>>> 게임을 종료합니다. ");

        }




    public static void startGame(int gameCount){

        BaseballGame myGame = new BaseballGame(gameCount);

        // 랜덤 수 만들기
        MakeNumber maker = new MakeNumber();
        Integer[] comNumber = maker.makeNumber();
        myGame.rand_num = comNumber;

        // 사용자 숫자 입력
        for(int cnt = 0; cnt < gameCount ; cnt++) {

            CaseInfo caseinfo = new CaseInfo(cnt+1);
            myGame.inputUserNumber(caseinfo);
            int strike_num = myGame.checkNumber();

            if (strike_num == 3) {
                System.out.println("\n === 게임 클리어");
                break;
            } else if (cnt == gameCount - 1) {
                System.out.println("\n === 게임 클리어 실패");

            }
        }

        PrintResult printer = new PrintResult();
        printer.print(myGame.caseList);
    }
}