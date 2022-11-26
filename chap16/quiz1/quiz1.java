import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class quiz1 extends JFrame {
    int v = 0;

    public quiz1() {
        setTitle("카운터");
        setLayout(new BorderLayout());

        JPanel p1 = new JPanel();
        JPanel p2 = new JPanel();

        JLabel label = new JLabel("개수=0");
        JButton incr = new JButton("증가");

        p1.add(label);
        p2.add(incr);

        add(p1, BorderLayout.NORTH);
        add(p2, BorderLayout.CENTER);

        ActionListener listener = e -> {

            if (e.getSource() == incr){
                v++;
                label.setText("개수=" + v);
            }
        };

        incr.addActionListener(listener);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 100);
        setVisible(true);
    }

    public static void main(String[] args) {
        new quiz1();

    }


}
