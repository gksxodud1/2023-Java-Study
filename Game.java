public class Game {
    public static void main(String[] args) {

        int gameCount = 3;
        BaseBallGame myGame = new BaseBallGame(gameCount);


        myGame.genNumber();
        myGame.inputUserNumber();
        myGame.checkNumber();
        myGame.printResult();

    }
}
