// 724페이지 2번문제
import javax.swing.*;
import java.awt.*;

public class CircleNRectTest extends JFrame {

    public CircleNRectTest() {
        setTitle("사각형 원");
        MyPanel mp = new MyPanel();
        add(mp);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(250, 120);
        setVisible(true);
    }

    class MyPanel extends JPanel {
        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            g.drawRect(10,10, 210, 50);
            g.fillOval(100, 25, 20,20);
        }
    }

    public static void main(String[] args) {
        new CircleNRectTest();
    }
}
