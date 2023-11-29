import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;


public class Settings extends JPanel implements KeyListener, ActionListener {

    public JFrame frame;
    public JLabel title , label_language;

    public Settings() {
        frame = new JFrame("Settings");
        //closes only the settings page when the X of the frame is clicked.
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        //sets the screen size to be the screen size of the computer
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        frame.setSize(screenSize);

        frame.getContentPane().setBackground(Color.decode("#847772"));

        title = new JLabel("Settings");
        title.setForeground(Color.BLACK);
        title.setFont(new Font("Calibri", Font.BOLD, 70));
        // Set the border to create space from the top
        title.setBorder(BorderFactory.createEmptyBorder(-525, 515, 0, 515));

        frame.add(title);
        
        
        
        
        
        /////////////////////////////////////
        ////////////////////////////////////
        //////////// add a label //////////
        /////////////////////////////////////
        ////////////////////////////////////       
        
        

        String html_label_language = "<html></div><h5 style='font-size: 10px; color: #D4C5B6; font-family: 'Calibri' , sans-serif;'>Language: </h5></div></html>";
        label_language = new JLabel(html_label_language);
        frame.add(label_language);

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
