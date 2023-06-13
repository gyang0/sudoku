import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Board extends JComponent implements MouseListener {
    private final int SQUARES_PER_ROW = 9;
    private final int GROUP_BY = 3;
    private final int SQUARE_SIZE = 50;
    private Square[][] squares;

    public Board(){
        squares = new Square[SQUARES_PER_ROW][SQUARES_PER_ROW];
        for(int i = 0; i < SQUARES_PER_ROW; i++){
            for(int j = 0; j < SQUARES_PER_ROW; j++) {
                squares[i][j] = new Square(0, i * SQUARE_SIZE, j * SQUARE_SIZE, SQUARE_SIZE);
            }
        }
    }

    @Override
    public void paintComponent(Graphics g){
        for(int i = 0; i < SQUARES_PER_ROW; i++){
            for(int j = 0; j < SQUARES_PER_ROW; j++){
                squares[i][j].paint(g);
            }
        }

        // Grid lines

        // Thicker lines to group off 9-block areas
    }

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    // Unused methods
    @Override public void mousePressed(MouseEvent e) {}
    @Override public void mouseReleased(MouseEvent e) {}
    @Override public void mouseEntered(MouseEvent e) {}
    @Override public void mouseExited(MouseEvent e) {}
}
