package TP;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JSplitPane;
import javax.swing.JToolBar;
import java.awt.Color;
import javax.swing.JLayeredPane;
import javax.swing.JToggleButton;
import javax.swing.SwingConstants;
import javax.swing.JSpinner;
import javax.swing.JLabel;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPopupMenu;
import java.awt.Component;
import java.awt.Dialog;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JRadioButtonMenuItem;
import javax.swing.JSlider;
import javax.swing.JPasswordField;
import javax.swing.JList;
import javax.swing.JProgressBar;
import javax.swing.JSeparator;
import javax.swing.JTree;
import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JRadioButton;
import java.awt.Font;
import java.awt.SystemColor;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.UIManager;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JScrollBar;
import java.awt.FlowLayout;
import javax.swing.JComboBox;
import javax.swing.ImageIcon;

public class Main_Frame extends JFrame {

	private JPanel contentPane;
	private JTextField Search_Filed;
	private JTextField tf_ISBN;
	private JTextField tf_Title;
	private JTextField tf_Authir;
	private JTextField tf_Pub;
	private JTextField tf_Price;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main_Frame frame = new Main_Frame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Main_Frame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 953, 723);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		JPanel Search = new JPanel();
		JPanel Main_panel = new JPanel();
		Main_panel.setBorder(UIManager.getBorder("TextArea.border"));
		Main_panel.setBackground(Color.WHITE);
		Main_panel.setBounds(12, 126, 913, 558);
		contentPane.add(Main_panel);
		Main_panel.setLayout(null);
		
		Search_Filed = new JTextField();
		Search_Filed.setBackground(SystemColor.activeCaption);
		Search_Filed.setBounds(0, 10, 521, 30);
		Main_panel.add(Search_Filed);
		Search_Filed.setColumns(10);
		
		JButton Search_Button = new JButton("Q");
		Search_Button.setFont(new Font("굴림", Font.BOLD, 20));
		Search_Button.setBackground(SystemColor.activeCaption);
		
		Search_Button.addActionListener(new ActionListener() {// 텍스트필드해당하는 문자열을 기반으로 DB출력되도록함.
			public void actionPerformed(ActionEvent e) {

				
				try {
					Class.forName("com.mysql.cj.jdbc.Driver");
					java.sql.Connection conn = DriverManager
							.getConnection("jdbc:mysql://jdb.deu.monster:60001/j20203000", "20203000", "!!!!20203000");
					System.out.println("DB연결완료");

					Statement stmt = conn.createStatement();

					String string_Oder = "select BOOK_ISBN,BOOK_TITLE,BOOK_AUTHIR,BOOK_PUB,BOOK_PRICE from BOOK_TABLE where BOOK_TITLE="+Search_Filed.getText();
					ResultSet rs2 = stmt.executeQuery(string_Oder);
					while (rs2.next()) {
						tf_ISBN.setText(rs2.getString("BOOK_ISBN"));
						tf_Title.setText(rs2.getString("BOOK_TITLE"));
						tf_Authir.setText(rs2.getString("BOOK_AUTHIR"));
						tf_Pub.setText(rs2.getString("BOOK_PUB"));
						tf_Price.setText(rs2.getString("BOOK_PRICE"));
					}
					Search.setVisible(true);

				} catch (ClassNotFoundException e1) {
					System.out.println("jdbc 드라이버 로드 에러");
				} catch (SQLException e2) {
					
				}
			
				
					
				
			}
		});

		Search_Button.setBounds(518, 10, 78, 30);
		Main_panel.add(Search_Button);

		
		Search.setVisible(false);
		Search.setBounds(0, 50, 596, 443);
		Main_panel.add(Search);
		Search.setLayout(null);
		
		tf_ISBN = new JTextField();
		tf_ISBN.setBounds(134, 29, 173, 21);
		Search.add(tf_ISBN);
		tf_ISBN.setColumns(10);
		
		JLabel BOOK_ISBN = new JLabel("ISBN");
		BOOK_ISBN.setBounds(34, 29, 84, 21);
		Search.add(BOOK_ISBN);
		
		JLabel BOOK_TITLE = new JLabel("\uC81C\uBAA9");
		BOOK_TITLE.setBounds(34, 60, 84, 21);
		Search.add(BOOK_TITLE);
		
		tf_Title = new JTextField();
		tf_Title.setColumns(10);
		tf_Title.setBounds(134, 60, 173, 21);
		Search.add(tf_Title);
		
		JLabel BOOK_AUTHIR = new JLabel("\uC800\uC790");
		BOOK_AUTHIR.setBounds(34, 95, 84, 21);
		Search.add(BOOK_AUTHIR);
		
		tf_Authir = new JTextField();
		tf_Authir.setColumns(10);
		tf_Authir.setBounds(134, 95, 173, 21);
		Search.add(tf_Authir);
		
		JLabel BOOK_PUB = new JLabel("\uCD9C\uD310\uC0AC");
		BOOK_PUB.setBounds(34, 126, 84, 21);
		Search.add(BOOK_PUB);
		
		tf_Pub = new JTextField();
		tf_Pub.setColumns(10);
		tf_Pub.setBounds(134, 126, 173, 21);
		Search.add(tf_Pub);
		
		JLabel BOOK_PRICE = new JLabel("\uAC00\uACA9");
		BOOK_PRICE.setBounds(34, 157, 84, 21);
		Search.add(BOOK_PRICE);
		
		tf_Price = new JTextField();
		tf_Price.setColumns(10);
		tf_Price.setBounds(134, 157, 173, 21);
		Search.add(tf_Price);
		
		JButton Hide_button = new JButton("\uD655\uC778");
		Hide_button.addActionListener(new ActionListener() {//다시 패널숨김.
			public void actionPerformed(ActionEvent e) {
				Search.setVisible(false);
			}
		});
		Hide_button.setBounds(210, 212, 97, 23);
		Search.add(Hide_button);

		JPanel South_panel = new JPanel();
		South_panel.setBackground(SystemColor.activeCaption);
		South_panel.setBounds(0, 503, 908, 30);
		Main_panel.add(South_panel);
		South_panel.setLayout(null);

		JPanel System_Log = new JPanel();
		System_Log.setBounds(608, 50, 300, 443);
		Main_panel.add(System_Log);
		System_Log.setLayout(null);

		JScrollPane Log = new JScrollPane();
		Log.setBounds(0, 0, 300, 443);
		System_Log.add(Log);

		JPanel Log_title = new JPanel();
		Log_title.setBounds(608, 10, 300, 36);
		Main_panel.add(Log_title);
		Log_title.setLayout(null);

		JPanel panel_Menubar = new JPanel();
		panel_Menubar.setBackground(SystemColor.activeCaption);
		panel_Menubar.setBounds(12, 100, 913, 24);
		contentPane.add(panel_Menubar);
		panel_Menubar.setLayout(null);

		JMenuBar menuBar = new JMenuBar();
		menuBar.setBackground(SystemColor.activeCaption);
		menuBar.setBounds(0, 0, 97, 23);
		panel_Menubar.add(menuBar);

		JMenu Service = new JMenu("\uB3C4\uC11C\uAD00 \uC11C\uBE44\uC2A4");
		menuBar.add(Service);

		JMenuItem rent_menu = new JMenuItem("\uB300\uC5EC/\uBC18\uB0A9");

		rent_menu.addActionListener(new ActionListener() {// 인아웃.자바
			public void actionPerformed(ActionEvent e) {
				Rent_ctrl_form io = new Rent_ctrl_form();
				io.setVisible(true);
			}
		});

		Service.add(rent_menu);

		JMenuItem book_menu = new JMenuItem("\uB3C4\uC11C\uAD00\uB9AC");
		book_menu.addActionListener(new ActionListener() {// 북.자바
			public void actionPerformed(ActionEvent e) {
				book_form bk = new book_form();
				bk.setVisible(true);
			}
		});

		Service.add(book_menu);

		JMenuItem man_menu = new JMenuItem("\uD68C\uC6D0\uAD00\uB9AC");
		man_menu.addActionListener(new ActionListener() {// 회원관리
			public void actionPerformed(ActionEvent e) {
				Member_ctrl_form member = new Member_ctrl_form();
				member.setVisible(true);
			}
		});

		Service.add(man_menu);

		JPanel panel_동의도서관 = new JPanel();
		panel_동의도서관.setBackground(Color.WHITE);
		panel_동의도서관.setBounds(12, 10, 161, 34);
		contentPane.add(panel_동의도서관);
		panel_동의도서관.setLayout(null);

		JLabel lblNewLabel = new JLabel("\uB3D9\uC758 \uB3C4\uC11C\uAD00");
		lblNewLabel.setBounds(0, 0, 160, 30);
		panel_동의도서관.add(lblNewLabel);
		lblNewLabel.setBackground(SystemColor.activeCaption);
		lblNewLabel.setFont(new Font("굴림", Font.PLAIN, 30));
	}

	private static void addPopup(Component component, final JPopupMenu popup) {
	}
}
