package Keeper;

import Miscellaneous.AdminGetSet;
import Miscellaneous.ClientGetSet;
import Miscellaneous.LogonTest;
import ServicePerson.ServicePersonOperation;
import Sql.DB;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;


public class KeeperRegister extends JFrame implements ActionListener {
    private Connection con;

        JLabel title = new JLabel("管理员登录");

        JLabel id = new JLabel("ID");
        JLabel password= new JLabel("密码");


        JTextField id1 = new JTextField(10);
        JPasswordField password1 = new JPasswordField(10);

        JButton Register = new JButton("登录");
        JButton Logon  = new JButton("注册");

        public KeeperRegister() {
            setTitle("登录");
            setLayout(null);

            title.setLocation(170,40);
            title.setFont(new Font("宋体",Font.PLAIN,40));
            title.setSize(600,60);

            id.setBounds(100,150,100,50);
            id1.setBounds(300,160,200,30);
            password.setBounds(100,200,100,50);
            password1.setBounds(300,210,200,30);


            Register.setBounds(100,290, 75, 45);
            Register.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent actionEvent) {
                    String adminID = id1.getText().trim();
                    String adminpassword = password1.getText().trim();
                    AdminGetSet newadmin = new AdminGetSet(adminID,adminpassword);
                    try{
                        con = DB.getCon();
                    }catch (Exception ex){
                        ex.printStackTrace();
                    }
                    try{
                        if(LogonTest.adminlogon(con,newadmin)!=null){
                            new KeeperOperation();
                        }else{
                            JFrame jFrame=new JFrame();
                            jFrame.setBounds(900,500,400,100);
                            jFrame.setLayout(null);
                            jFrame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
                            JLabel jLabel=new JLabel("账号不存在");
                            jLabel.setBounds(50,10,370,60);
                            Font font1=new Font("宋体",Font.PLAIN,20);
                            jLabel.setFont(font1);
                            jLabel.setForeground(Color.BLACK);
                            jFrame.add(jLabel);
                            jFrame.setVisible(true);
                        }
                    }catch (Exception ex){
                        ex.printStackTrace();
                    }
                }
            });
            Logon.setBounds(400, 290, 75,45);
            Logon.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent actionEvent) {
                    new KeeperLogon();
                }
            });

            add(title);

            add(id);
            add(id1);
            add(password);
            add(password1);


            add(Register);
            add(Logon);

            Register.addActionListener(this);
            Logon.addActionListener(this);

            setVisible(true);
            setBounds(600,300,600,450);
            setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        }
        public static void main(String args[]){
            new Keeper.KeeperRegister();
        }

        @Override
        public void actionPerformed(ActionEvent actionEvent) {

        }
    }

