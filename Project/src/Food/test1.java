package Food;

import java.awt.Component;
//import javax.swing.AbstractCellEditor;
//import javax.swing.JCheckBox;
//import javax.swing.JDialog;
//import javax.swing.JFrame;
//import javax.swing.JScrollPane;
//import javax.swing.JTable;
//import javax.swing.table.DefaultTableModel;
//import javax.swing.table.TableCellEditor;
//import javax.swing.table.TableCellRenderer;
import javax.swing.*;
import javax.swing.table.*;
 

public class test1 extends JDialog{ 

    public static void main(String[] args) {

    	database.dbconn();
    	new test1();

    } 

	private JFrame jf;
    private DefaultTableModel dtm;
    private JTable jtable;
    private JScrollPane jsp;     

    public test1() {

        jf = new JFrame("테이블에 버튼 추가 이벤트");
        jf.setLocationRelativeTo(null);
        jf.setSize(500, 300);
        
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

        jf.add(jsp);        

        jf.setVisible(true);

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

