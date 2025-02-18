import java.util.*;

public class Player {
    private char symbol;
    private Scanner input;

    public Player(char symbol){
        this.symbol = symbol;
        this.input = new Scanner(System.in);
    }

    public void move(Board board){
        int x, y;

        do{
            board.printBoard();
            if(symbol == 'O'){
                System.out.print("Player 1 (O) move: ");
            }else if(symbol == 'X'){
                System.out.print("Player 2 (X) move: ");
            }
            x = input.nextInt();
            y = input.nextInt();
        }while(x < 0 || y < 0 || x > 2 || y > 2);

        //validasi kalo udah diisi, gabole diisi lagi
        if(board.getBoard()[x][y] != '-'){
            System.out.println("Udah ada yang isi");
            move(board);
        }else{
            board.getBoard()[x][y] = symbol;
        }

        board.checking();
    }
}
