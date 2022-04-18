import java.util.Scanner;
public class GuessNumberTest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Player playerOne, playerTwo;
        GuessNumber guessNumberGame;
        String choice;

        System.out.println("Start The Game!");
        System.out.print("Type your name, player one: ");
        playerOne = new Player(scanner.next());
        System.out.print("Type your name, player two: ");
        playerTwo = new Player(scanner.next());
        guessNumberGame = new GuessNumber(playerOne, playerTwo);
        
        do {
            guessNumberGame.startGame();
            while(true) {
                System.out.println(playerOne.getName() + " is trying guess number! Your number is: ");
                playerOne.setNumber(scanner.nextInt());
                if (guessNumberGame.checkMove(playerOne))
                    break;
                System.out.println(playerTwo.getName() + " is trying guess number! Your number is: ");
                playerTwo.setNumber(scanner.nextInt());
                if (guessNumberGame.checkMove(playerTwo))
                    break;
            }
            do {
                System.out.println("Would you like to continue? [yes/no]");
                choice = scanner.next();
            } while (!choice.equals("no") && !choice.equals("yes"));
            
        } while (!choice.equals("no"));
    }
}