import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Main extends JPanel implements KeyListener , ActionListener {

    public JFrame frame;
    public JMenuBar menu_bar;
    public JMenu home_menu, books_menu, members_menu, help_menu, settings_menu;
    public JMenuItem search_book_by_name, search_book_by_code, search_member_by_name, search_member_by_code;
    public ImageIcon logo, search_img, library_img;
    public JLabel welcome_label, content_label, background_label, shorts_label;


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

        home_menu.setForeground(Color.WHITE);
        home_menu.setFont(new Font("Calibri", Font.BOLD, 14));

        books_menu.setForeground(Color.WHITE);
        books_menu.setFont(new Font("Calibri", Font.BOLD, 14));

        members_menu.setForeground(Color.WHITE);
        members_menu.setFont(new Font("Calibri", Font.BOLD, 14));

        help_menu.setForeground(Color.WHITE);
        help_menu.setFont(new Font("Calibri", Font.BOLD, 14));

        settings_menu.setForeground(Color.WHITE);
        settings_menu.setFont(new Font("Calibri", Font.BOLD, 14));

        //aligns the JMenu to the center of the JMenuBar
        home_menu.setHorizontalAlignment(SwingConstants.CENTER);
        books_menu.setHorizontalAlignment(SwingConstants.CENTER);
        members_menu.setHorizontalAlignment(SwingConstants.CENTER);
        help_menu.setHorizontalAlignment(SwingConstants.CENTER);
        settings_menu.setHorizontalAlignment(SwingConstants.CENTER);

        search_book_by_name.setMnemonic(KeyEvent.VK_S);
        search_book_by_name.setMnemonic(KeyEvent.VK_S);

        search_book_by_name.setMnemonic(KeyEvent.VK_M);
        search_book_by_name.setMnemonic(KeyEvent.VK_M);

        //image icon of the search
        search_img = new ImageIcon("search.png");

        search_book_by_name.setIcon(search_img);
        search_book_by_code.setIcon(search_img);
        search_member_by_name.setIcon(search_img);
        search_member_by_code.setIcon(search_img);


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
        menu_bar.setBackground(Color.decode("#847772"));

        frame.setJMenuBar(menu_bar);

        library_img = new ImageIcon("library_site_bg_gray.png");

        //creates a JLabel for the background image
        background_label = new JLabel(library_img);
        background_label.setLayout(new BorderLayout());

        //sets opacity to 32% --> 80 out of 255
        background_label.setOpaque(true);
        background_label.setBackground(new Color(255, 255, 255, 80));

        welcome_label = new JLabel("WELCOME");
        welcome_label.setForeground(Color.BLACK);
        welcome_label.setFont(new Font("Calibri", Font.BOLD, 100));
        // Set the border to create space from the top
        welcome_label.setBorder(BorderFactory.createEmptyBorder(100, 400, 0, 400));
        //adds the JLabel to the background label
        background_label.add(welcome_label, BorderLayout.NORTH);


        //the content of the home page
        String html_content = "<html><div><br/><br/><br/></div>"
                + "<p style='font-size: 10px; color: #D4C5B6; font-family: 'Calibri' , sans-serif;'>Welcome to the library system! " +
                "Our library was founded in 1948 with the birth of the state. Here you will feel at home. The good and calm atmosphere, " +
                "the vintage design <br/>and the warm attitude. Lorem ipsum dolor sit amet consectetur adipisicing elit. Aut tempora assumenda " +
                "voluptates, voluptas maiores beatae molestiae a corrupt similique <br/>magnam. Repellendus odit mollitia modi deserunt animi. " +
                "Lorem ipsum dolor sit amet consectetur adipisicing elit. Aut tempora assumenda voluptates, voluptas a maiores <br/>beatae molestiae " +
                "a corrupt similique magnam. Repellendus and odit mollitia modi deserunt animi.</p> </html>";
        //creates a label and put the content on the screen
        content_label = new JLabel(html_content);
        content_label.setBorder(BorderFactory.createEmptyBorder(-400, 100, 0, 0));
        //add this to the background label
        background_label.add(content_label);


        //sets the content pane of the frame to the background label
        frame.setContentPane(background_label);

        frame.setVisible(true);
    }


    public void paint(Graphics g) {
        g.setColor(Color.decode("#D4C5B6"));
        g.fillRect(100, 550, 100, 200);

        g.dispose();
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == search_book_by_name) {
            System.out.println("you search a book by name");
            show_search_dialog();
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


        repaint();
    }


    public void show_search_dialog() {
        class SearchDialog extends JDialog {
            private JTextField bookNameField;

            public SearchDialog(JFrame parent) {
                super(parent, "Search a book by its name", true);

                JPanel searchPanel = new JPanel(new GridLayout(2, 2));

                JLabel bookNameLabel = new JLabel("Book's name:");
                bookNameField = new JTextField();

                searchPanel.add(bookNameLabel);
                searchPanel.add(bookNameField);

                JButton searchButton = new JButton("Search");
                searchButton.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        String bookName = bookNameField.getText();
                        System.out.println("Searching for book: " + bookName);

                        //close this window if you finish the operation
                        dispose();
                    }
                });

                searchPanel.add(searchButton);
                add(searchPanel);

                pack();
                setLocationRelativeTo(parent);
            }
        }

        SearchDialog searchDialog = new SearchDialog(frame);
        searchDialog.setVisible(true);
    }


    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        repaint();
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }



    public static void main(String[] args) {
        Main main = new Main();
    }
}
