package TP;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTextField;
import java.awt.SystemColor;
import java.awt.event.*;
public class Rent_ctrl_form extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JTextField ISBN_Input;
	private JTextField BOOK_TITLE;
	private JTextField BOOK_AUTHIR;
	private JTextField BOOK_PUB;
	private JTextField BOOK_PRICE;
	private JTextField RENT_NAME;
	private JTextField RENT_USER_PHONE;
	private JTextField RENT_USER_EMAIL;
	
	private JTextField RENT_2_ISBN_Input;
	private JTextField RENT_2_BOOK_TITLE;
	private JTextField RENT_2_BOOK_AUTHIR;
	private JTextField RENT_2_BOOK_PUB;

	private JTextField RENT_2_RENT_NAME;
	private JTextField RENT_2_RENT_USER_PHONE;
	private JTextField RENT_2_RENT_USER_EMAIL;
	
	private JTextField RENT_2_BOOK_PRICE;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Rent_ctrl_form frame = new Rent_ctrl_form();
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
	public Rent_ctrl_form() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 827, 863);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel NORTH_BAR = new JPanel();
		NORTH_BAR.setBounds(0, 0, 799, 23);
		contentPane.add(NORTH_BAR);
		NORTH_BAR.setLayout(null);
		
		JButton RENTAL = new JButton("�뿩");		//�뿩
		RENTAL.setBounds(0, 0, 97, 23);
		NORTH_BAR.add(RENTAL);

		JButton RETURN = new JButton("�ݳ�");		//�ݳ�
		RETURN.setBounds(406, 0, 97, 23);
		NORTH_BAR.add(RETURN);

		JPanel RENT_1 = new JPanel();
		RENT_1.setBackground(SystemColor.activeCaption);
		RENT_1.setBounds(0, 21, 385, 390);
		contentPane.add(RENT_1);
		RENT_1.setLayout(null);
		
		
		JLabel labelIsbn = new JLabel("ISBN");
		labelIsbn.setBounds(12, 10, 57, 15);
		RENT_1.add(labelIsbn);
		//�뿩 �� ������ ISBN�� �Է�
		ISBN_Input = new JTextField();
		ISBN_Input.setBounds(91, 7, 116, 21);
		RENT_1.add(ISBN_Input);
		ISBN_Input.setColumns(10);
		
		JLabel labelTitle = new JLabel("����");	
		labelTitle.setBounds(12, 63, 57, 15);
		RENT_1.add(labelTitle);
		
		//������ �̸��� DB���� ������ ���
		BOOK_TITLE = new JTextField();
		BOOK_TITLE.setBounds(91, 60, 116, 21);
		RENT_1.add(BOOK_TITLE);
		BOOK_TITLE.setColumns(10);
		
		JLabel labelAuthir = new JLabel("����");	
		labelAuthir.setBounds(12, 88, 57, 15);
		RENT_1.add(labelAuthir);
		
		//������ ������ DB���� ������ ���
		BOOK_AUTHIR = new JTextField();
		BOOK_AUTHIR.setBounds(91, 85, 116, 21);
		RENT_1.add(BOOK_AUTHIR);
		BOOK_AUTHIR.setColumns(10);
		
		JLabel labelPub = new JLabel("���ǻ�");	
		labelPub.setBounds(12, 113, 57, 15);
		RENT_1.add(labelPub);
		
		//������ ���ǻ縦 DB���� ������ ���
		BOOK_PUB = new JTextField();
		BOOK_PUB.setBounds(91, 110, 116, 21);
		RENT_1.add(BOOK_PUB);
		BOOK_PUB.setColumns(10);
		
		JLabel labelPrice = new JLabel("����");
		labelPrice.setBounds(12, 138, 57, 15);
		RENT_1.add(labelPrice);
		
		//������ ������ DB���� ������ ���
		BOOK_PRICE = new JTextField();
		BOOK_PRICE.setColumns(10);
		BOOK_PRICE.setBounds(91, 135, 116, 21);
		RENT_1.add(BOOK_PRICE);
		
		JPanel BOOK_IMG = new JPanel();
		BOOK_IMG.setBounds(219, 62, 154, 178);
		RENT_1.add(BOOK_IMG);
		
		JLabel labelRentName = new JLabel("�뿩��");
		labelRentName.setBounds(12, 222, 57, 15);
		RENT_1.add(labelRentName);
		
		//�뿩�� ���ϴ� ȸ���� �̸��� �Է�
		RENT_NAME = new JTextField();
		RENT_NAME.setBounds(91, 219, 116, 21);
		RENT_1.add(RENT_NAME);
		RENT_NAME.setColumns(10);
		
		JLabel labelUserPhone = new JLabel("����ó");
		labelUserPhone.setBounds(12, 251, 57, 15);
		RENT_1.add(labelUserPhone);
		
		//�뿩�� ���ϴ� ȸ���� ����ó�� �Է�
		RENT_USER_PHONE = new JTextField();
		RENT_USER_PHONE.setBounds(91, 248, 116, 21);
		RENT_1.add(RENT_USER_PHONE);
		RENT_USER_PHONE.setColumns(10);
		
		JLabel labelUserEmail = new JLabel("�̸���");
		labelUserEmail.setBounds(12, 282, 57, 15);
		RENT_1.add(labelUserEmail);
		
		//�뿩�� ���ϴ� ȸ���� �̸����� �Է�
		RENT_USER_EMAIL = new JTextField();
		RENT_USER_EMAIL.setBounds(91, 279, 116, 21);
		RENT_1.add(RENT_USER_EMAIL);
		RENT_USER_EMAIL.setColumns(10);
		
		//ISBN�� �Է��ϰ� "Ȯ��" ��ư�� Ŭ���ϸ� ������ ����, ����, ���ǻ�, ������ DB���� ������ �����Ǵ� �ؽ�Ʈ �ʵ忡 ��� 
		JButton checkRentalButton = new JButton("Ȯ��");	//�뿩 Ȯ�� ��ư
		checkRentalButton.setBounds(276, 6, 97, 23);
		RENT_1.add(checkRentalButton);
		checkRentalButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null,"ISBN������� å���� ����/����/���ǻ�/���� �ؽ�Ʈ�ʵ忡 ���","Message",JOptionPane.ERROR_MESSAGE);
			}
		});

		//"�뿩�Ϸ�" ��ư�� ������ �Է��� ISBN, ȸ���� ��ȭ��ȣ, å ���� ����, �뿩����, �ݳ����ڸ� RENT ���̺� �Է�
		JButton loanCompletedButton = new JButton("�뿩�Ϸ�");	//�뿩�Ϸ��ư
		loanCompletedButton.setBounds(276, 357, 97, 23);
		RENT_1.add(loanCompletedButton);
		loanCompletedButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null,"�Է��� ISBN, ȸ���� ��ȭ��ȣ�� �뿩����, �ݳ�����, å ���� ���θ� RENT ���̺� �Է�"
									,"Message",JOptionPane.ERROR_MESSAGE);
			}
		});
		//"ȸ��Ȯ��" ��ư�� Ŭ�ϸ� �뿩��, ����ó, �̸��Ϸ� ȸ������ �ƴ����� �Ǵ��� �� ��ϵ� ȸ���� ���� ��� �״�� ����ǰ� ȸ���� �ƴҰ�� �޼��� ���̷� �α׷�
		// ���� ǥ��
		JButton memberConfirmationButton = new JButton("ȸ��Ȯ��");	//ȸ�� Ȯ�� ��ư
		memberConfirmationButton.setBounds(99, 310, 97, 23);
		RENT_1.add(memberConfirmationButton);
		memberConfirmationButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null,"�뿩��/����ó/�̸��Ϸ� ȸ������ �ƴ��� �Ǵ� ��ϵ� ȸ���� �ƴ� ��� �޼��� ���̾� �α׷� ���� ǥ��"
									,"Message",JOptionPane.ERROR_MESSAGE);
			}
		});

		
		
		JPanel RENT_2 = new JPanel();
		RENT_2.setBackground(SystemColor.activeCaption);
		RENT_2.setBounds(407, 21, 392, 390);
		contentPane.add(RENT_2);
		RENT_2.setLayout(null);
		
		JLabel Rent2LabelIsbn = new JLabel("ISBN");
		Rent2LabelIsbn.setBounds(12, 10, 57, 15);
		RENT_2.add(Rent2LabelIsbn);
		
		//�ݳ��� ������ ISBN�� �Է�
		RENT_2_ISBN_Input = new JTextField();
		RENT_2_ISBN_Input.setBounds(91, 7, 116, 21);
		RENT_2.add(RENT_2_ISBN_Input);
		RENT_2_ISBN_Input.setColumns(10);
		
		JLabel Rent2LabelTitle = new JLabel("����");
		Rent2LabelTitle.setBounds(12, 63, 57, 15);
		RENT_2.add(Rent2LabelTitle);
		
		//"Ȯ��" ��ư�� ������ ISBN���� ������ ������ ������ ���
		RENT_2_BOOK_TITLE = new JTextField();
		RENT_2_BOOK_TITLE.setBounds(91, 60, 116, 21);
		RENT_2.add(RENT_2_BOOK_TITLE);
		RENT_2_BOOK_TITLE.setColumns(10);
		
		JLabel Rent2LabelAuthir = new JLabel("����");
		Rent2LabelAuthir.setBounds(12, 88, 57, 15);
		RENT_2.add(Rent2LabelAuthir);
		
		//"Ȯ��" ��ư�� ������ ISBN���� ������ ������ ������ ���
		RENT_2_BOOK_AUTHIR = new JTextField();
		RENT_2_BOOK_AUTHIR.setBounds(91, 85, 116, 21);
		RENT_2.add(RENT_2_BOOK_AUTHIR);
		RENT_2_BOOK_AUTHIR.setColumns(10);
		
		JLabel Rent2LabelPub = new JLabel("���ǻ�");
		Rent2LabelPub.setBounds(12, 113, 57, 15);
		RENT_2.add(Rent2LabelPub);
		
		//"Ȯ��" ��ư�� ������ ISBN���� ������ ������ ���ǻ��� ���
		RENT_2_BOOK_PUB = new JTextField();
		RENT_2_BOOK_PUB.setBounds(91, 110, 116, 21);
		RENT_2.add(RENT_2_BOOK_PUB);
		RENT_2_BOOK_PUB.setColumns(10);
		

		JPanel panel_4 = new JPanel();
		panel_4.setBounds(219, 63, 161, 177);
		RENT_2.add(panel_4);
		
		JLabel Rent2LabelPrice = new JLabel("����");
		Rent2LabelPrice.setBounds(12, 138, 57, 15);
		RENT_2.add(Rent2LabelPrice);
		
		//"Ȯ��" ��ư�� ������ ISBN���� ������ ������ ������ ���
		RENT_2_BOOK_PRICE = new JTextField();
		RENT_2_BOOK_PRICE.setColumns(10);
		RENT_2_BOOK_PRICE.setBounds(91, 135, 116, 21);
		RENT_2.add(RENT_2_BOOK_PRICE);
		
		JLabel Rent2LabelName = new JLabel("�ݳ���");
		Rent2LabelName.setBounds(12, 184, 57, 15);
		RENT_2.add(Rent2LabelName);
		
		//�ݳ��� ���ϴ� ȸ���� �̸��� �Է�
		RENT_2_RENT_NAME = new JTextField();
		RENT_2_RENT_NAME.setBounds(91, 181, 116, 21);
		RENT_2.add(RENT_2_RENT_NAME);
		RENT_2_RENT_NAME.setColumns(10);
		
		JLabel RentLabelUserPhone = new JLabel("����ó");
		RentLabelUserPhone.setBounds(12, 209, 57, 15);
		RENT_2.add(RentLabelUserPhone);
		
		//�ݳ��� ���ϴ� ȸ���� ����ó�� �Է�
		RENT_2_RENT_USER_PHONE = new JTextField();
		RENT_2_RENT_USER_PHONE.setBounds(91, 206, 116, 21);
		RENT_2.add(RENT_2_RENT_USER_PHONE);
		RENT_2_RENT_USER_PHONE.setColumns(10);
		
		JLabel Rent2LabelEmail = new JLabel("�̸���");
		Rent2LabelEmail.setBounds(12, 234, 57, 15);
		RENT_2.add(Rent2LabelEmail);
		
		//�ݳ��� ���ϴ� ȸ���� �̸��ϸ� �Է�
		RENT_2_RENT_USER_EMAIL = new JTextField();
		RENT_2_RENT_USER_EMAIL.setBounds(91, 231, 116, 21);
		RENT_2.add(RENT_2_RENT_USER_EMAIL);
		RENT_2_RENT_USER_EMAIL.setColumns(10);
		
		//ISBN���� ������ DB���� ������ ����, ����, ���ǻ�, ������ �����Ǵ� �ؽ�Ʈ �ʵ忡 ���
		JButton returnConfirmationButton = new JButton("Ȯ��");	//�ݳ� Ȯ�� ��ư
		returnConfirmationButton.setBounds(283, 6, 97, 23);
		RENT_2.add(returnConfirmationButton);
		returnConfirmationButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null,"ISBN������� å���� ����/����/���ǻ�/���� �ؽ�Ʈ�ʵ忡 ���","Message",JOptionPane.ERROR_MESSAGE);
			}
		});
		
		//�뿩���� ��ȭ��ȣ�� �뿩�� ������ ISBN���� ������ �� ���� RENT_RETURN�� ���� 1(TRUE)�� ����
		JButton returnCompleteButton = new JButton("�ݳ��Ϸ�");	//�ݳ� �Ϸ�
		returnCompleteButton.setBounds(283, 357, 97, 23);
		RENT_2.add(returnCompleteButton);
		returnCompleteButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null,"RENT_TABLE�� RENT_RETURN�� ���� 1(TRUE)�� ��ȯ","Message",JOptionPane.ERROR_MESSAGE);
			}
		});
		
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 446, 789, 305);
		contentPane.add(scrollPane);
		
		//RENT_TABLE�� ���� ��� ���
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
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
			},
			new String[] {
				"ISBN", "����", "����",  "�뿩����", "�ݳ�����"
			}
		));
		table.getColumnModel().getColumn(0).setPreferredWidth(107);
		table.getColumnModel().getColumn(1).setPreferredWidth(44);
		table.getColumnModel().getColumn(2).setPreferredWidth(101);
		scrollPane.setViewportView(table);
		
		JLabel lblNewLabel_8 = new JLabel("���� ��Ȳ");
		lblNewLabel_8.setBounds(44, 421, 123, 15);
		contentPane.add(lblNewLabel_8);
	}
}
