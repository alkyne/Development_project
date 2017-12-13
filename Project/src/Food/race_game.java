package Food;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.border.EmptyBorder;

public class race_game extends JFrame {
	
	static int menu_num, money_num;   // 메뉴선정 및 가격 선정 변수 선언
	static String imgname1, imgname2; 
	static int x1=50, x2=50;
	int victory=0;	// 우승자 번호 등록
	int count_num=2; // 메뉴 카운트 숫자(2~4개)
	
	public JLabel label1;
	public JLabel label2;

	
//	JPanel p = new JPanel();

	
	
	ImageIcon Menu[] = {             
			new ImageIcon("./image/음식점.jpg"),
		
			
		};
	private JLabel line2;
	
	
	class MyThread extends Thread{
		@Override
		
		public void run(){
			for(int i=0; i<180 ; i++){
				try{
					Thread.sleep(40);
				}catch(InterruptedException e){
					e.printStackTrace();
				}
			

				
				// 결승점 설정
				if(x1>=600){				
					victory=1;
					JOptionPane.showMessageDialog(null, victory + "번 으로 결정!!", "정했다!", JOptionPane.INFORMATION_MESSAGE);
					break;
				}
				else if(x2>=600){				
					victory=2;
					JOptionPane.showMessageDialog(null, victory + "번 으로 결정!!", "정했다!", JOptionPane.INFORMATION_MESSAGE);
					break;
				}
					x1 += (int)(Math.random()*8);
					label1.setBounds(x1, 200, 100, 100);
					x2 += (int)(Math.random()*8);
					label2.setBounds(x2, 400, 100, 100);

					

			
		}
	}
	}
	

	/**
	 * Create the frame.
	 */
	public race_game() {
		super("레이싱 게임");
		getContentPane().setBackground(new Color(204, 153, 51));
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		Container c = this.getContentPane();
		c.setLayout(null); //배치관리자 없음
		
		label1= new JLabel();
		//label1.setIcon(new ImageIcon("./image/a1.png"));
		
		//System.out.println("./image/upso/"+Food.database.rest.get(0)+".png");
		label1.setIcon(new ImageIcon("./image/upso/"+Food.database.rest.get(0)+".jpg"));
		//label1.setIcon(new ImageIcon("./image/a1.png"));
		//label1.setIcon(new ImageIcon("./image/upso/"+Food.database.rest.get(0)+".png"));
		//System.out.println(Food.database.imgname.get(0));
		label2= new JLabel();
		//label2.setIcon(new ImageIcon("./image/a2.png"));
		label2.setIcon(new ImageIcon("./image/upso/"+Food.database.rest.get(1)+".jpg"));
		
		


		
		

		getContentPane().add(label1);getContentPane().add(label2);
		label1.setBounds(50, 200, 100, 100);
		label2.setBounds(50, 400, 100, 100);
		
		

		
		
		
		// 라인 생성 라벨
		JLabel line1 = new JLabel();
		line1.setIcon(new ImageIcon("./image/line1.png"));;
		line1.setBounds(146, 127, 37, 531);
		getContentPane().add(line1);
		
		line2 = new JLabel();
		line2.setIcon(new ImageIcon("./image/line2.png"));;
		line2.setBounds(654, 127, 37, 531);
		getContentPane().add(line2);
		
		JLabel title = new JLabel("달려라!!");
		title.setHorizontalAlignment(SwingConstants.CENTER);
		title.setFont(new Font("휴먼엑스포", Font.BOLD, 30));
		title.setBounds(296, 25, 182, 91);
		getContentPane().add(title);
		
		
		JButton m0 = new JButton("시작");
		m0.setFont(new Font("휴먼엑스포", Font.BOLD, 30));
		m0.setBackground(Color.WHITE);
		m0.setBounds(323, 665, 198, 111);
		m0.addActionListener(new ActionListener() {  //시작 버튼을 눌렀을때
			public void actionPerformed(ActionEvent e) {
			
				(new MyThread()).start(); // 게임시작
				race_game.x1=50; race_game.x2=50;
			}
		});
		
		JButton m1 = new JButton("Main");
		m1.setFont(new Font("휴먼엑스포", Font.BOLD, 20));
		m1.setBackground(Color.WHITE);
		m1.setBounds(654, 725, 118, 51);
		m1.addActionListener(new ActionListener() {  //Main 버튼을 눌렀을때
			public void actionPerformed(ActionEvent e) {
				main main= new Food.main();  // money 클래스 실행
				setVisible(false);
				
				
			}
		});
		
		
		getContentPane().add(m1);
		getContentPane().add(m0);
		
		
	
		
		
		
		setSize(800, 840);
		setVisible(true);
	
	}

	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		race_game t = new race_game();		
		
	}
}
