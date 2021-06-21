public class Board {

    private Piece[][] board;

    public Board() {

        board = new Piece[8][8];
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {

                if(i==1 || i==6)
                    board[i][j] = new Piece("Pawn");
                else if ((i==0 && j==0) || ((i==7 && j==0)) || (i==0 && j==7) || ((i==7 && j==7))   )
                    board[i][j] = new Piece("Rook");
                else
                    board[i][j] = new Piece("Empty");

            }

        }
    }

    public void printBoard() {

        for(int i=0; i<board.length; i++){
            for(int j=0; j<board[i].length; j++){

                System.out.printf("%-10s", board[i][j].getType() + " ");
            }
            System.out.print("\n");
        }

    }



    public static void main(String[] args){

        Board board = new Board();
        board.printBoard();

    }
}
