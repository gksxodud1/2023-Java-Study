package baseball;

public class gameStart {
    public static void main(String[] args) {
        int gameLife = 3;
        baseballgame Game = new baseballgame(gameLife);
        Game.start();
        Game.printResult();
    }
}
