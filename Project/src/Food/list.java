package Food;

import java.awt.*;

import javax.swing.*;

import java.awt.event.*;

import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

public class money extends JFrame {

	
	
	private DefaultTableModel dtm;
    private JTable jtable;
    private JScrollPane jsp;	
	
	/**
	 * Create the frame.
	 */
	public money() {
		super("가격 결정");
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		Container c = this.getContentPane();
		c.setLayout(null); //배치관리자 없음
		
		JLabel m0 = new JLabel("가격 결정");  
		m0.setHorizontalAlignment(SwingConstants.CENTER);
		m0.setLocation(0, 0);
		m0.setSize(300, 200);
		m0.setBackground(Color.white);
		m0.setFont(new Font("휴먼엑스포", Font.BOLD, 30));
		m0.setBounds(246, 10, 300, 200);
		
		JButton m1 = new JButton("저가");   //메뉴판 선택
		m1.setLocation(60, 183);
		m1.setSize(198, 111);
		m1.setBackground(Color.white);
		m1.setFont(new Font("휴먼엑스포", Font.BOLD, 30));
		m1.addActionListener(new ActionListener() {  // 가격 버튼을 눌렀을때
			public void actionPerformed(ActionEvent e) {
				main.money_num = 0;
				database.dbconn();
				list list = new Food.list();
			}
		});		
		
		JButton m2 = new JButton("중간");
		m2.setFont(new Font("휴먼엑스포", Font.BOLD, 30));
		m2.setBackground(Color.WHITE);
		m2.setBounds(300, 183, 198, 111);
		m2.addActionListener(new ActionListener() {  // 가격 버튼을 눌렀을때
			public void actionPerformed(ActionEvent e) {
				main.money_num = 1;
				database.dbconn();
				list list = new Food.list();
			}
		});
		
		JButton m3 = new JButton("고가");
		m3.setFont(new Font("휴먼엑스포", Font.BOLD, 30));
		m3.setBackground(Color.WHITE);
		m3.setBounds(538, 183, 198, 111);
		m3.addActionListener(new ActionListener() {  // 가격 버튼을 눌렀을때
			public void actionPerformed(ActionEvent e) {
				main.money_num = 2;
				database.dbconn();
				list list = new Food.list();
			}
		});

		// main button
		JButton m10 = new JButton("Main");
		m10.setFont(new Font("휴먼엑스포", Font.BOLD, 20));
		m10.setBackground(Color.WHITE);
		m10.setBounds(654, 725, 118, 51);
		m10.addActionListener(new ActionListener() {  //Main 버튼을 눌렀을때
			public void actionPerformed(ActionEvent e) {
				main main= new Food.main();  // money 클래스 실행
				setVisible(false);				
			}
		});
		
		getContentPane().add(m10);
		getContentPane().add(m0);
		getContentPane().add(m1);
		getContentPane().add(m2);
		getContentPane().add(m3);	
		
		
		setSize(800, 840);
		setVisible(true);
		
	
	}

	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		new money();
		
		
	}
}

