import javax.swing.*;
import java.awt.*;

// 도움이 되는 예제 : 교재 예제 15-9
public class Quiz03 extends JFrame {
    JButton[] btns = { new JButton("빨강"), new JButton("초록"), new JButton("파랑") };
    Color[] colors = { Color.RED, Color.GREEN, Color.BLUE };

    public Quiz03() {
        setLayout(new GridLayout(0, 3));
        for (int i = 0; i < 3; i++)
            add(btns[i]);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 200);
        setVisible(true);
    }

    // 필요하다면 메서드 추가
    public void exec() {
        while(true) {
            for(int i = 0; i < 3; i++)
                btns[i].setBackground(Color.WHITE);
            int j = (int)(Math.random() * 3);
            btns[j].setBackground(colors[j]);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
            }
        }
    }

    public static void main(String[] args) {
        new Quiz03().exec();
    }
}
