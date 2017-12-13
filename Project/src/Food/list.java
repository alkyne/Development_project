package Food;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class main extends JFrame {
	
	static int menu_num, money_num;   // 메뉴선정 및 가격 선정 변수 선언
	
	ImageIcon Menu[] = {             //가위바위보 이미지 아이콘 생성
			new ImageIcon("./image/음식점.jpg"), 
			new ImageIcon("./image/한식.png"), // 한식 1
			new ImageIcon("./image/고기.png"), // 고기 3
			new ImageIcon("./image/중식.png"), // 중식 0
			new ImageIcon("./image/분식.png"), // 분식 2
			new ImageIcon("./image/버거.png"), // 버거 5
		};
	
	
	/**
	 * Create the frame.
	 */
	public main() {
		super("Food");
		getContentPane().setBackground(SystemColor.window);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		Container c = this.getContentPane();
		c.setLayout(null); //배치관리자 없음
		
		JLabel m0 = new JLabel(Menu[0]);   //음식점 이미지
		m0.setLocation(0, 0);
		m0.setSize(300, 200);
		m0.setBackground(Color.white);
		m0.setFont(new Font("휴먼엑스포", Font.BOLD, 30));
		m0.setBounds(230, 10, 300, 200);
		
		JButton m1 = new JButton(Menu[1]);
		m1.setBorderPainted(false);
		m1.setBounds(88, 220, 290, 160);
		m1.setBackground(Color.white);
		m1.addActionListener(new ActionListener() {  //한식 버튼을 눌렀을때
			public void actionPerformed(ActionEvent e) {
				menu_num=1;
				money money= new Food.money();  // money 클래스 실행
				setVisible(false);    //현재 창 닫기
			}
		});
		
		
		JButton m2 = new JButton(Menu[2]);
		m2.setBorderPainted(false);
		m2.setFont(new Font("휴먼엑스포", Font.BOLD, 30));
		m2.setBackground(Color.WHITE);
		m2.setBounds(419, 220, 290, 160);
		m2.addActionListener(new ActionListener() {  //고기 버튼을 눌렀을때
			public void actionPerformed(ActionEvent e) {
				menu_num=3;
				money money= new Food.money();  // money 클래스 실행
				setVisible(false);    //현재 창 닫기
			}
		});
		
		JButton m3 = new JButton(Menu[3]);
		m3.setBorderPainted(false);
		m3.setFont(new Font("휴먼엑스포", Font.BOLD, 30));
		m3.setBackground(Color.WHITE);
		m3.setBounds(88, 407, 290, 160);
		m3.addActionListener(new ActionListener() {  //중식 버튼을 눌렀을때
			public void actionPerformed(ActionEvent e) {
				menu_num=0;
				money money= new Food.money();  // money 클래스 실행
				setVisible(false);    //현재 창 닫기
			}
		});
		
		JButton m4 = new JButton(Menu[4]);
		m4.setBorderPainted(false);
		m4.setFont(new Font("휴먼엑스포", Font.BOLD, 30));
		m4.setBackground(Color.WHITE);
		m4.setBounds(419, 407, 290, 160);
		m4.addActionListener(new ActionListener() {  //분식 버튼을 눌렀을때
			public void actionPerformed(ActionEvent e) {
				menu_num=2;
				money money= new Food.money();  // money 클래스 실행
				setVisible(false);    //현재 창 닫기
			}
		});
		
		JButton m5 = new JButton(Menu[5]);
		m5.setBorderPainted(false);
		m5.setFont(new Font("휴먼엑스포", Font.BOLD, 30));
		m5.setBackground(Color.WHITE);
		m5.setBounds(88, 593, 290, 160);
		m5.addActionListener(new ActionListener() {  //버거 버튼을 눌렀을때
			public void actionPerformed(ActionEvent e) {
				menu_num=5;
				money money= new Food.money();  // money 클래스 실행
				setVisible(false);    //현재 창 닫기
			}
		});
		
		getContentPane().add(m0);
		getContentPane().add(m1);
		getContentPane().add(m2);
		getContentPane().add(m3);
		getContentPane().add(m4);
		getContentPane().add(m5);
		
		
		
		setSize(800, 840);
		setVisible(true);
	
	}

	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		new main();
		
		
	}
}

