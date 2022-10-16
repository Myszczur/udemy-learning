package swing;

import javax.swing.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class MouseListenerMouseMotionExample extends JFrame implements MouseListener {

    @Override
    public void mouseClicked(MouseEvent e) {
        System.out.println("mouse clicked");
        System.out.println("Click count: " + e.getClickCount());
        System.out.println("Window X:  " + e.getXOnScreen());
        System.out.println("Screen Y: " + e.getYOnScreen());

        String str = "Button clicked: ";
        switch (e.getButton()) {
            case MouseEvent.BUTTON1 -> str += " button1";
            case MouseEvent.BUTTON2 -> str += " button2";
            case MouseEvent.BUTTON3 -> str += " button3";
        }

        System.out.println("Mouse button: " + str);
    }

    @Override
    public void mousePressed(MouseEvent e) {
        System.out.println("mouse pressed");
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        System.out.println("mouse released");
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        System.out.println("mouseEntered");
    }

    @Override
    public void mouseExited(MouseEvent e) {
        System.out.println("mouseEntered");
    }

    public static void main(String[] args) {


        MouseListenerMouseMotionExample frame = new MouseListenerMouseMotionExample();

        frame.addMouseListener(frame);
        frame.addMouseMotionListener(new MouseMotionListener() {
            @Override
            public void mouseDragged(MouseEvent e) {
                System.out.println("mouseDragged");
            }

            @Override
            public void mouseMoved(MouseEvent e) {
                //       System.out.println("mouseMoved " + " X " + e.getX() + " Y " + e.getY());
            }
        });

        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

    }
}
