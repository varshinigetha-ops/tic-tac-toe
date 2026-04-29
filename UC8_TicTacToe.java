public class UC8_TicTacToe {

    static char[][] board = {
        {'-', '-', '-'},
        {'-', '-', '-'},
        {'-', '-', '-'}
    };

    static boolean isHumanTurn = true;
    static boolean gameOver = false;

    public static void main(String[] args) {

        int turnCount = 0;

        while (!gameOver) {

            if (isHumanTurn) {
                System.out.println("Human turn");
                placeMove(0, 0, 'X');
            } else {
                System.out.println("Computer turn");
                placeMove(1, 1, 'O');
            }

            printBoard();

            turnCount++;

            // Stop after 2 turns (demo)
            if (turnCount == 2) {
                gameOver = true;
            }

            // Switch turn
            isHumanTurn = !isHumanTurn;
        }
    }

    // Place move on board
    static void placeMove(int row, int col, char symbol) {
        if (board[row][col] == '-') {
            board[row][col] = symbol;
        }
    }

    // Print board
    static void printBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
}