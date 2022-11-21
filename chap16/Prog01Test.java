import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Prog01Test extends JFrame {
    public Prog01Test() {
        setTitle("배경색 바꾸기");
        JButton b = new JButton("클릭");
        JPanel p = new JPanel();
        p.add(b);
        add(p);

        b.addActionListener(e -> {
            if (p.getBackground() == Color.YELLOW)
                p.setBackground(null);
            else
                p.setBackground(Color.YELLOW);
        });

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 200);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Prog01Test();

    }
}
