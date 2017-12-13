package Food;

import java.awt.Component;
import javax.swing.*;
import javax.swing.table.*;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class list extends JDialog{ 

	public static void main(String[] args) {

		database.dbconn();
		new list();
		
	} 

  private JFrame jf;
  private DefaultTableModel dtm;
  private JTable jtable;
  private JScrollPane jsp;     
  private JButton ok_button;

  public list() {

      jf = new JFrame("테이블에 버튼 추가 이벤트");
      jf.setLocationRelativeTo(null);
      jf.setBounds(100,500,500, 300);
      
      
      //dtm = new DefaultTableModel(new Object[][] {{ "데이터1", database_test.restname.get(0)},
      //                                            { "데이터2", database_test.restname.get(1)}, }, new Object[]{ "필드1", "필드2"});
      
      String colNames[] = {"필드1","필드2"}; 
      dtm = new DefaultTableModel(colNames, 0);
      
      for(int i=0; i<database.noOfrest; i++)
      	dtm.addRow(new Object[] {"데이터", database.restname.get(i)});

      jtable = new JTable(dtm);
      jsp = new JScrollPane(jtable); 

      jtable.getColumnModel().getColumn(0).setCellRenderer(new TableCell());
      jtable.getColumnModel().getColumn(0).setCellEditor(new TableCell());
      jf.getContentPane().add(jsp, BorderLayout.CENTER);        
      
      ok_button = new JButton("확 인");
      ok_button.addActionListener(new ActionListener() {
      	public void actionPerformed(ActionEvent e) {
      		race_game race_game = new race_game();
      		database.dbconn();
      		jf.setVisible(false);
      	}
      });
      jf.getContentPane().add(ok_button, BorderLayout.SOUTH);

      jf.setVisible(true);
      
     // new race_game();
      

  }   

  

  class TableCell extends AbstractCellEditor implements TableCellEditor, TableCellRenderer{

      JCheckBox jc;
     

      public TableCell() {

          // TODO Auto-generated constructor stub

          jc = new JCheckBox("버튼");
          jc.addActionListener(e -> {
              System.out.println(jtable.getValueAt(jtable.getSelectedRow(), 1));
          });
      }

       
      @Override

      public Object getCellEditorValue() {
          // TODO Auto-generated method stub

          return null;

      }

      @Override

      public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {

          // TODO Auto-generated method stub

          return jc;
      }

      @Override

      public Component getTableCellEditorComponent(JTable table, Object value, boolean isSelected, int row, int column) {

          // TODO Auto-generated method stub

          return jc;

      }         

  } 

}

