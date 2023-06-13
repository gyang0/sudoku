import javax.swing.*;
import java.awt.*;

public class Sudoku {
    private final int WIDTH = 600;
    private final int HEIGHT = 600;
    private Board board;

    public void run(){
        JFrame window = new JFrame("Sudoku");
        window.setSize(WIDTH, HEIGHT);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setLayout(new BorderLayout());

        board = new Board();

        window.add(board, BorderLayout.CENTER);
        window.setVisible(true);
    }

    public static void main(String[] args) {
        new Sudoku().run();
    }
}
