package TP;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.BoxLayout;
import java.awt.GridLayout;
import java.awt.Image;

import javax.swing.JScrollPane;
import javax.swing.JList;
import javax.swing.JTextPane;
import javax.swing.JInternalFrame;
import javax.swing.SpringLayout;
import javax.swing.JToggleButton;
import javax.swing.JEditorPane;
import javax.swing.JButton;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import javax.swing.JSpinner;
import javax.swing.JPasswordField;
import javax.swing.JProgressBar;
import java.awt.TextField;
import java.awt.CardLayout;
import javax.swing.JSeparator;
import net.miginfocom.swing.MigLayout;
import java.awt.Panel;
import javax.swing.JScrollBar;
import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.JTextField;
import javax.swing.JTable;
import javax.swing.AbstractListModel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLayeredPane;
import javax.swing.JToolBar;
import javax.swing.JTextArea;
import javax.swing.table.DefaultTableModel;
import javax.swing.JDesktopPane;
import java.awt.Label;
import javax.swing.JCheckBoxMenuItem;
import java.awt.Component;
import javax.swing.ListSelectionModel;
import javax.swing.border.BevelBorder;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;

import javax.swing.border.LineBorder;
import javax.imageio.ImageIO;
import javax.swing.AbstractAction;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Action;
import javax.swing.ImageIcon;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

import javax.swing.filechooser.FileNameExtensionFilter;

import java.sql.Connection;
import comm.dbConnector;

public class Member_ctrl_form extends JFrame {

	private JPanel contentPane;
	private JTextField USER_NAME;
	private JTextField USER_BIRTH;
	private JTextField USER_PHONE_NUMBER;
	private JTextField USER_MAIL;
	private final Action action = new SwingAction();
	private JTable table;
	dbConnector dbConn = new dbConnector();

