package TP;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTextField;
import java.awt.Panel;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.SystemColor;

public class book_form extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JTextField ISBN_TF;
	private JTextField title_TF;
	private JTextField Autior_TF;
	private JTextField Price_TF;
	private JTextField Rent_Tf;
	private JTextField Pub_TF;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					book_form frame = new book_form();
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
	public book_form() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1080, 830);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 31, 706, 750);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("ISBN");
		lblNewLabel.setBounds(12, 10, 57, 15);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("\uC81C\uBAA9");
		lblNewLabel_1.setBounds(12, 35, 57, 15);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("\uC800\uC790");
		lblNewLabel_2.setBounds(12, 62, 57, 15);
		panel.add(lblNewLabel_2);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(12, 319, 652, 421);
		panel.add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
			},
			new String[] {
				"ISBN", "\uC81C\uBAA9", "\uC800\uC790", "\uCD9C\uD310\uC0AC", "\uAC00\uACA9", "\uB300\uCD9C\uC5EC\uBD80"
			}
		));
		scrollPane.setViewportView(table);
		
		JLabel lblNewLabel_3 = new JLabel("\uAC00\uACA9");
		lblNewLabel_3.setBounds(12, 112, 57, 15);
		panel.add(lblNewLabel_3);
		
		JButton IN_Button = new JButton("\uB4F1\uB85D");
		IN_Button.setBounds(12, 174, 97, 23);
		panel.add(IN_Button);
		
		JButton out_Button = new JButton("\uC0AD\uC81C");
		out_Button.setBounds(12, 207, 97, 23);
		panel.add(out_Button);
		
		JLabel lblNewLabel_4 = new JLabel("\uB300\uCD9C \uC5EC\uBD80");
		lblNewLabel_4.setBounds(12, 137, 57, 15);
		panel.add(lblNewLabel_4);
		
		ISBN_TF = new JTextField();
		ISBN_TF.setBounds(81, 7, 116, 21);
		panel.add(ISBN_TF);
		ISBN_TF.setColumns(10);
		
		title_TF = new JTextField();
		title_TF.setBounds(81, 32, 116, 21);
		panel.add(title_TF);
		title_TF.setColumns(10);
		
		Autior_TF = new JTextField();
		Autior_TF.setBounds(81, 59, 116, 21);
		panel.add(Autior_TF);
		Autior_TF.setColumns(10);
		
		Price_TF = new JTextField();
		Price_TF.setBounds(81, 109, 116, 21);
		panel.add(Price_TF);
		Price_TF.setColumns(10);
		
		Rent_Tf = new JTextField();
		Rent_Tf.setBounds(81, 134, 116, 21);
		panel.add(Rent_Tf);
		Rent_Tf.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("\uB3C4\uC11C\uBAA9\uB85D");
		lblNewLabel_5.setBounds(23, 293, 57, 15);
		panel.add(lblNewLabel_5);
		
		JPanel man = new JPanel();
		man.setBackground(Color.WHITE);
		man.setBounds(307, 10, 163, 186);
		panel.add(man);
		man.setLayout(null);
		
		JButton Upload_Button = new JButton("\uC0AC\uC9C4 \uB4F1\uB85D");
		Upload_Button.setBounds(330, 207, 97, 23);
		panel.add(Upload_Button);
		
		JButton btnNewButton_6 = new JButton("\uC911\uBCF5\uCCB4\uD06C");
		
		btnNewButton_6.addActionListener(new ActionListener() {//ISBN 중복체크 버튼
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		btnNewButton_6.setBounds(197, 6, 97, 23);
		panel.add(btnNewButton_6);
		
		Pub_TF = new JTextField();
		Pub_TF.setColumns(10);
		Pub_TF.setBounds(81, 84, 116, 21);
		panel.add(Pub_TF);
		
		JLabel lblNewLabel_3_1 = new JLabel("\uCD9C\uD310\uC0AC");
		lblNewLabel_3_1.setBounds(12, 87, 57, 15);
		panel.add(lblNewLabel_3_1);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(SystemColor.activeCaption);
		panel_1.setBounds(718, 31, 338, 750);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(0, 0, 1, 1);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.setBounds(0, 0, 97, 23);
		panel_2.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("New button");
		btnNewButton_1.setBounds(513, 0, 97, 23);
		panel_2.add(btnNewButton_1);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(SystemColor.activeCaption);
		panel_3.setBounds(0, 0, 1057, 32);
		contentPane.add(panel_3);
		panel_3.setLayout(null);
		
		JButton btnNewButton_2 = new JButton("\uB3C4\uC11C\uAD00\uB9AC");
		btnNewButton_2.setBounds(0, 10, 97, 23);
		panel_3.add(btnNewButton_2);
	}
}
