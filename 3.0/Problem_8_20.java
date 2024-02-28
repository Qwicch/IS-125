import java.util.Arrays;
import java.util.Scanner;

public class Problem_8_20 {

    public static void main(String[] args) {
        int turn = 1;
        char player = 'R';
        boolean winner = false;

        startGame(winner, turn, player);
    }

    public static void startGame(boolean winner, int turn, char player) {

        Scanner input = new Scanner(System.in);
        char[][] board = new char[6][7];

        //initialize array
        for (char[] strings : board) {
            Arrays.fill(strings, ' ');
        }


        //play a turn
        try {
            while (!winner && turn <= 42) {
                boolean isValidPlay;
                int column;
                do {
                    printBoard(board);

                    System.out.printf("Drop a %s disk at column (0–6)\n --> ", player);
                    column = input.nextInt();

                    //validate column
                    isValidPlay = isValid(column, board);

                } while (!isValidPlay);

                //drop the checker
                for (int row = board.length - 1; row >= 0; row--) {
                    if (board[row][column] == ' ') {
                        board[row][column] = player;
                        break;
                    }
                }

                //determine if there is a winner
                winner = isWinner(board, player);

                //switch players
                if (player == 'R') {
                    player = 'Y';
                } else {
                    player = 'R';
                }

                turn++;
            }
            printBoard(board);

            if (winner) {
                if (player == 'R') {
                    System.out.println("Yellow won");
                } else {
                    System.out.println("Red won");
                }
            } else {
                System.out.println("Tie game");
            }
        } catch (Exception ex) {
            System.out.println("Invalid Input.");
        }
    }

    public static void printBoard(char[][] grid){
        for (int i = 0; i < 7; i++)
            System.out.printf("%4d", i);
        System.out.println();

        System.out.println("-".repeat(30));
        for (char[] chars : grid) {
            System.out.print(" | ");
            for (int column = 0; column < grid[0].length; column++) {
                System.out.print(chars[column]);
                System.out.print(" | ");
            }
            System.out.println();
            System.out.println("-".repeat(30));
        }
        for (int i = 0; i < 7; i++)
            System.out.printf("%4d", i);
        System.out.println();
        System.out.println();
    }

    public static boolean isValid(int column, char[][] grid){
        //valid column?
        if (column < 0 || column > grid[0].length){
            return false;
        }

        //full column?
        return grid[0][column] == ' ';
    }

    public static boolean isWinner(char[][] grid, char player) {
        // Check for horizontal wins
        for (int row = 0; row < grid.length; row++) {
            for (int column = 0; column < grid[0].length - 3; column++) {
                if (grid[row][column] == player && grid[row][column + 1] == player && grid[row][column + 2] == player && grid[row][column + 3] == player) {
                    return true;
                }
            }
        }

        // Check for vertical wins
        for (int row = 0; row < grid.length - 3; row++) {
            for (int column = 0; column < grid[0].length; column++) {
                if (grid[row][column] == player && grid[row + 1][column] == player && grid[row + 2][column] == player && grid[row + 3][column] == player) {
                    return true;
                }
            }
        }

        // Check for diagonal wins (top-left to bottom-right)
        for (int row = 0; row < grid.length - 3; row++) {
            for (int column = 0; column < grid[0].length - 3; column++) {
                if (grid[row][column] == player && grid[row + 1][column + 1] == player && grid[row + 2][column + 2] == player && grid[row + 3][column + 3] == player) {
                    return true;
                }
            }
        }

        // Check for diagonal wins (top-right to bottom-left)
        for (int row = 0; row < grid.length - 3; row++) {
            for (int column = 3; column < grid[0].length; column++) {
                if (grid[row][column] == player && grid[row + 1][column - 1] == player && grid[row + 2][column - 2] == player && grid[row + 3][column - 3] == player) {
                    return true;
                }
            }
        }
        // No wins found
        return false;
    }
}