	// 이미지를 넣을 ArrayList
	// ArrayList<Image> tmpImg =new ArrayList<>();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Member_ctrl_form frame = new Member_ctrl_form();
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
	public Member_ctrl_form() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 988, 967);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		ArrayList<Image> tmpImg = new ArrayList<>(); // 이미지 저장
		JPanel panel = new JPanel();
		panel.setBackground(SystemColor.activeCaption);
		panel.setBounds(5, 5, 1603, 23);
		contentPane.add(panel);
		panel.setLayout(null);

		JButton selectMemberManagementButton = new JButton("회원관리"); // 회원관리
		selectMemberManagementButton.setBounds(0, 0, 97, 23);
		panel.add(selectMemberManagementButton);

		// "회원목록" 버튼을 누를시 USER_TABLE의 값을 모두 가져와 JTABLE에 출력
		JButton membershipListButton = new JButton("회원목록"); // 회원목록
		membershipListButton.setBounds(358, 0, 97, 23);
		panel.add(membershipListButton);
		membershipListButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "태이블표를 새로 고침함", "Message", JOptionPane.ERROR_MESSAGE);
			}
		});

		JPanel panel_1 = new JPanel();
		panel_1.setBounds(5, 28, 943, 870);
		contentPane.add(panel_1);
		panel_1.setLayout(null);

		JPanel panel_3 = new JPanel();
		panel_3.setBounds(0, 0, 314, 870);
		panel_3.setBackground(Color.WHITE);
		panel_1.add(panel_3);
		panel_3.setLayout(new GridLayout(0, 1, 0, 0));

		JPanel panel_5 = new JPanel();
		panel_5.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_3.add(panel_5);
		panel_5.setLayout(null);

		JLabel labelName = new JLabel("이름");
		labelName.setBounds(25, 10, 41, 15);
		panel_5.add(labelName);

		// 회원 이름을 입력할 텍스트 필드
		USER_NAME = new JTextField();
		USER_NAME.setBounds(78, 7, 116, 21);
		panel_5.add(USER_NAME);
		USER_NAME.setColumns(10);

		JLabel labelBirth = new JLabel("생년월일");
		labelBirth.setBounds(16, 35, 57, 15);
		panel_5.add(labelBirth);

		// 회원의 생년월일을 입력할 텍스트 필드
		USER_BIRTH = new JTextField();
		USER_BIRTH.setBounds(78, 57, 226, 21);
		panel_5.add(USER_BIRTH);
		USER_BIRTH.setColumns(20);

		JLabel labelPhoneNumber = new JLabel("연락처");
		labelPhoneNumber.setBounds(25, 60, 41, 15);
		panel_5.add(labelPhoneNumber);

		// 회원의 휴대전화를 입력할 텍스트 필드
		USER_PHONE_NUMBER = new JTextField();
		USER_PHONE_NUMBER.setBounds(78, 32, 116, 21);
		panel_5.add(USER_PHONE_NUMBER);
		USER_PHONE_NUMBER.setColumns(10);

		JLabel labelMail = new JLabel("이메일");
		labelMail.setBounds(25, 85, 41, 15);
		panel_5.add(labelMail);

		// 회원의 이메일를 입력할 텍스트 필드
		USER_MAIL = new JTextField();
		USER_MAIL.setBounds(78, 82, 226, 21);
		panel_5.add(USER_MAIL);
		USER_MAIL.setColumns(20);

		// 이름을 입력하고 "회원검색" 버튼을 누르면 생년월일,연락처,이메일을 각각 USER_BIRTH, USER_PHONE_NUMBER,
		// USER_MAIL에 출력
		JButton memberSearchButton = new JButton("회원검색"); // 회원 검색
		memberSearchButton.setBounds(206, 6, 97, 23);
		panel_5.add(memberSearchButton);
		memberSearchButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				// JOptionPane.showMessageDialog(null, "이름을 입력하고 버튼을 누르면 생년/연락/이메일 각각의 텍스트필드에
				// 정보가 나옴", "Message",JOptionPane.ERROR_MESSAGE);
				if (USER_NAME.getText().equals("")) {
					JOptionPane.showMessageDialog(null, "이름을 입력하세요", "Message", JOptionPane.ERROR_MESSAGE);
				} else {
					String sql = "selet USER_PHONE_NUMBER, USER_BIRTH, USER_MAIL form USER_TATLE WHERE USER_NAME = ";
					String str = sql + "'" + USER_NAME.getText() + "'" + ";";
					try {
						ResultSet src = dbConn.executeQurey(str);

						while (src.next()) {
							USER_PHONE_NUMBER.setText(src.getString(1));
							USER_BIRTH.setText(src.getString(2));
							USER_MAIL.setText(src.getString(3));
						}

					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
				USER_NAME.setText("");
			}
		});
		// 텍스트 필드에 값을 입력하고 "회윈등록" 버튼을 누르면 이름, 생년월일, 연락처, 이메일, 등록일을 USER_TABLE에 데이터를 삽입
		// DB에 값이 안들어감 엌
		JButton membershipRegistrationButton = new JButton("회원등록"); // 회원등록
		membershipRegistrationButton.setBounds(16, 171, 97, 23);
		panel_5.add(membershipRegistrationButton);
		membershipRegistrationButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// JOptionPane.showMessageDialog(null, "이름/생년/연락/이메일을 입력하고 버튼을 누르면 등록일을 포함하여
				// USER_TABLE에 데이터를 삽입", "Message", JOptionPane.ERROR_MESSAGE);
				String sql = "insert into USER_TABLE(USER_PHONE_NUMBER, USER_NAME, USER_BIRTH, USER_MAIL) values(?,?,?,?)";
				Connection tmpConn = dbConn.getConnection();
				try {
					PreparedStatement ps = tmpConn.prepareStatement(sql);

					ps.setString(1, USER_PHONE_NUMBER.getText());
					ps.setString(2, USER_NAME.getText());
					ps.setString(3, USER_BIRTH.getText());
					ps.setString(4, USER_MAIL.getText());

				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				USER_PHONE_NUMBER.setText("");
				USER_NAME.setText("");
				USER_BIRTH.setText("");
				USER_MAIL.setText("");
			}
		});

		// 수정할 필드의 행을 어떻게 추적할지 모르겠음
		JButton membershipModificationButton = new JButton("회원수정"); // 회원 수정
		membershipModificationButton.setBounds(16, 204, 97, 23);
		panel_5.add(membershipModificationButton);
		membershipModificationButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "모든 테이블 필드에 값이 있을때 수정할 값을 수성하고 버튼을 클릭하면 수정된 값으로 DB에 저장", "Message",
						JOptionPane.ERROR_MESSAGE);
			}
		});

		// 테이블의 행을 어떻게 추적해서 수정할건지 모르겠음
		JButton deleteMembershipButton = new JButton("회원삭제"); // 회원 삭제
		deleteMembershipButton.setBounds(16, 237, 97, 23);
		panel_5.add(deleteMembershipButton);
		deleteMembershipButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "USER_BOOL의 값을 0(false)로 변환", "Message", JOptionPane.ERROR_MESSAGE);
			}
		});

		JLabel lblNewLabel_6 = new JLabel("");
		lblNewLabel_6.setBounds(16, 108, 57, 15);
		panel_5.add(lblNewLabel_6);

		JPanel panel_6 = new JPanel();
		panel_6.setBackground(SystemColor.activeCaption);
		panel_3.add(panel_6);
		panel_6.setLayout(null);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(340, 10, 591, 824);
		panel_1.add(scrollPane);

		// USER_TABLE의 값을 DB에서 가져와 출력
		table = new JTable();
		table.setModel(new DefaultTableModel(
				new Object[][] { { null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null }, },
				new String[] { "\uC5F0\uB77D\uCC98", "\uC774\uB984", "\uC0DD\uB144\uC6D4\uC77C", "\uC774\uBA54\uC77C",
						"\uD68C\uC6D0\uB4F1\uB85D\uC77C", "\uD68C\uC6D0\uC0C1\uD0DC" }));
		scrollPane.setViewportView(table);

	}

	private class SwingAction extends AbstractAction {
		public SwingAction() {
			putValue(NAME, "SwingAction");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}

		public void actionPerformed(ActionEvent e) {
		}
	}
}
