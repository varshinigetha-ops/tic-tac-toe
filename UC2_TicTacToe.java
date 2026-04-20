import java.util.Random;

public class UC2_TicTacToe {

    static boolean isHumanTurn;
    static char humanSymbol;
    static char computerSymbol;

    public static void main(String[] args) {
        tossAndAssignSymbols();
        displayResult();
    }

    static void tossAndAssignSymbols() {
        Random rand = new Random();
        int toss = rand.nextInt(2);

        if (toss == 0) {
            isHumanTurn = true;
            humanSymbol = 'X';
            computerSymbol = 'O';
        } else {
            isHumanTurn = false;
            humanSymbol = 'O';
            computerSymbol = 'X';
        }
    }

    static void displayResult() {
        if (isHumanTurn) {
            System.out.println("Human plays first");
        } else {
            System.out.println("Computer plays first");
        }

        System.out.println("Human: " + humanSymbol);
        System.out.println("Computer: " + computerSymbol);
    }
}