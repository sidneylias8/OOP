import java.util.*;

public class tictactoe{
    static char[][] board = {
            {'-', '-', '-'},
            {'-', '-', '-'},
            {'-', '-', '-'}
    };
    static Scanner input = new Scanner(System.in); //scanf
    static boolean win = false; //flag
    static boolean draw = false; // flag kalo seri

    public static void check(){
        for(int i = 0; i < 3; i++) {
            // barisnya yang dilooping
            if (board[i][0] == board[i][1] && board[i][0] == board[i][2] && board[i][0] != '-') {
                win = true;
                return;
            }
        }
        for(int i = 0; i < 3; i++) {
            // kolomnya yang dilooping
            if (board[0][i] == board[1][i] && board[0][i] == board[2][i] && board[0][i] != '-') {
                win = true;
                return;
            }
        }

        // diagonal kiri atas ke kanan bawah
        if(board[0][0] == board[1][1] && board[0][0] == board[2][2] && board[0][0] != '-'){
            win = true;
            return;
        }

        //diagonal kanan atas ke kiri bawah
        if(board[0][2] == board[1][1] && board[0][2] == board[2][0] && board[0][2] != '-'){
            win = true;
            return;
        }
    }

    public static void printboard(){
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void player1(){
        printboard();
        int x, y;

        do{
            System.out.print("Player 1 (O) move: ");
            x = input.nextInt();
            y = input.nextInt();
        }while(x < 0 || x > 2 || y < 0 || y > 2);

        // validasi kalo udah diisi, gabole diisi lagi
        if(board[x][y] != '-'){
            System.out.println("Udah ada yang isi");
            player1();
        }else{
            board[x][y] = 'O';
        }
        check();
        if(win){
            printboard();
            System.out.println("Player 1 (O) MENANG");
        }
    }

    public static void player2(){
        printboard();
        int x, y;

        do{
            System.out.print("Player 2 (X) move: ");
            x = input.nextInt();
            y = input.nextInt();
        }while(x < 0 || x > 2 || y < 0 || y > 2);

        // validasi kalo udah diisi, gabole diisi lagi
        if(board[x][y] != '-'){
            System.out.println("Udah ada yang isi");
            player2();
        }else{
            board[x][y] = 'X';
        }
        check();
        if(win){
            printboard();
            System.out.println("Player 2 (X) MENANG");
        }
    }

    public static boolean isFull(){
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                if(board[i][j] == '-'){
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args){
        while(!win && !draw){
            player1();
            if(win) break;

            if(isFull()){
                draw = true;
                break;
            }

            player2();
            if(win) break;

            if(isFull()){
                draw = true;
                break;
            }
        }
        if(draw){
            printboard();
            System.out.println("SERI");
        }
    }
}