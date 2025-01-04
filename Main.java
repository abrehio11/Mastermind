import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        System.out.println("You have 10 guesses to complete the code.");
        System.out.println("An 'h' indicates you have guessed a correct color in the right location,");
        System.out.println("An 'm' indicates you have guessed a correct color in the wrong location.");
        System.out.println("Choose a combination of four colors listed(repeats are allowed).");
        System.out.println("Colors: red(r), yellow(y), green(g), gray(a), purple(p), blue(b)");
        System.out.println("Ex: to guess green, gray, purple, red, enter 'gapr'");
        int guessesRemaining = 10;
        Boolean win = false;
        ArrayList<String> game = Code.getCode();
        while (guessesRemaining > 0 && win == false) {
            Mastermind master = new Mastermind();
            ArrayList<String> guess = master.guess();
            ArrayList<String> code = Mastermind.doCode(game, guess);
            if (guess.equals(game)) {
                System.out.println("Yay! You cracked the code!");
                win = true;
            } else {
                System.out.println(code);
                guessesRemaining--;
                System.out.println("You have " + guessesRemaining + " guesses remaining.");
            }
        }
        System.out.println("You ran out of guesses :(");
    }
}