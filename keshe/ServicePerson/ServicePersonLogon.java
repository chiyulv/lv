package ServicePerson;


import Keeper.KeeperRegister;
import Miscellaneous.AddDeleteUpdateSelect;
import Miscellaneous.CustomerServiceGetSet;
import Sql.DB;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.Statement;

public class ServicePersonLogon extends JFrame implements ActionListener {
        private static final Statement PraparedStatement = null;
        Connection con;

        JLabel title = new JLabel("注册客户管理员");

        JLabel id = new JLabel("Id");
        JLabel name = new JLabel("姓名");
        JLabel sex = new JLabel("性别");
        JLabel tel = new JLabel("电话");
        JLabel password = new JLabel("密码");

        JTextField id1 = new JTextField(10);
        JTextField name1 = new JTextField(10);
        JTextField sex1 = new JTextField(10);
        JTextField tel1 = new JTextField(10);
        JPasswordField password1 = new JPasswordField(10);

        JButton yes = new JButton("确认");
        JButton no  = new JButton("取消");

        public ServicePersonLogon() {
            setTitle("添加客户管理员信息");
            setLayout(null);

            title.setLocation(170,40);
            title.setFont(new Font("宋体",Font.PLAIN,40));
            title.setSize(600,60);

            id.setBounds(100,90,100,50);
            id1.setBounds(300,100,200,30);
            name.setBounds(100,140,100,50);
            name1.setBounds(300,150,200,30);
            sex.setBounds(100,190,100,50);
            sex1.setBounds(300,200,200,30);
            tel.setBounds(100,240,100,50);
            tel1.setBounds(300,250,200,30);
            password.setBounds(100, 290, 100, 50);
            password1.setBounds(300, 300, 200, 30);

            yes.setBounds(100,450, 100, 60);
            yes.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent actionEvent) {
                    try{
                        AddDeleteUpdateSelect.keeperaddcustomerservice(DB.getCon(), new CustomerServiceGetSet(
                                id1.getText(),
                                name1.getText(),
                                sex1.getText(),
                                tel1.getText(),
                                password1.getText()));
                        System.out.println("增加成功");
                        try{
                            new ServicePersonRegister();
                        }catch (Exception ex){
                        }
                    }catch (Exception ex){
                        System.out.println("失败");
                    }
                }
            });
            no.setBounds(400, 450, 100,60);
            no.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent actionEvent) {
                    System.exit(0);
                }
            });

            add(title);

            add(id);
            add(id1);
            add(name);
            add(name1);
            add(sex);
            add(sex1);
            add(tel);
            add(tel1);
            add(password);
            add(password1);

            add(yes);
            add(no);

            yes.addActionListener(this);
            no.addActionListener(this);

            setVisible(true);
            setBounds(600,300,600,600);
            setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        }
        public static void main(String args[]){
            new ServicePerson.ServicePersonLogon();
        }

        @Override
        public void actionPerformed(ActionEvent actionEvent) {

        }
    }

