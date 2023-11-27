import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Main implements ActionListener {

    public JFrame frame;
    public JMenuBar menu_bar;
    public JMenu home_menu, books_menu, members_menu, help_menu, settings_menu;
    public JMenuItem search_book_by_name, search_book_by_code, search_member_by_name, search_member_by_code;

    public ImageIcon logo , search_img;


    public Main() {
        frame = new JFrame();

        //closes the software when the X of the frame is clicked.
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //sets the screen size to be the screen size of the computer
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        frame.setSize(screenSize);

        frame.setTitle("Library System");

        //sets the icon to the logo of the library
        logo = new ImageIcon("logo_library.png");
        frame.setIconImage(logo.getImage());

        frame.setLayout(new FlowLayout());

        menu_bar = new JMenuBar();

        home_menu = new JMenu("Home");
        books_menu = new JMenu("Books");
        members_menu = new JMenu("Members");
        help_menu = new JMenu("Help");
        settings_menu = new JMenu("Settings");

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

        //image icon
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

        frame.setJMenuBar(menu_bar);

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
