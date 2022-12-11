//원 넓이 구하기

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class EventDemo extends JFrame {
    JTextField t1, t2;
    JTextArea area;

    public EventDemo() {
        setTitle("원 넓이 구하기");

        setLayout(new BorderLayout(10, 10));
        showNorth();
        showCenter();
        showSouth();

        addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                System.out.println("click");
            }

            @Override
            public void mousePressed(MouseEvent e) {
                System.out.println("pressed");
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                System.out.println("release");
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                System.out.println("entered");
            }

            @Override
            public void mouseExited(MouseEvent e) {
                System.out.println("exited");
            }
        });

        addMouseMotionListener(new MouseMotionListener() {
            @Override
            public void mouseDragged(MouseEvent e) {
                System.out.println("dragged(" + e.getX() + ", " + e.getY() + ")");
            }

            @Override
            public void mouseMoved(MouseEvent e) {
                System.out.println("moved(" + e.getX() + ", " + e.getY() + ")");
            }
        });

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 200);
        setVisible(true);
    }

    void showNorth() {
        JPanel panel = new JPanel(new GridLayout(2, 2));

        JLabel l1 = new JLabel("원의 반지름");
        l1.setHorizontalAlignment(SwingConstants.CENTER);
        t1 = new JTextField(10);
        JLabel l2 = new JLabel("원의 넓이");
        l2.setHorizontalAlignment(SwingConstants.CENTER);
        t2 = new JTextField(10);
        t2.setEditable(false);

        panel.add(l1);
        panel.add(t1);
        panel.add(l2);
        panel.add(t2);

        add(panel, BorderLayout.NORTH);

        KeyListener listener2 = new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
                System.out.println(e.getKeyChar() + " 입력함");
            }

            @Override
            public void keyPressed(KeyEvent e) {

            }

            @Override
            public void keyReleased(KeyEvent e) {

            }
        };
        t1.addKeyListener(listener2);
    }

    void showCenter() {
        JPanel panel = new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 10));
        area = new JTextArea(30, 20);
        area.setText("이 영역에 원의 넓이를\n 계산하는 ...");
        area.setEditable(false);
        area.setForeground(Color.RED);

        panel.add(area);
        add(panel, BorderLayout.CENTER);
    }

    void showSouth() {
        String[] colors = {"red", "blue"};
        JPanel panel = new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 10));

        JButton cal = new JButton("계산");
        JComboBox<String> cb = new JComboBox<>(colors);
        JButton rst = new JButton("리셋");

        panel.add(cal);
        panel.add(cb);
        panel.add(rst);

        add(panel, BorderLayout.SOUTH);

        ActionListener listener1 = e -> {
            if (e.getSource() == cal) {
                if (t1.getText().isEmpty())
                    area.setText("반지름을 입력하세요.");
                else {
                    double r = Double.parseDouble(t1.getText());
                    double result = r * r * 3.14;
                    t2.setText(result + "");
                    area.setText(r + " * " + r + " * 3.14 = " + result);
                }
            } else {
                t1.setText("");
                t2.setText("");
                area.setText("");
            }
        };

        cal.addActionListener(listener1);
        rst.addActionListener(listener1);
        cb.addItemListener(e -> {
            int i = cb.getSelectedIndex();
            if (i == 0)
                area.setForeground(Color.RED);
            else
                area.setForeground(Color.BLUE);
        });
    }


    public static void main(String[] args) {
        new EventDemo();

    }
}
