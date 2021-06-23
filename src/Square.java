public class Square {

    private boolean isOccupied;
    private boolean isWhite;
    private boolean isBlack;
    private Piece currentPiece;


    public Square( boolean isBlack, boolean isWhite, boolean isOccupied, Piece currentPiece){

        this.isBlack = isBlack;
        this.isWhite = isWhite;
        this.isOccupied = isOccupied;
        this.currentPiece = currentPiece;



    }

    public boolean getOccupied(){

        return isOccupied;
    }

    public void moveIn(){

        isOccupied = true;

    }

    public void moveOut(){

        isOccupied = false;

    }
    public void takeIn(String newPiece){


        currentPiece = new Piece(newPiece);

    }

    public String getColor(){

        if(isBlack == true) return "Black";
        else return "White";


    }

    public String getPiece(){

        return currentPiece.getType();
    }
}
