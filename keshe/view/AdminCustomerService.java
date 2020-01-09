package view;

import Miscellaneous.AddDeleteUpdateSelect;
import Sql.DB;

import javax.swing.*;
import java.sql.ResultSet;
import java.util.Vector;

    public class AdminCustomerService extends JFrame {
        static Vector data1,columnNames1;
        static JTable jTable1=null;
        static JScrollPane js1=null;
        public static JScrollPane customerservicetable(){
            columnNames1=new Vector();
            columnNames1.add("ID");
            columnNames1.add("姓名");
            columnNames1.add("性别");
            columnNames1.add("电话");
            columnNames1.add("密码");

            data1=new Vector();
            try {
                ResultSet rs1= AddDeleteUpdateSelect.keeperselectcustomerservice(DB.getCon());
                while(rs1.next()){
                    Vector v2=new Vector();
                    v2.add(rs1.getString(1));
                    v2.add(rs1.getString(2));
                    v2.add(rs1.getString(3));
                    v2.add(rs1.getString(4));
                    v2.add(rs1.getString(5));
                    data1.add(v2);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            jTable1=new JTable(data1,columnNames1);
            js1=new JScrollPane(jTable1);
            return js1;
        }

        public static void main(String[] args) {
            JFrame j1=new JFrame();
            JPanel panel=new JPanel();
            panel.add(view.AdminFruit.fruittable());
            j1.add(panel);
            j1.setBounds(500,500,800,800);
            j1.setVisible(true);
        }

    }

