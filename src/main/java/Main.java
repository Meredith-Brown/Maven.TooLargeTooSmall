import java.util.ArrayList;
import java.util.Scanner;

import static com.sun.org.apache.xalan.internal.xsltc.compiler.util.Util.println;

/**
 * Created by iyasuwatts on 10/17/17.
 */
public class Main {

    public static String getIntInput(String prompt) {
        Scanner scanner = new Scanner(System.in);
        println(prompt);
        String inputString = scanner.nextLine();
        return inputString;
    }

    public static void main(String[] args) {
        ArrayList<Integer> array = new ArrayList<Integer>(0);
        int gameStatus = 0;
        int number = (int) ((Math.random() * (100 - 1)) + 1); // https://www.baeldung.com/java-generating-random-numbers-in-range
        int guesses = 0;
        while (gameStatus == 0) {
            String s = Main.getIntInput("Guess the number between 1 and 100!");
            int inputNum = Integer.parseInt(s); // https://www.javatpoint.com/java-string-to-int
            if (array.contains(inputNum)){
                System.out.println("You already guessed that number.");
            } else {
                if (inputNum == number) {
                    guesses++;
                    System.out.println("Correct!");
                    System.out.println("Total guesses: " + guesses);
                    gameStatus = 1;
                } else if (inputNum > number) {
                    guesses++;
                    array.add(inputNum);
                    System.out.println("too large");
                } else if (inputNum < number) {
                    guesses++;
                    array.add(inputNum);
                    System.out.println("too small");
                }
            }
        }
    }
}
