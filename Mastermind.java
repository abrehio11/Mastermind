import java.util.ArrayList;
import java.util.Scanner;


public class Mastermind {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_GRAY = "\u001B[37m";


    public static ArrayList<String> doCode(ArrayList<String> colors, ArrayList<String> code) {
        ArrayList<String> feedback = new ArrayList<>();
        ArrayList<String> player = new ArrayList<>(colors);
        ArrayList<String> guess = new ArrayList<>(code);
        if (code.size() != 4) {
            System.out.println("Try again (need 4 inputs)");
            System.out.print("Make your guess:");
        }
        for (int i = 0; i < guess.size(); i++) {
                String playerG = player.get(i);
                String secret = guess.get(i);
                boolean hit = false;
                if (playerG.equals(secret)) {
                    feedback.add("h");
                    player.set(i, "");
                    guess.set(i, "");
                    hit = true;
                }
                if (!hit && !playerG.equals("")) {
                    int j = player.indexOf(secret);
                    if (j != -1 && j != i) {
                        feedback.add("m");
                        player.set(j, "");
                        guess.set(i, "");
                    }
                }
            }
        System.out.println();
        System.out.print("Feedback: ");
        return feedback;
    }


    public ArrayList<String> guess() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Make your guess:");
        String input = scanner.nextLine();
        if (input.length() != 4) {
            System.out.println("Try again(need 4 inputs)");
            System.out.print("Make your guess:");
        }
        ArrayList<String> characters = new ArrayList<>();
        for (int i = 0; i < 4; i++){
            String substring = input.substring(i, i + 1);
            characters.add(substring);
        }
        for (int i = 0; i < 4; i++) {
            String row = "";
            if (characters.get(i).equals("r")) {
                row += ANSI_RED + "\u25A0" + ANSI_RESET;
                System.out.print(row);
            }
            if (characters.get(i).equals("g")) {
                row += ANSI_GREEN + "\u25A0" + ANSI_RESET;
                System.out.print(row);
            }
            if (characters.get(i).equals("y")) {
                row += ANSI_YELLOW + "\u25A0" + ANSI_RESET;
                System.out.print(row);
            }
            if (characters.get(i).equals("a")) {
                row += ANSI_GRAY + "\u25A0" + ANSI_RESET;
                System.out.print(row);
            }
            if (characters.get(i).equals("p")) {
                row += ANSI_PURPLE + "\u25A0" + ANSI_RESET;
                System.out.print(row);
            }
            if (characters.get(i).equals("b")) {
                row += ANSI_BLUE + "\u25A0" + ANSI_RESET;
                System.out.print(row);
            }
        }
        return characters;
    }
    /*I used 40 lines for this method because I had to print each letter input
    seperatly so that the colored squares corresponding to the letters would print
    out next to each other when they were added to row. I also wanted to make sure
    the input was not over four characters.
     */
}

