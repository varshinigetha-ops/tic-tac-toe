public class UC5_TicTacToe {

    // Board with one occupied cell for testing
    static char[][] board = {
        {'-', '-', '-'},
        {'-', 'X', '-'},
        {'-', '-', '-'}
    };

    public static void main(String[] args) {

        // Test cases
        System.out.println(isValidMove(1, 1)); // false (already filled)
        System.out.println(isValidMove(0, 2)); // true (empty)
        System.out.println(isValidMove(3, 0)); // false (out of bounds)
    }

    // Method to validate move
    static boolean isValidMove(int row, int col) {

        // Check if within bounds
        if (row < 0 || row >= 3 || col < 0 || col >= 3) {
            return false;
        }

        // Check if cell is empty
        if (board[row][col] != '-') {
            return false;
        }

        // Valid move
        return true;
    }
}