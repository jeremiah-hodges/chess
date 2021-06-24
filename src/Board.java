import java.util.ArrayList;

public class Board {

    private Square[][] board;
    private boolean isBlack;
    private boolean isWhite;
    private boolean isOccupied;
    private ArrayList<String> pieceNames;

    public Board() {

        pieceNames = new ArrayList<String>();
        pieceNames.add("Rook");
        pieceNames.add("Knight");
        pieceNames.add("Bishop");
        pieceNames.add("Queen");
        pieceNames.add("King");
        pieceNames.add("Pawn");

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

                if((i == 0 || i ==7)  && j<=4){
                    board[i][j].takeIn(pieceNames.get(j));
                    board[i][j].moveIn();
                }
                else if((i == 0 || i ==7 )&& j>4){
                    board[i][j].takeIn(pieceNames.get((j-7)*-1));
                    board[i][j].moveIn();
                }
                else if(i == 1 || i ==6){
                    board[i][j].takeIn(pieceNames.get(5));
                    board[i][j].moveIn();
                }

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
