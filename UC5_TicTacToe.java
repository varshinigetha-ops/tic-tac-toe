/**
 * TicTacToe
 * UC5: Validate User Move
 * Checks if the move is within bounds and if the cell is empty
 */

public class UC5_TicTacToe {

    // Pre-filled board (for testing)
    static char[][] board = {
        {'-', '-', '-'},
        {'-', 'X', '-'},
        {'-', '-', '-'}
    };

    public static void main(String[] args) {

        // Test cases
        System.out.println(isValidMove(1, 1)); // false (already filled)
        System.out.println(isValidMove(0, 2)); // true (empty cell)
        System.out.println(isValidMove(3, 0)); // false (out of bounds)

    }

    // Method to validate move
    static boolean isValidMove(int row, int col) {

        // Step 1: Check boundaries
        if (row < 0 || row >= 3 || col < 0 || col >= 3) {
            return false;
        }

        // Step 2: Check if cell is empty
        if (board[row][col] != '-') {
            return false;
        }

        // Step 3: Valid move
        return true;
    }
}