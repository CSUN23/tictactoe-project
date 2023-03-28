import java.util.Scanner;
public class TicTacToe {
    public static void main(String[] args) {
        int cnt = 0;
        String[][] array = {
                {" ", "1", "2", "3"},
                {"1", "-", "-", "-"},
                {"2", "-", "-", "-"},
                {"3", "-", "-", "-"},
        };
        for (int i = 0; i <= 3; i++) {
            for (int j = 0; j <= 3; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        boolean win = false;
        while (!win) {
            System.out.println("'X', choose your location (row, column)");
            cnt++;
            int row, column;
            Scanner scanner = new Scanner(System.in);
            row = scanner.nextInt();
            column = scanner.nextInt();
            while (array[row][column].equals("X") || array[row][column].equals("O")) {
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
            array[row][column] = "X";
            for (int i = 0; i <= 3; i++) {
                for (int j = 0; j <= 3; j++) {
                    System.out.print(array[i][j] + " ");
                }
                System.out.println();
            }
            if (array[1][1].equals("X") && array[1][2].equals("X") && array[1][3].equals("X")) {
                System.out.println("'X' wins");
                break;
            } else if (array[1][1].equals("X") && array[2][2].equals("X") && array[3][3].equals("X")) {
                System.out.println("'X' wins");
                break;
            } else if (array[1][3].equals("X") && array[2][2].equals("X") && array[3][1].equals("X")) {
                System.out.println("'X' wins");
                break;
            } else if (array[2][1].equals("X") && array[2][2].equals("X") && array[2][3].equals("X")) {
                System.out.println("'X' wins");
                break;
            } else if (array[3][1].equals("X") && array[3][2].equals("X") && array[3][3].equals("X")) {
                System.out.println("'X' wins");
                break;
            } else if (array[1][1].equals("X") && array[2][1].equals("X") && array[3][1].equals("X")) {
                System.out.println("'X' wins");
                break;
            } else if (array[1][2].equals("X") && array[2][2].equals("X") && array[3][2].equals("X")){
                break;
            } else if (array[1][3].equals("X") && array[2][3].equals("X") && array[3][3].equals("X")){
                break;
            }
            
            //game tie
            if(cnt==9){
                System.out.println("It's a tie!");
                break;
            }
            //O
            System.out.println("'O', choose your location (row, column)");
            cnt++;
            row = scanner.nextInt();
            column = scanner.nextInt();
            while (array[row][column].equals("X") || array[row][column].equals("O")) {
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
            array[row][column] = "O";
            for (int i = 0; i <= 3; i++) {
                for (int j = 0; j <= 3; j++) {
                    System.out.print(array[i][j] + " ");
                }
                System.out.println();
            }
            if (array[1][1].equals("O") && array[1][2].equals("O") && array[1][3].equals("O")) {
                System.out.println("'O' wins");
                break;
            } else if (array[1][1].equals("O") && array[2][2].equals("O") && array[3][3].equals("O")) {
                System.out.println("'O' wins");
                break;
            } else if (array[1][3].equals("O") && array[2][2].equals("O") && array[3][1].equals("O")) {
                System.out.println("'O' wins");
                break;
            } else if (array[2][1].equals("O") && array[2][2].equals("O") && array[2][3].equals("O")) {
                System.out.println("'O' wins");
                break;
            } else if (array[3][1].equals("O") && array[3][2].equals("O") && array[3][3].equals("O")) {
                System.out.println("'O' wins");
                break;
            } else if (array[1][1].equals("O") && array[2][1].equals("O") && array[3][1].equals("O")) {
                System.out.println("'O' wins");
                break;
            } else if (array[1][2].equals("O") && array[2][2].equals("O") && array[3][2].equals("O")){
                break;
            } else if (array[1][3].equals("O") && array[2][3].equals("O") && array[3][3].equals("O")){
                break;
            }
        }
    }
}
