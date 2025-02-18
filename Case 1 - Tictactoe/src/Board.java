
public class Board {
    private char[][] board;
    private boolean win;
    private boolean draw;

    public Board(){
        board = new char[][]{
            {'-', '-', '-'},
            {'-', '-', '-'},
            {'-', '-', '-'}
        };
        win = false; //flag
        draw = false; //flag kalo seri
    }

    public char[][] getBoard(){
        return board;
    }
    
    public void printBoard(){
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    public boolean isWin(){
        return win;
    }

    public boolean isDraw(){
        return draw;
    }

    public boolean isFull(){
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                if(board[i][j] == '-'){
                    return false;
                }
            }
        }
        draw = true;
        return true;
    }

    public void checking(){
        //cek baris sama kolom
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                //barisnya yg dilooping
                if(board[i][0] == board[i][1] && board[i][0] == board[i][2] && board[i][0] != '-'){
                    win = true;
                    return;
                }
                //kolomnya yg dilooping
                if(board[0][i] == board[1][i] && board[0][i] == board[2][i] && board[0][i] != '-'){
                    win = true;
                    return;
                }
            }
        }

        //cek diagonal kiri atas ke kanan bawah
        if(board[0][0] == board[1][1] && board[0][0] == board[2][2] && board[0][0] != '-'){
            win = true;
            return;
        }

        //cek diagonal kanan atas ke kiri bawah
        if(board[0][2] == board[1][1] && board[0][2] == board[2][0] && board[0][2] != '-'){
            win = true;
            return;
        }
    }
}
