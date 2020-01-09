package GUI;



import Keeper.KeeperRegister;
import ServicePerson.ServicePersonRegister;
import Shopper.ShopperRegister;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

    public class ChoseUser extends JFrame implements ActionListener {

        JLabel title = new JLabel("请选择用户");

        JButton admin = new JButton("管理员");
        JButton Customerservice = new JButton("客户服务员");
        JButton Customer  = new JButton("顾客");

        public ChoseUser() {
            setTitle("请选择用户");
            setLayout(null);

            title.setLocation(170,40);
            title.setFont(new Font("宋体",Font.PLAIN,40));
            title.setSize(600,60);

            admin.setBounds(100,190, 100, 60);
            Customerservice.setBounds(250, 190, 100,60);
            Customer.setBounds(400,190,100,60);


            add(title);

            add(admin);
            add(Customerservice);
            add(Customer);

            admin.addActionListener(this);
            admin.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent actionEvent) {
                    new KeeperRegister();
                }
            });
            Customerservice.addActionListener(this);
            Customerservice.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent actionEvent) {
                    new ServicePersonRegister();
                }
            });
            Customer.addActionListener(this);
            Customer.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent actionEvent) {
                    new ShopperRegister();
                }
            });

            setVisible(true);
            setBounds(600,300,600,450);
            setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        }
        public static void main(String args[]){
            new GUI.ChoseUser();
        }

        @Override
        public void actionPerformed(ActionEvent actionEvent) {

        }
    }

