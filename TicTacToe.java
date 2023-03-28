import java.util.Scanner;
public class TicTacToe {
    public static void main(String[] args) {
        int turns = 0;
        String[][] board = {
                {" ", "1", "2", "3"},
                {"1", "-", "-", "-"},
                {"2", "-", "-", "-"},
                {"3", "-", "-", "-"},
        };
        for (int i = 0; i <= 3; i++) {
            for (int j = 0; j <= 3; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
        boolean win = false;
        while (!win) {
            System.out.println("'X', choose your location (row, column)");
            turns++;
            int row, column;
            Scanner scanner = new Scanner(System.in);
            row = scanner.nextInt();
            column = scanner.nextInt();
            while (board[row][column].equals("X") || board[row][column].equals("O")) {
                System.out.println("Invalid. Enter again.");
                System.out.println("'X', choose your location (row, column)");
                row = scanner.nextInt();
                column = scanner.nextInt();
            }
            while (row >= 4 || row <= 0 || column >= 4 || column <= 0) {
                System.out.println("Invalid. Enter again.");
                System.out.println("'X', choose your location (row, column)");
                row = scanner.nextInt();
                column = scanner.nextInt();
            }
            board[row][column] = "X";
            for (int i = 0; i <= 3; i++) {
                for (int j = 0; j <= 3; j++) {
                    System.out.print(board[i][j] + " ");
                }
                System.out.println();
            }
            if (board[1][1].equals("X") && board[1][2].equals("X") && board[1][3].equals("X")) {
                System.out.println("'X' wins");
                break;
            } else if (board[1][1].equals("X") && board[2][2].equals("X") && board[3][3].equals("X")) {
                System.out.println("'X' wins");
                break;
            } else if (board[1][3].equals("X") && board[2][2].equals("X") && board[3][1].equals("X")) {
                System.out.println("'X' wins");
                break;
            } else if (board[2][1].equals("X") && board[2][2].equals("X") && board[2][3].equals("X")) {
                System.out.println("'X' wins");
                break;
            } else if (board[3][1].equals("X") && board[3][2].equals("X") && board[3][3].equals("X")) {
                System.out.println("'X' wins");
                break;
            } else if (board[1][1].equals("X") && board[2][1].equals("X") && board[3][1].equals("X")) {
                System.out.println("'X' wins");
                break;
            } else if (board[1][2].equals("X") && board[2][2].equals("X") && board[3][2].equals("X")){
                break;
            } else if (board[1][3].equals("X") && board[2][3].equals("X") && board[3][3].equals("X")){
                break;
            }
            
            //game tie
            if(turns==9){
                System.out.println("It's a tie!");
                break;
            }
            //O
            System.out.println("'O', choose your location (row, column)");
            turns++;
            row = scanner.nextInt();
            column = scanner.nextInt();
            while (board[row][column].equals("X") || board[row][column].equals("O")) {
                System.out.println("Invalid. Enter again.");
                System.out.println("'O', choose your location (row, column)");
                row = scanner.nextInt();
                column = scanner.nextInt();
            }
            while (row >= 4 || row <= 0 || column >= 4 || column <= 0) {
                System.out.println("Invalid. Enter again.");
                System.out.println("'O', choose your location (row, column)");
                row = scanner.nextInt();
                column = scanner.nextInt();
            }
            board[row][column] = "O";
            for (int i = 0; i <= 3; i++) {
                for (int j = 0; j <= 3; j++) {
                    System.out.print(board[i][j] + " ");
                }
                System.out.println();
            }
            if (board[1][1].equals("O") && board[1][2].equals("O") && board[1][3].equals("O")) {
                System.out.println("'O' wins");
                break;
            } else if (board[1][1].equals("O") && board[2][2].equals("O") && board[3][3].equals("O")) {
                System.out.println("'O' wins");
                break;
            } else if (board[1][3].equals("O") && board[2][2].equals("O") && board[3][1].equals("O")) {
                System.out.println("'O' wins");
                break;
            } else if (board[2][1].equals("O") && board[2][2].equals("O") && board[2][3].equals("O")) {
                System.out.println("'O' wins");
                break;
            } else if (board[3][1].equals("O") && board[3][2].equals("O") && board[3][3].equals("O")) {
                System.out.println("'O' wins");
                break;
            } else if (board[1][1].equals("O") && board[2][1].equals("O") && board[3][1].equals("O")) {
                System.out.println("'O' wins");
                break;
            } else if (board[1][2].equals("O") && board[2][2].equals("O") && board[3][2].equals("O")){
                break;
            } else if (board[1][3].equals("O") && board[2][3].equals("O") && board[3][3].equals("O")){
                break;
            }
        }
    }
}