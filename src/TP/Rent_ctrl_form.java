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
		
		JButton RENTAL = new JButton("대여");		//대여
		RENTAL.setBounds(0, 0, 97, 23);
		NORTH_BAR.add(RENTAL);

		JButton RETURN = new JButton("반납");		//반납
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
		//대여 할 도서의 ISBN을 입력
		ISBN_Input = new JTextField();
		ISBN_Input.setBounds(91, 7, 116, 21);
		RENT_1.add(ISBN_Input);
		ISBN_Input.setColumns(10);
		
		JLabel labelTitle = new JLabel("제목");	
		labelTitle.setBounds(12, 63, 57, 15);
		RENT_1.add(labelTitle);
		
		//도서의 이름을 DB에서 가져와 출력
		BOOK_TITLE = new JTextField();
		BOOK_TITLE.setBounds(91, 60, 116, 21);
		RENT_1.add(BOOK_TITLE);
		BOOK_TITLE.setColumns(10);
		
		JLabel labelAuthir = new JLabel("저자");	
		labelAuthir.setBounds(12, 88, 57, 15);
		RENT_1.add(labelAuthir);
		
		//도서의 저자을 DB에서 가져와 출력
		BOOK_AUTHIR = new JTextField();
		BOOK_AUTHIR.setBounds(91, 85, 116, 21);
		RENT_1.add(BOOK_AUTHIR);
		BOOK_AUTHIR.setColumns(10);
		
		JLabel labelPub = new JLabel("출판사");	
		labelPub.setBounds(12, 113, 57, 15);
		RENT_1.add(labelPub);
		
		//도서의 출판사를 DB에서 가져와 출력
		BOOK_PUB = new JTextField();
		BOOK_PUB.setBounds(91, 110, 116, 21);
		RENT_1.add(BOOK_PUB);
		BOOK_PUB.setColumns(10);
		
		JLabel labelPrice = new JLabel("가격");
		labelPrice.setBounds(12, 138, 57, 15);
		RENT_1.add(labelPrice);
		
		//도서의 가격을 DB에서 가져와 출력
		BOOK_PRICE = new JTextField();
		BOOK_PRICE.setColumns(10);
		BOOK_PRICE.setBounds(91, 135, 116, 21);
		RENT_1.add(BOOK_PRICE);
		
		JPanel BOOK_IMG = new JPanel();
		BOOK_IMG.setBounds(219, 62, 154, 178);
		RENT_1.add(BOOK_IMG);
		
		JLabel labelRentName = new JLabel("대여자");
		labelRentName.setBounds(12, 222, 57, 15);
		RENT_1.add(labelRentName);
		
		//대여을 원하는 회원의 이름을 입력
		RENT_NAME = new JTextField();
		RENT_NAME.setBounds(91, 219, 116, 21);
		RENT_1.add(RENT_NAME);
		RENT_NAME.setColumns(10);
		
		JLabel labelUserPhone = new JLabel("연락처");
		labelUserPhone.setBounds(12, 251, 57, 15);
		RENT_1.add(labelUserPhone);
		
		//대여를 원하는 회원의 연락처를 입력
		RENT_USER_PHONE = new JTextField();
		RENT_USER_PHONE.setBounds(91, 248, 116, 21);
		RENT_1.add(RENT_USER_PHONE);
		RENT_USER_PHONE.setColumns(10);
		
		JLabel labelUserEmail = new JLabel("이메일");
		labelUserEmail.setBounds(12, 282, 57, 15);
		RENT_1.add(labelUserEmail);
		
		//대여를 원하는 회원의 이메일을 입력
		RENT_USER_EMAIL = new JTextField();
		RENT_USER_EMAIL.setBounds(91, 279, 116, 21);
		RENT_1.add(RENT_USER_EMAIL);
		RENT_USER_EMAIL.setColumns(10);
		
		//ISBN을 입력하고 "확인" 버튼을 클릭하면 도서의 제목, 저자, 출판사, 가격을 DB에서 가져와 대응되는 텍스트 필드에 출력 
		JButton checkRentalButton = new JButton("확인");	//대여 확인 버튼
		checkRentalButton.setBounds(276, 6, 97, 23);
		RENT_1.add(checkRentalButton);
		checkRentalButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null,"ISBN기반으로 책정보 제목/저자/출판사/가격 텍스트필드에 출력","Message",JOptionPane.ERROR_MESSAGE);
			}
		});

		//"대여완료" 버튼을 누르면 입력한 ISBN, 회원의 전화번호, 책 존재 여부, 대여일자, 반납일자를 RENT 테이블에 입력
		JButton loanCompletedButton = new JButton("대여완료");	//대여완료버튼
		loanCompletedButton.setBounds(276, 357, 97, 23);
		RENT_1.add(loanCompletedButton);
		loanCompletedButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null,"입력한 ISBN, 회원의 전화번호와 대여알자, 반납날자, 책 존재 여부를 RENT 테이블에 입력"
									,"Message",JOptionPane.ERROR_MESSAGE);
			}
		});
		//"회원확인" 버튼을 클하면 대여자, 연락처, 이메일로 회원인지 아닌지를 판단한 후 등록된 회원이 맞을 경우 그대로 진행되고 회원이 아닐경우 메세지 다이럴 로그로
		// 오류 표시
		JButton memberConfirmationButton = new JButton("회원확인");	//회원 확인 버튼
		memberConfirmationButton.setBounds(99, 310, 97, 23);
		RENT_1.add(memberConfirmationButton);
		memberConfirmationButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null,"대여자/연락처/이메일로 회원인지 아닌지 판단 등록된 회원이 아닐 경우 메세지 다이얼 로그로 오류 표시"
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
		
		//반납할 도서의 ISBN을 입력
		RENT_2_ISBN_Input = new JTextField();
		RENT_2_ISBN_Input.setBounds(91, 7, 116, 21);
		RENT_2.add(RENT_2_ISBN_Input);
		RENT_2_ISBN_Input.setColumns(10);
		
		JLabel Rent2LabelTitle = new JLabel("제목");
		Rent2LabelTitle.setBounds(12, 63, 57, 15);
		RENT_2.add(Rent2LabelTitle);
		
		//"확인" 버튼을 누르면 ISBN으로 추적해 도서의 제목을 출력
		RENT_2_BOOK_TITLE = new JTextField();
		RENT_2_BOOK_TITLE.setBounds(91, 60, 116, 21);
		RENT_2.add(RENT_2_BOOK_TITLE);
		RENT_2_BOOK_TITLE.setColumns(10);
		
		JLabel Rent2LabelAuthir = new JLabel("저자");
		Rent2LabelAuthir.setBounds(12, 88, 57, 15);
		RENT_2.add(Rent2LabelAuthir);
		
		//"확인" 버튼을 누르면 ISBN으로 추적해 도서의 저자을 출력
		RENT_2_BOOK_AUTHIR = new JTextField();
		RENT_2_BOOK_AUTHIR.setBounds(91, 85, 116, 21);
		RENT_2.add(RENT_2_BOOK_AUTHIR);
		RENT_2_BOOK_AUTHIR.setColumns(10);
		
		JLabel Rent2LabelPub = new JLabel("출판사");
		Rent2LabelPub.setBounds(12, 113, 57, 15);
		RENT_2.add(Rent2LabelPub);
		
		//"확인" 버튼을 누르면 ISBN으로 추적해 도서의 출판사을 출력
		RENT_2_BOOK_PUB = new JTextField();
		RENT_2_BOOK_PUB.setBounds(91, 110, 116, 21);
		RENT_2.add(RENT_2_BOOK_PUB);
		RENT_2_BOOK_PUB.setColumns(10);
		

		JPanel panel_4 = new JPanel();
		panel_4.setBounds(219, 63, 161, 177);
		RENT_2.add(panel_4);
		
		JLabel Rent2LabelPrice = new JLabel("가격");
		Rent2LabelPrice.setBounds(12, 138, 57, 15);
		RENT_2.add(Rent2LabelPrice);
		
		//"확인" 버튼을 누르면 ISBN으로 추적해 도서의 가격을 출력
		RENT_2_BOOK_PRICE = new JTextField();
		RENT_2_BOOK_PRICE.setColumns(10);
		RENT_2_BOOK_PRICE.setBounds(91, 135, 116, 21);
		RENT_2.add(RENT_2_BOOK_PRICE);
		
		JLabel Rent2LabelName = new JLabel("반납자");
		Rent2LabelName.setBounds(12, 184, 57, 15);
		RENT_2.add(Rent2LabelName);
		
		//반납을 원하는 회원의 이름을 입력
		RENT_2_RENT_NAME = new JTextField();
		RENT_2_RENT_NAME.setBounds(91, 181, 116, 21);
		RENT_2.add(RENT_2_RENT_NAME);
		RENT_2_RENT_NAME.setColumns(10);
		
		JLabel RentLabelUserPhone = new JLabel("연락처");
		RentLabelUserPhone.setBounds(12, 209, 57, 15);
		RENT_2.add(RentLabelUserPhone);
		
		//반납을 원하는 회원의 연락처를 입력
		RENT_2_RENT_USER_PHONE = new JTextField();
		RENT_2_RENT_USER_PHONE.setBounds(91, 206, 116, 21);
		RENT_2.add(RENT_2_RENT_USER_PHONE);
		RENT_2_RENT_USER_PHONE.setColumns(10);
		
		JLabel Rent2LabelEmail = new JLabel("이메일");
		Rent2LabelEmail.setBounds(12, 234, 57, 15);
		RENT_2.add(Rent2LabelEmail);
		
		//반납을 원하는 회원의 이메일를 입력
		RENT_2_RENT_USER_EMAIL = new JTextField();
		RENT_2_RENT_USER_EMAIL.setBounds(91, 231, 116, 21);
		RENT_2.add(RENT_2_RENT_USER_EMAIL);
		RENT_2_RENT_USER_EMAIL.setColumns(10);
		
		//ISBN으로 추적해 DB에서 도서의 제목, 저자, 출판사, 가격을 대응되는 텍스트 필드에 출력
		JButton returnConfirmationButton = new JButton("확인");	//반납 확인 버튼
		returnConfirmationButton.setBounds(283, 6, 97, 23);
		RENT_2.add(returnConfirmationButton);
		returnConfirmationButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null,"ISBN기반으로 책정보 제목/저자/출판사/가격 텍스트필드에 출력","Message",JOptionPane.ERROR_MESSAGE);
			}
		});
		
		//대여자의 전화번호와 대여한 도서의 ISBN으로 추적해 그 행의 RENT_RETURN의 값을 1(TRUE)로 수정
		JButton returnCompleteButton = new JButton("반납완료");	//반납 완료
		returnCompleteButton.setBounds(283, 357, 97, 23);
		RENT_2.add(returnCompleteButton);
		returnCompleteButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null,"RENT_TABLE의 RENT_RETURN의 값을 1(TRUE)로 변환","Message",JOptionPane.ERROR_MESSAGE);
			}
		});
		
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 446, 789, 305);
		contentPane.add(scrollPane);
		
		//RENT_TABLE의 값을 모두 출력
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
				"ISBN", "제목", "저자",  "대여일자", "반납일자"
			}
		));
		table.getColumnModel().getColumn(0).setPreferredWidth(107);
		table.getColumnModel().getColumn(1).setPreferredWidth(44);
		table.getColumnModel().getColumn(2).setPreferredWidth(101);
		scrollPane.setViewportView(table);
		
		JLabel lblNewLabel_8 = new JLabel("도서 현황");
		lblNewLabel_8.setBounds(44, 421, 123, 15);
		contentPane.add(lblNewLabel_8);
	}
}
