
public class Main {
    public static void main(String[] args) {
        Board board = new Board();
        Player player1 = new Player('O');
        Player player2 = new Player('X');

        while(!board.isWin() && !board.isDraw()){
            // player 1
            player1.move(board);
            if(board.isWin()){
                board.printBoard();
                System.out.println("Player 1 (O) MENANG!");
                break;
            }
            if(board.isFull()){
                board.printBoard();
                System.out.println("SERI!");
                break;
            }

            // player 2
            player2.move(board);
            if(board.isWin()){
                board.printBoard();
                System.out.println("Player 2 (X) MENANG!");
                break;
            }
            if(board.isFull()){
                board.printBoard();
                System.out.println("SERI!");
                break;
            }
        }
    }
}
