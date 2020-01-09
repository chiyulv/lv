package view;

import Miscellaneous.AddDeleteUpdateSelect;
import Sql.DB;

import javax.swing.*;
import java.sql.ResultSet;
import java.util.Vector;

    public class AdminClient extends JFrame {
        static Vector data,columnNames;
        static JTable jTable=null;
        static JScrollPane js=null;
        public static JScrollPane clienttable(){
            columnNames=new Vector();
            columnNames.add("ID");
            columnNames.add("姓名");
            columnNames.add("性别");
            columnNames.add("电话");
            columnNames.add("地址");
            columnNames.add("密码");

            data=new Vector();
            try {
                ResultSet rs2= AddDeleteUpdateSelect.keeperselectclient(DB.getCon());
                while(rs2.next()){
                    Vector v2=new Vector();
                    v2.add(rs2.getString(1));
                    v2.add(rs2.getString(2));
                    v2.add(rs2.getString(3));
                    v2.add(rs2.getString(4));
                    v2.add(rs2.getString(5));
                    v2.add(rs2.getString(6));
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


