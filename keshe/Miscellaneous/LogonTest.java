package Miscellaneous;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class LogonTest {
    public static CustomerServiceGetSet servicepersonlogon(Connection con,CustomerServiceGetSet newcustmerservice) throws Exception{
       CustomerServiceGetSet newserviceperson = null;
       String sql="select * from SP where SPID=? and SPpassword=?;";
        PreparedStatement pstmt= con.prepareStatement(sql);
        pstmt.setString(1,newcustmerservice.getSPID());
        pstmt.setString(2,newcustmerservice.getSPpassword());
        ResultSet rs5=pstmt.executeQuery();
        if(rs5.next()){
            newserviceperson=new CustomerServiceGetSet();
            newserviceperson.setSPID(rs5.getString("SPID"));
            newserviceperson.setSPpassword(rs5.getString("SPpassword"));
        }
        return newserviceperson;
    }

    public static ClientGetSet shopperlogon(Connection con,ClientGetSet newclient) throws Exception{
        ClientGetSet newclient1 = null;
        String sql="select * from Shopper where SID=? and Spassword=?;";
        PreparedStatement pstmt= con.prepareStatement(sql);
        pstmt.setString(1,newclient.getSID());
        pstmt.setString(2,newclient.getSpassword());
        ResultSet rs6=pstmt.executeQuery();
        if(rs6.next()){
            newclient1=new ClientGetSet();
            newclient1.setSID(rs6.getString("SID"));
            newclient1.setSpassword(rs6.getString("Spassword"));
        }
        return newclient1;
    }

    public static AdminGetSet adminlogon(Connection con,AdminGetSet  newadmin) throws Exception{
        AdminGetSet newkeeper = null;
        String sql="select * from Admin where AID=? and WPassWord=?;";
        PreparedStatement pstmt= con.prepareStatement(sql);
        pstmt.setString(1,newadmin.getAID());
        pstmt.setString(2,newadmin.getWpassword());
        ResultSet rs7=pstmt.executeQuery();
        if(rs7.next()){
            newkeeper=new AdminGetSet();
            newkeeper.setAID(rs7.getString("AID"));
            newkeeper.setWpassword(rs7.getString("Wpassword"));
        }
        return newkeeper;
    }
}
