import java.awt.*;

public class Square {
    private int num;
    private int x;
    private int y;
    private int w;

    public Square(int num, int x, int y, int w){
        this.num = num;
        this.x = x;
        this.y = y;
        this.w = w;
    }

    public void paint(Graphics g){
        g.setColor(Color.GRAY);
        g.fillRect(this.x, this.y, this.w, this.w);

        g.setColor(Color.BLACK);
        g.drawString(String.valueOf(num), this.x + this.w/2, this.y + this.w/2);
    }
}
