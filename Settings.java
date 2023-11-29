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
        //closes only the settings page when the X of the frame is clicked.
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        //sets the screen size to be the screen size of the computer
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        frame.setSize(screenSize);

        frame.getContentPane().setBackground(Color.decode("#847772"));

        frame.setVisible(true);
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
