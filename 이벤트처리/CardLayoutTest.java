import javax.swing.*;
import java.awt.*;

public class CardLayoutTest extends JFrame {
    public CardLayoutTest() {
        setTitle("카드 돌리기");
        JPanel p1 = new JPanel();
        JButton l2 = new JButton("<<");
        JButton l1 = new JButton("<");
        JButton r2 = new JButton(">>");
        JButton r1 = new JButton(">");
        p1.add(l2);
        p1.add(l1);
        p1.add(r1);
        p1.add(r2);
        add("North", p1);
        CardLayout card = new CardLayout();
        JPanel p2 = new JPanel(card);
        JButton[] b = new JButton[5];
        for (int i = 1; i <= 5; i++) {
            b[i - 1] = new JButton("카드번호" + i);
            p2.add(b[i-1]);
        }
        add("Center", p2);
        l2.addActionListener(e -> card.first(p2));
        l1.addActionListener(e -> card.previous(p2));
        r1.addActionListener(e -> card.next(p2));
        r2.addActionListener(e -> card.last(p2));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 200);
        setVisible(true);

    }

    public static void main(String[] args) {

        new CardLayoutTest();
    }
}
