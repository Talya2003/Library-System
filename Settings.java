import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;


public class Settings extends JPanel implements KeyListener, ActionListener {

    public JFrame frame;

    public Settings() {
        frame = new JFrame("Settings");
        //closes the software when the X of the frame is clicked.
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //sets the screen size to be the screen size of the computer
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        frame.setSize(screenSize);
    }


    public static void main(String[] args) {
        Settings settings = new Settings();
    }




    @Override
    public void actionPerformed(ActionEvent e) {

    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {

    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
