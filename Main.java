import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Main implements ActionListener {

    public Main() {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500 , 500);
        frame.setLayout(new FlowLayout());

        JMenuBar menu_bar = new JMenuBar();

        JMenu home_menu = new JMenu("Home");
        JMenu books_menu = new JMenu("Books");
        JMenu members_menu = new JMenu("Members");
        JMenu help_menu = new JMenu("Help");
        JMenu settings_menu = new JMenu("Settings");

        JMenuItem search_book_by_name = new JMenuItem("Search book by name");
        JMenuItem search_book_by_code = new JMenuItem("Search book by code");

        search_book_by_name.addActionListener(this);
        search_book_by_code.addActionListener(this);

        JMenuItem search_member_by_name = new JMenuItem("Search member by name");
        JMenuItem search_member_by_code = new JMenuItem("Search member by code");

        search_member_by_name.addActionListener(this);
        search_member_by_name.addActionListener(this);

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
            System.out.println("you search a book");
        }
    }
}
