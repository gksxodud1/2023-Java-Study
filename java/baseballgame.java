package hw1week.java;
import java.util.Random;
import java.util.Scanner;
public class baseballgame {
    public static void main(String[] args) {
        Random r = new Random();
        Scanner sc = new Scanner(System.in);

        int num1 = r.nextInt(9)+1; //num1  에는 랜덤한 1~9까지의 숫자를 넣는다
        int num2 = r.nextInt(9) +1; // 얘도

        while (num1 == num2) {    //만약에 num1  값이랑 num2 값이랑 같으면
            num2 = r.nextInt();  //num 2 숫자에 다시 숫자 넣어주기
        }
        int num3 = r.nextInt(9) +1;  //num3 에 랜덤한 1~9 까지 숫자넣기

        while (num1==num3 || num2 == num3) { // 비교해봤는데 또 숫자 같으면
            num3 = r.nextInt(9)+1;  // num3 에 다시 숫자 넣어주기
        }
        while (true) {   //입력값 받기  다른숫자 입력해야함 중복 x
            System.out.println("숫자 1입력:");
            int me1=sc.nextInt();
            System.out.println("숫자 2 입력 :");
            int me2 =sc.nextInt();
            System.out.println("숫자 3 입력:");
            int me3 = sc.nextInt();

            if(me1 < 1 || me1 > 9 || me2 < 1 || me2 > 9 || me3 < 1 || me3 > 9){   //잘못입력됐는지 체크
            System.out.println("1부터 9까지만 입력해주세요");
            continue;    //문자 출력하고 다시 반복 진행
        }
        if (me1 == me2 || me1 == me3 || me2 == me3) {    //숫자 중복 체크
            System.out.println("중복된 숫자를 입력했어요.");
            continue;  //문자 출력하고 다시 반복 진행
        }
        int strike = 0;  //스트라이크 변수 생성
        int ball = 0;

        if (me1 == num1) {   //값이랑 순서 같으면 스트라이크
            strike++;
        }
        if (me2 ==num2 ) {
            strike++;

        }
        if (me2 ==num3) {
            strike++;
        }

        if (me1 ==num2 || num1 == me3 ) { // 만약 입력값이랑 랜덤숫자랑 같은데 다른 자리에 위치하면 볼
            ball++;
        }
        if (me2 ==num1 || num2 == me3 ) {
            ball++;
        }
        if (me3 ==num1 || num3 == me2 ) {
            ball++;
        }
        //스트라이크 3개 나올때 까지 게임 계속 진행하는 설정
        if (strike ==3) {
            System.out.println("다 맞혔네.");
            break;

        } else if (strike == 0 && ball ==0 ) {    //숫자를 하나도 못맞췄을떄
            System.out.println("하나도 못맞췄다 바보야.");
        }
        else {     // 값 치면 스트라이크 몇개 볼 몇개 출력하는거
            System.out.println("스트라이크: " + strike+", 볼:" +ball+"입니다.");
        }

        }

        }


}
