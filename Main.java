import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Main implements ActionListener {

    public JFrame frame;
    public JMenuBar menu_bar;
    public JMenu home_menu, books_menu, members_menu, help_menu, settings_menu;
    public JMenuItem search_book_by_name, search_book_by_code, search_member_by_name, search_member_by_code;
    public ImageIcon logo , search_img , library_img;
    public JLabel welcome_label , background_label;
//    public JPanel panel;


    public Main() {
        frame = new JFrame();

        //closes the software when the X of the frame is clicked.
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //sets the screen size to be the screen size of the computer
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        frame.setSize(screenSize);

        frame.setTitle("Library System");

        //sets the icon to the logo of the library
        logo = new ImageIcon("logo_brown.png");
        frame.setIconImage(logo.getImage());

        frame.setLayout(new FlowLayout());

        menu_bar = new JMenuBar();

        home_menu = new JMenu("Home");
        books_menu = new JMenu("Books");
        members_menu = new JMenu("Members");
        help_menu = new JMenu("Help");
        settings_menu = new JMenu("Settings");

        //sets the background color of the JMenu
        home_menu.setBackground(Color.decode("#F8EBDD"));

        search_book_by_name = new JMenuItem("Search book by name");
        search_book_by_code = new JMenuItem("Search book by code");

        search_member_by_name = new JMenuItem("Search member by name");
        search_member_by_code = new JMenuItem("Search member by code");

        search_book_by_name.addActionListener(this);
        search_book_by_code.addActionListener(this);

        search_member_by_name.addActionListener(this);
        search_member_by_code.addActionListener(this);

        //add Shortcuts
        //click on Alt + the letter (VK_?) and it will be opened
        home_menu.setMnemonic(KeyEvent.VK_H);
        books_menu.setMnemonic(KeyEvent.VK_B);
        members_menu.setMnemonic(KeyEvent.VK_M);
        help_menu.setMnemonic(KeyEvent.VK_H);
        settings_menu.setMnemonic(KeyEvent.VK_S);

        search_book_by_name.setMnemonic(KeyEvent.VK_S);
        search_book_by_name.setMnemonic(KeyEvent.VK_S);

        search_book_by_name.setMnemonic(KeyEvent.VK_M);
        search_book_by_name.setMnemonic(KeyEvent.VK_M);

        //image icon of the search
        search_img = new ImageIcon("search.png");

        search_book_by_name.setIcon(search_img);
//        search_book_by_code.setIcon(search_img);
//        search_member_by_name.setIcon(search_img);
//        search_member_by_name.setIcon(search_img);


        books_menu.add(search_book_by_name);
        books_menu.add(search_book_by_code);

        members_menu.add(search_member_by_name);
        members_menu.add(search_member_by_code);

        menu_bar.add(home_menu);
        menu_bar.add(books_menu);
        menu_bar.add(members_menu);
        menu_bar.add(help_menu);
        menu_bar.add(settings_menu);

        //sets the background color of the menu bar (Hexadecimal value)
        menu_bar.setBackground(Color.decode("#594637"));

        frame.setJMenuBar(menu_bar);

        library_img = new ImageIcon("library_site_bg_gray.png");

        //creates a JLabel for the background image
        background_label = new JLabel(library_img);
        background_label.setLayout(new BorderLayout());

        //sets opacity to (50% --> 128 out of 255)
        background_label.setOpaque(true);
        background_label.setBackground(new Color(255, 255, 255, 80));

        // Uncomment the relevant code for the welcome_label
        welcome_label = new JLabel("WELCOME");
        welcome_label.setForeground(Color.BLACK);
        welcome_label.setFont(new Font("Calibri", Font.BOLD, 100));

        // Set the border to create space from the top
        welcome_label.setBorder(BorderFactory.createEmptyBorder(100, 400, 0, 400));

        // Add the JLabel to the background label
        background_label.add(welcome_label, BorderLayout.NORTH);



//        welcome_label = new JLabel("WELCOME TO OUR LIBRARY");
//        welcome_label.setForeground(Color.decode("#F8EBDD"));

        // Add the JLabel to the JMenu
//        frame.add(welcome_label);



//        welcome_label = new JLabel("Welcome to Friends Library!");
//        welcome_label.setFont(new Font("Calibri", Font.BOLD, 60));
//        welcome_label.setForeground(Color.decode("#F8EBDD"));
//
//        //creates a JPanel to hold the JLabel and sets its layout to the center of this frame
//        panel = new JPanel(new GridBagLayout());
//        panel.setBorder(BorderFactory.createEmptyBorder(150, 0, 0, 0));
//        panel.add(welcome_label);
//
//        panel.add(welcome_label);
//
//        frame.getContentPane().add(background_label, BorderLayout.CENTER);
//
//        //sets the content pane of the frame to the background label
        frame.setContentPane(background_label);

        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == search_book_by_name) {
            System.out.println("you search a book by name");
        }

        if (e.getSource() == search_book_by_code) {
            System.out.println("you search a book by code");
        }

        if (e.getSource() == search_member_by_name) {
            System.out.println("you search a member by name");
        }

        if (e.getSource() == search_member_by_code) {
            System.out.println("you search a member by code");
        }
    }

    public static void main(String[] args) {
        Main main = new Main();
    }

}
