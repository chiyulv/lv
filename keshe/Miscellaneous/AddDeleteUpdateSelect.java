package Miscellaneous;

import Sql.DB;

import javax.swing.*;
import java.awt.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class AddDeleteUpdateSelect {

    public static void setRight(JPanel j, JSplitPane js) {
        js.setRightComponent(j);
        js.setDividerLocation(300);
        js.setDividerSize(1);
    }

    public static void zi(JLabel j) {
        Font font1 = new Font("宋体", Font.PLAIN, 20);
        j.setFont(font1);
        j.setForeground(Color.BLACK);
    }

    public static void keeperaddfruit(Connection con, FruitGetSet newfruit) throws Exception {
        PreparedStatement pstmt = null;
        String sql = "INSERT INTO Fruit(Fno, Fvariety, Fname, Fprice, Fintroduction, Fstate, Wno, Wtime,Fquantity)VALUES(?,?,?,?,?,?,?,?,?)";
        pstmt = con.prepareStatement(sql);
        pstmt.setString(1, newfruit.getFno());
        pstmt.setString(2, newfruit.getFvariety());
        pstmt.setString(3, newfruit.getFname());
        pstmt.setString(4, newfruit.getFprice());
        pstmt.setString(5, newfruit.getFintroduction());
        pstmt.setString(6, newfruit.getFstate());
        pstmt.setString(7, newfruit.getWno());
        pstmt.setString(8, newfruit.getWtime());
        pstmt.setString(9, newfruit.getFquantity());
        pstmt.executeUpdate();
    }

    public static void keeperdeletefruit(Connection con, FruitGetSet newfruit) throws Exception {
        PreparedStatement pstmt = null;
        String sql = "DELETE FROM Fruit WHERE Fno=?";
        pstmt = con.prepareStatement(sql);
        pstmt.setString(1, newfruit.getFno());
        pstmt.executeUpdate();
    }

    public static void keeperupdatefruit(Connection con, FruitGetSet newfruit) throws Exception {
        PreparedStatement pstmt = null;
        String sql =
                "update Fruit set Fvariety=?, Fname=?, Fprice=?, Fintroduction=?, Fstate=?, Wno=?, Wtime=?,Fquantity=? where Fno=?";
        pstmt = con.prepareStatement(sql);
        pstmt.setString(1, newfruit.getFvariety());
        pstmt.setString(2, newfruit.getFname());
        pstmt.setString(3, newfruit.getFprice());
        pstmt.setString(4, newfruit.getFintroduction());
        pstmt.setString(5, newfruit.getFstate());
        pstmt.setString(6, newfruit.getWno());
        pstmt.setString(7, newfruit.getWtime());
        pstmt.setString(8, newfruit.getFquantity());
        pstmt.setString(9, newfruit.getFno());
        pstmt.executeUpdate();
    }

    public static ResultSet keeperselectfruit(Connection con) throws Exception {
        String sql = "SELECT * FROM Fruit";
        PreparedStatement pstmt = con.prepareStatement(sql);
        ResultSet rs = pstmt.executeQuery();
        return rs;
    }

    public static void keeperaddcustomerservice(Connection con,CustomerServiceGetSet newcustomerservice) throws Exception {
        PreparedStatement pstmt = null;
        String sql = "INSERT INTO SP(SPID, SPname, SPsex,SPphone, SPpassword)VALUES(?,?,?,?,?)";
        pstmt = con.prepareStatement(sql);
        pstmt.setString(1,newcustomerservice.getSPID());
        pstmt.setString(2,newcustomerservice.getSPname());
        pstmt.setString(3,newcustomerservice.getSPsex());
        pstmt.setString(4,newcustomerservice.getSPphone());
        pstmt.setString(5,newcustomerservice.getSPpassword());
        pstmt.executeUpdate();
    }

    public static void keeperdeletecustomerservice(Connection con, CustomerServiceGetSet newcustomerservice) throws Exception {
        PreparedStatement pstmt = null;
        String sql = "DELETE FROM SP WHERE SPID=?";
        pstmt = con.prepareStatement(sql);
        pstmt.setString(1, newcustomerservice.getSPID());
        pstmt.executeUpdate();
    }

    public static void keeperupdatecustomerservice(Connection con, CustomerServiceGetSet newcustomerservice) throws Exception {
        PreparedStatement pstmt = null;
        String sql =
                "update SP set SPname=?, SPsex=?,SPphone=?, SPpassword=? where SPID=?";
        pstmt = con.prepareStatement(sql);
        pstmt.setString(1, newcustomerservice.getSPname());
        pstmt.setString(2, newcustomerservice.getSPsex());
        pstmt.setString(3, newcustomerservice.getSPphone());
        pstmt.setString(4, newcustomerservice.getSPpassword());
        pstmt.setString(5, newcustomerservice.getSPID());
        pstmt.executeUpdate();
    }

    public static ResultSet keeperselectcustomerservice(Connection con) throws Exception {
        String sql1 = "SELECT * FROM SP";
        PreparedStatement pstmt = con.prepareStatement(sql1);
        ResultSet rs1 = pstmt.executeQuery();
        return rs1;
    }

    public static void keeperaddclient(Connection con,ClientGetSet newclient) throws Exception{
        PreparedStatement pstmt = null;
        String sql = "INSERT INTO Shopper(SID, Sname, Ssex, Sphone, Saddress, Spassword )VALUES(?,?,?,?,?,?)";
        pstmt = con.prepareStatement(sql);
        pstmt.setString(1, newclient.getSID());
        pstmt.setString(2, newclient.getSname());
        pstmt.setString(3, newclient.getSsex());
        pstmt.setString(4, newclient.getSphone());
        pstmt.setString(5, newclient.getSaddress());
        pstmt.setString(6, newclient.getSpassword());
        pstmt.executeUpdate();
    }

    public static void keeperdeleteclient(Connection con,ClientGetSet newclient) throws Exception{
        PreparedStatement pstmt = null;
        String sql = "DELETE FROM Shopper WHERE SID=?";
        pstmt = con.prepareStatement(sql);
        pstmt.setString(1, newclient.getSID());
        pstmt.executeUpdate();
    }

    public static void keeperupdateclient(Connection con,ClientGetSet newclient) throws  Exception{
        PreparedStatement pstmt = null;
        String sql = "update Shopper set Sname=?, Ssex=?,Sphone=?, Saddress=?,Spassword=? where SID=?";
        pstmt = con.prepareStatement(sql);
        pstmt.setString(1, newclient.getSname());
        pstmt.setString(2, newclient.getSsex());
        pstmt.setString(3, newclient.getSphone());
        pstmt.setString(4, newclient.getSaddress());
        pstmt.setString(5, newclient.getSpassword());
        pstmt.setString(6,newclient.getSID());
        pstmt.executeUpdate();
    }

    public static ResultSet keeperselectclient(Connection con) throws Exception{
        String sql1 = "SELECT * FROM Shopper";
        PreparedStatement pstmt = con.prepareStatement(sql1);
        ResultSet rs2 = pstmt.executeQuery();
        return rs2;
    }

    public static void keeperaddlist(Connection con,ListGetSet newlist) throws Exception {
        PreparedStatement pstmt = null;
        String sql = "INSERT INTO List(List, Fno, Fname, Lcount, Ltprice, Ldmethod, SID, Sname) VALUES (?,?,?,?,?,?,?,?)";
        pstmt = con.prepareStatement(sql);
        pstmt.setString(1, newlist.getList());
        pstmt.setString(2, newlist.getFno());
        pstmt.setString(3, newlist.getFname());
        pstmt.setString(4, newlist.getLcount());
        pstmt.setString(5, newlist.getLtprice());
        pstmt.setString(6, newlist.getLdmethod());
        pstmt.setString(7, newlist.getSID());
        pstmt.setString(8, newlist.getSname());
        pstmt.executeUpdate();
    }

    public static void keeperdeletelist(Connection con,ListGetSet newlist) throws Exception{
        PreparedStatement pstmt = null;
        String sql = "DELETE FROM List WHERE List=?";
        pstmt = con.prepareStatement(sql);
        pstmt.setString(1, newlist.getFno());
        pstmt.executeUpdate();
    }

    public static void keeperupdatelist(Connection con,ListGetSet newlist) throws Exception{
        PreparedStatement pstmt = null;
        String sql = "update List set Fno=?, Fname=?,Lcount=?, Ltprice=?,Ldmethod=? ,SID =?,Sname=? where List=?";
        pstmt = con.prepareStatement(sql);
        pstmt.setString(1,newlist.getFno());
        pstmt.setString(2,newlist.getFname());
        pstmt.setString(3,newlist.getLcount());
        pstmt.setString(4,newlist.getLtprice());
        pstmt.setString(5,newlist.getLdmethod());
        pstmt.setString(6,newlist.getSID());
        pstmt.setString(7,newlist.getSname());
        pstmt.setString(8,newlist.getList());
        pstmt.executeUpdate();
    }

    public static ResultSet keeperselectlist(Connection con) throws  Exception{
        String sql = "SELECT * FROM List";
        PreparedStatement pstmt = con.prepareStatement(sql);
        ResultSet rs3 = pstmt.executeQuery();
        return rs3;
    }

    public static void keeperaddwarehouse(Connection con,WareHouseGetSet newwarehouse) throws Exception{
        PreparedStatement pstmt = null;
        String sql = "INSERT INTO Warehouse(Wno, Wkeeper, Wkphone, Wfullsave) VALUES (?,?,?,?)";
        pstmt = con.prepareStatement(sql);
        pstmt.setString(1, newwarehouse.getWno());
        pstmt.setString(2, newwarehouse.getWkeeper());
        pstmt.setString(3, newwarehouse.getWkphone());
        pstmt.setString(4, newwarehouse.getWfullsave());
        pstmt.executeUpdate();
    }

    public static void keeperdeletewarehouse(Connection con,WareHouseGetSet newwarehouse) throws Exception{
        PreparedStatement pstmt = null;
        String sql = "DELETE FROM Warehouse WHERE Wno=?";
        pstmt = con.prepareStatement(sql);
        pstmt.setString(1, newwarehouse.getWno());
        pstmt.executeUpdate();
    }

    public static void keeperupdatewarehouse(Connection con,WareHouseGetSet newwarehouse) throws Exception{
        PreparedStatement pstmt = null;
        String sql = "update Warehouse set Wkeeper=?, Wkphone=?,Wfullsave=? where Wno=?";
        pstmt = con.prepareStatement(sql);
        pstmt.setString(1,newwarehouse.getWkeeper());
        pstmt.setString(2,newwarehouse.getWkphone());
        pstmt.setString(3,newwarehouse.getWfullsave());
        pstmt.setString(4,newwarehouse.getWno());
        pstmt.executeUpdate();
    }

    public static ResultSet keeperseletwarehouse(Connection con) throws Exception{
        String sql = "SELECT * FROM Warehouse";
        PreparedStatement pstmt = con.prepareStatement(sql);
        ResultSet rs4 = pstmt.executeQuery();
        return rs4;
    }

    public static void addkeeper(Connection con,AdminGetSet newadmin) throws Exception{
        PreparedStatement pstmt = null;
        String sql = "INSERT INTO Admin(AID, Wkeeper, Asex, Wkphone, WPassWord)VALUES(?,?,?,?,?)";
        pstmt = con.prepareStatement(sql);
        pstmt.setString(1, newadmin.getAID());
        pstmt.setString(2, newadmin.getWkeeper());
        pstmt.setString(3, newadmin.getAsex());
        pstmt.setString(4, newadmin.getWkphone());
        pstmt.setString(5, newadmin.getWpassword());
        pstmt.executeUpdate();
    }

    public static void servicepersonupdatefruit(Connection con,FruitGetSet newfruit) throws Exception{
        PreparedStatement pstmt = null;
        String sql = "update Fruit set Fprice=?, Fintroduction=?, Fstate=?, Wno=?, Fquantity=? where Fno=?";
        pstmt = con.prepareStatement(sql);
        pstmt.setString(1, newfruit.getFprice());
        pstmt.setString(2, newfruit.getFintroduction());
        pstmt.setString(3, newfruit.getFstate());
        pstmt.setString(4, newfruit.getWno());
        pstmt.setString(5, newfruit.getFquantity());
        pstmt.setString(6, newfruit.getFno());
        pstmt.executeUpdate();
    }

    public static void servicepersonupdatelist(Connection con,ListGetSet newlist) throws Exception{
        PreparedStatement pstmt = null;
        String sql = "update List set Lcount=?, Ltprice=?,Ldmethod=? where List=?";
        pstmt = con.prepareStatement(sql);
        pstmt.setString(1, newlist.getLcount());
        pstmt.setString(2, newlist.getLtprice());
        pstmt.setString(3,newlist.getLdmethod());
        pstmt.setString(4,newlist.getList());
        pstmt.executeUpdate();
    }

    public static void shopperupdatelist(Connection con,ListGetSet newlist) throws Exception{
        PreparedStatement pstmt = null;
        String sql = "update List set Fno=?, Fname=?,Lcount=?, Ltprice=?,Ldmethod=?  where List=?";
        pstmt = con.prepareStatement(sql);
        pstmt.setString(1, newlist.getFno());
        pstmt.setString(2, newlist.getFname());
        pstmt.setString(3, newlist.getLcount());
        pstmt.setString(4, newlist.getLtprice());
        pstmt.setString(5, newlist.getLdmethod());
        pstmt.setString(6,newlist.getList());
        pstmt.executeUpdate();
    }

    public static void main(String[] args) {
       CustomerServiceGetSet newcustomerservice = new CustomerServiceGetSet();
       newcustomerservice.setSPID("005");
       newcustomerservice.setSPname("贝尔");
       newcustomerservice.setSPsex("女");
       newcustomerservice.setSPphone("15198364544");
       newcustomerservice.setSPpassword("123456");
       try{
           keeperaddcustomerservice(DB.getCon(),newcustomerservice);
           System.out.println("成功");
       }catch (Exception e){
           e.printStackTrace();
       }
    }
}
