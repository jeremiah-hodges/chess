public class Board {

    private Square[][] board;
    private boolean isBlack;
    private boolean isWhite;
    private boolean isOccupied;


    public Board() {

        board = new Square[8][8];
        boolean alternate = false;
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {

                if(alternate)
                    board[i][j] = new Square(true, false, false, null);

                else
                    board[i][j] = new Square(false, true, false, null);
                alternate = !alternate;
            }
        alternate = !alternate;
        }
    }

    public void populatePieces(){

        for(int i=0; i<board.length; i++){
            for(int j=0; j<board[i].length; j++){

                if(i == 1 || i ==6){
                    board[i][j].takeIn("Pawn");
                    board[i][j].moveIn();
                }
                else
                    board[i][j].takeIn("Pawn");
            }

        }



    }

    public void printBoardColor() {

        for(int i=0; i<board.length; i++){
            for(int j=0; j<board[i].length; j++){

                System.out.printf("%-10s", board[i][j].getColor());
            }
            System.out.print("\n");
        }

    }

    public void printBoardPieces(){
        for(int i=0; i<board.length; i++){
            for(int j=0; j<board[i].length; j++){

                if(board[i][j].getOccupied())
                    System.out.printf("%-10s", board[i][j].getPiece());
                else
                    System.out.printf("%-10s", "Empty");
            }
            System.out.print("\n");
        }

    }



    public static void main(String[] args){

        Board board = new Board();
        //board.printBoardColor();
        board.populatePieces();
        board.printBoardPieces();

    }
}
