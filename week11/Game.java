package week11game;
import org.json.JSONArray;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Scanner;

public class Game {
    public static JSONArray  jsonArray = new JSONArray();


    public static ArrayList<BaseballGame> gameList = new ArrayList<>();

    public static void main(String[] args) throws IOException {

        int chanceCount = 3;

        System.out.println(">>>>>>> 숫자야구 게임에 오신 것을 환영합니다. >>>>>>>>>>");
        Scanner sc = new Scanner(System.in);
        int value = 1;
        int gameCount = 0;

        while(true) {
            printMenu();


            value = sc.nextInt();

            if(value == 1){
                System.out.println("\n\n>> 게임을 시작합니다. -------------");
                gameCount++;  //1이되고 게임시작 숫자가 올라가
                startGame(chanceCount);

            }else if(value == 2){
                System.out.println(">> 전체 게임 성적 보기 ------------------");
                printAllResult();
            }else if(value == 3){
                System.out.println(">> 게임을 종료합니다. --------------");

                for (int i = 0; i<gameCount; i++) {
                    jsonArray.put(jsonArray.get((i)));  //게임리스트에서 i번째 값을 제이슨 어레이에 넣어줌
                }
                String Jsondata = jsonArray.toString();
                Writer writer = new FileWriter("C:/Temp/game.json");
                writer.write(Jsondata);

                writer.close();

                break;

            }else{
                System.out.println("없는 메뉴 입니다");
            }

        }


    }

    public static void printMenu(){
        System.out.println(">>>>>>> 게임 메뉴 >>>>>>>>>>>>>>>>");
        System.out.println("1. 새 게임 시작 ");
        System.out.println("2. 게임 성적 보기 ");
        System.out.println("3. 종료 ");
        System.out.println("메뉴를 선택 하세요. >>>>>>>>>>>>>> ");
        System.out.print("> ");

    }



    public static void printAllResult(){

        if(gameList.isEmpty()){
            System.out.println("저장된 게임 결과가 없습니다.");
            return;
        }

        PrintResult printer = new PrintResult();
        int no = 1;
        for(BaseballGame gObj : gameList){
            System.out.println("" + no + "번째 게임 결과 " );
            printer.print(gObj);

            no++;
        }

    }
    public static void startGame(int chanceCount){

        BaseballGame myGame = new BaseballGame(chanceCount);

        // 랜덤 수 만들기
        MakeNumber maker = new MakeNumber();
        Integer[] comNumber = maker.makeNumber();
        myGame.rand_num = comNumber;

        // 사용자 숫자 입력
        for(int cnt = 0; cnt < chanceCount ; cnt++) {

            CaseInfo caseinfo = new CaseInfo(cnt+1);
            myGame.inputUserNumber(caseinfo);
            int strike_num = myGame.checkNumber();

            if (strike_num == 3) {
                System.out.println("\n === 게임 클리어");
                myGame.clear = true;
                break;
            } else if (cnt == chanceCount - 1) {
                System.out.println("\n === 게임 클리어 실패");

            }
        }

        PrintResult printer = new PrintResult();
        printer.print(myGame);

        gameList.add(myGame);

    }
}