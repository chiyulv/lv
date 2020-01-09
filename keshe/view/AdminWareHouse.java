package view;

import Miscellaneous.AddDeleteUpdateSelect;
import Sql.DB;

import javax.swing.*;
import java.sql.ResultSet;
import java.util.Vector;

public class AdminWareHouse extends JFrame {
    static Vector data,columnNames;
    static JTable jTable=null;
    static JScrollPane js=null;
    public static JScrollPane warehousetable(){
        columnNames=new Vector();
        columnNames.add("仓库号");
        columnNames.add("仓库管理员");
        columnNames.add("仓库管理员电话");
        columnNames.add("仓库容量");
        data=new Vector();
        try {
            ResultSet rs4= AddDeleteUpdateSelect.keeperseletwarehouse(DB.getCon());
            while(rs4.next()){
                Vector v2=new Vector();
                v2.add(rs4.getString(1));
                v2.add(rs4.getString(2));
                v2.add(rs4.getString(3));
                v2.add(rs4.getString(4));
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
    }
}
