package view;

import javax.swing.*;
import java.sql.ResultSet;
import java.util.Vector;

import Miscellaneous.AddDeleteUpdateSelect;
import Sql.DB;

    public class AdminFruit extends JFrame {
        static Vector data,columnNames;
        static JTable jTable=null;
        static JScrollPane js=null;
        public static JScrollPane fruittable(){
            columnNames=new Vector();
            columnNames.add("编号");
            columnNames.add("种类");
            columnNames.add("名称");
            columnNames.add("单价");
            columnNames.add("简介");
            columnNames.add("状态");
            columnNames.add("入库号");
            columnNames.add("入库时间");
            columnNames.add("数量");

            data=new Vector();
            try {
                ResultSet rs= AddDeleteUpdateSelect.keeperselectfruit(DB.getCon());
                while(rs.next()){
                    Vector v1=new Vector();
                    v1.add(rs.getString(1));
                    v1.add(rs.getString(2));
                    v1.add(rs.getString(3));
                    v1.add(rs.getString(4));
                    v1.add(rs.getString(5));
                    v1.add(rs.getString(6));
                    v1.add(rs.getString(7));
                    data.add(v1);
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
