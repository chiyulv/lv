package view;

import Miscellaneous.AddDeleteUpdateSelect;
import Sql.DB;

import javax.swing.*;
import java.sql.ResultSet;
import java.util.Vector;

     public class AdminList extends JFrame {
        static Vector data,columnNames;
        static JTable jTable=null;
        static JScrollPane js=null;
        public static JScrollPane listtable(){
            columnNames=new Vector();
            columnNames.add("单号");
            columnNames.add("水果编号");
            columnNames.add("水果名称");
            columnNames.add("数量（箱）");
            columnNames.add("总价");
            columnNames.add("发货方式");
            columnNames.add("顾客ID");
            columnNames.add("顾客姓名");

            data=new Vector();
            try {
                ResultSet rs3= AddDeleteUpdateSelect.keeperselectlist(DB.getCon());
                while(rs3.next()){
                    Vector v2=new Vector();
                    v2.add(rs3.getString(1));
                    v2.add(rs3.getString(2));
                    v2.add(rs3.getString(3));
                    v2.add(rs3.getString(4));
                    v2.add(rs3.getString(5));
                    v2.add(rs3.getString(6));
                    v2.add(rs3.getString(7));
                    v2.add(rs3.getString(8));
                    data.add(v2);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            jTable=new JTable(data,columnNames);
            js=new JScrollPane(jTable);
            return js;
        }

        public static void main(String[] args) {
            JFrame j1=new JFrame();
            JPanel panel=new JPanel();
            panel.add(AdminCustomerService.customerservicetable());
            j1.add(panel);
            j1.setBounds(500,500,800,800);
            j1.setVisible(true);
        }
}
