import javax.swing.*;
import java.awt.*;

public class Game extends JFrame {

    public Game() {

        JFrame frame = new JFrame("Chess");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //frame.setResizable(false) prevents resizing
        frame.setSize(900, 900); //sets x-dimension and y-dimension of frame
        //frame.getContentPane().setBackground(new Color(50, 100, 100));
        frame.setResizable(false);

        int xDim = 0;
        int yDim = 0;
        boolean alternate = false;

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {

                if (alternate) {
                    JPanel whiteSquare = new JPanel();
                    whiteSquare.setBounds(xDim, yDim, 100, 100);
                    whiteSquare.setBackground(new Color(248, 248, 255));
                    frame.add(whiteSquare);
                    xDim += 100;
                    alternate = !alternate;

                } else {
                    JPanel blackSquare = new JPanel();
                    blackSquare.setBounds(xDim, yDim, 100, 100);
                    blackSquare.setBackground(Color.black);
                    frame.add(blackSquare);
                    xDim += 100;
                    alternate = !alternate;

                }


            }
            alternate = !alternate;
            xDim = 0;
            yDim += 100;

        }




        ImageIcon blackPawn = new ImageIcon("images/black_rook.png");
        JLabel blackPawnLabel = new JLabel();
        blackPawnLabel.setIcon(blackPawn);
        blackPawnLabel.setHorizontalAlignment(JLabel.CENTER);
        frame.add(blackPawnLabel);
        frame.setVisible(true);


    }


    public static void main(String[] args) {

        new Game();
    }


}

