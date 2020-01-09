package ServicePerson;

import Miscellaneous.AddDeleteUpdateSelect;
import Miscellaneous.ClientGetSet;
import Miscellaneous.FruitGetSet;
import Miscellaneous.ListGetSet;
import Sql.DB;
import view.AdminClient;
import view.AdminFruit;
import view.AdminList;
import view.AdminWareHouse;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

    public class ServicePersonOperation extends JFrame implements ActionListener {
        JFrame frame = new JFrame("服务员操作");

        private JPanel panel1 = new JPanel();
        private JPanel panel2 = new JPanel();
        private JPanel panel3 = new JPanel();
        private JPanel panel4 = new JPanel();
        private JPanel panel5 = new JPanel();
        private JPanel panel6 = new JPanel();
        private JPanel panel7 = new JPanel();
        private JPanel panel8 = new JPanel();
        private JPanel panel9 = new JPanel();
        private JPanel panel10 = new JPanel();
        private JPanel panel11 = new JPanel();

        JSplitPane jSplitPane1 = new JSplitPane();

        public ServicePersonOperation(){
            frame.setSize(1300, 700);
            jSplitPane1.setDividerLocation(300);
            jSplitPane1.setDividerSize(1);
            frame.add(jSplitPane1);
            frame.setLocationRelativeTo(null);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            screen1(panel1);
            jSplitPane1.setLeftComponent(panel1);
            screen2(panel2);
            screen3(panel3);
            screen4(panel4);
            screen5(panel5);
            screen6(panel6);
            screen7(panel7);
            screen8(panel8);
            screen9(panel9);
            screen10(panel10);
            screen11(panel11);
            frame.setVisible(true);
            jSplitPane1.setEnabled(false);
        }

        public void screen1(JPanel panel) {
            panel.setLayout(null);

            JButton addButton = new JButton("增加");
            JButton deleteButton = new JButton("删除");
            JButton reviseButton = new JButton("修改");
            JButton selectButton = new JButton("查询");

            JComboBox table = new JComboBox();
            table.addItem("水果表");
            table.addItem("客户表");
            table.addItem("购物单表");
            table.setBounds(50, 100, 200, 45);

            addButton.setBounds(100, 200, 75, 45);
            addButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent actionEvent) {
                    if (table.getSelectedItem().equals("水果表")) {
                        AddDeleteUpdateSelect.setRight(panel2, jSplitPane1);
                    } else if (table.getSelectedItem().equals("客户表")) {
                        AddDeleteUpdateSelect.setRight(panel6, jSplitPane1);
                    }else if (table.getSelectedItem().equals("购物单表")) {
                        AddDeleteUpdateSelect.setRight(panel9, jSplitPane1);
                    }
                }
            });
            panel.add(addButton);

            deleteButton.setBounds(100, 300, 75, 45);
            deleteButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent actionEvent) {
                    if (table.getSelectedItem().equals("水果表")) {
                        AddDeleteUpdateSelect.setRight(panel3, jSplitPane1);
                    }else if (table.getSelectedItem().equals("客户表")) {
                        AddDeleteUpdateSelect.setRight(panel7, jSplitPane1);
                    }else if (table.getSelectedItem().equals("购物单表")) {
                        AddDeleteUpdateSelect.setRight(panel10, jSplitPane1);
                    }
                }
            });
            panel.add(deleteButton);

            reviseButton.setBounds(100, 400, 75, 45);
            reviseButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent actionEvent) {
                    if (table.getSelectedItem().equals("水果表")) {
                        AddDeleteUpdateSelect.setRight(panel4, jSplitPane1);
                    }else if (table.getSelectedItem().equals("客户表")) {
                        AddDeleteUpdateSelect.setRight(panel8, jSplitPane1);
                    }else if (table.getSelectedItem().equals("购物单表")) {
                        AddDeleteUpdateSelect.setRight(panel11, jSplitPane1);
                    }
                }
            });
            panel.add(reviseButton);

            selectButton.setBounds(100, 500, 75, 45);
            selectButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent actionEvent) {
                    AddDeleteUpdateSelect.setRight(panel5,jSplitPane1);
                }
            });
            panel.add(selectButton);

            panel.add(table);
        }

        public void screen2(JPanel panel){
            panel.setLayout(null);
            JFrame jf = new JFrame();
            jf.setDefaultCloseOperation(jf.HIDE_ON_CLOSE);
            JLabel jl = new JLabel("增加水果");
            jl.setFont(new Font("宋体", Font.PLAIN, 30));
            jl.setBounds(250, 10, 150, 30);
            panel.add(jl);

            JLabel fruitnumber = new JLabel("水果编号");
            fruitnumber.setBounds(200, 50, 100, 50);
            panel.add(fruitnumber);
            JTextField fruitnumber1 = new JTextField(10);
            fruitnumber1.setBounds(300, 60, 200, 30);
            panel.add(fruitnumber1);

            JLabel fruitvariety = new JLabel("水果种类");
            fruitvariety.setBounds(200, 100, 100, 50);
            panel.add(fruitvariety);
            JTextField fruitvariety1 = new JTextField(10);
            fruitvariety1.setBounds(300, 110, 200, 30);
            panel.add(fruitvariety1);

            JLabel fruitname = new JLabel("水果名称");
            fruitname.setBounds(200, 150, 100, 50);
            panel.add(fruitname);
            JTextField fruitname1 = new JTextField(10);
            fruitname1.setBounds(300, 160, 200, 30);
            panel.add(fruitname1);

            JLabel fruitprice = new JLabel("水果单价");
            fruitprice.setBounds(200, 200, 100, 50);
            panel.add(fruitprice);
            JTextField fruitprice1 = new JTextField(10);
            fruitprice1.setBounds(300, 210, 200, 30);
            panel.add(fruitprice1);

            JLabel fruitintroduction = new JLabel("水果简介");
            fruitintroduction.setBounds(200, 250, 100, 50);
            panel.add(fruitintroduction);
            JTextField fruitintroduction1 = new JTextField(10);
            fruitintroduction1.setBounds(300, 260, 200, 30);
            panel.add(fruitintroduction1);

            JLabel fruitstate = new JLabel("水果状态");
            fruitstate.setBounds(200, 300, 100, 50);
            panel.add(fruitstate);
            JTextField fruitstate1 = new JTextField(10);
            fruitstate1.setBounds(300, 310, 200, 30);
            panel.add(fruitstate1);

            JLabel warehousenumber = new JLabel("水果所存仓库");
            warehousenumber.setBounds(200, 350, 100, 50);
            panel.add(warehousenumber);
            JTextField warehousenumber1 = new JTextField(10);
            warehousenumber1.setBounds(300, 360, 200, 30);
            panel.add(warehousenumber1);

            JLabel warehousetime = new JLabel("水果入库时间");
            warehousetime.setBounds(200, 400, 100, 50);
            panel.add(warehousetime);
            JTextField warehousetime1 = new JTextField(10);
            warehousetime1.setBounds(300, 410, 200, 30);
            panel.add(warehousetime1);

            JLabel fruitquantity = new JLabel("水果数量");
            fruitquantity.setBounds(200, 450, 100, 50);
            panel.add(fruitquantity);
            JTextField fruitquantiry1 = new JTextField(10);
            fruitquantiry1.setBounds(300, 460, 200, 30);
            panel.add(fruitquantiry1);

            JButton confirm = new JButton("确认");
            confirm.setBounds(150, 500, 75, 45);
            confirm.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent actionEvent) {
                    try {
                        AddDeleteUpdateSelect.keeperaddfruit(DB.getCon(), new FruitGetSet(
                                fruitnumber1.getText(),
                                fruitvariety1.getText(),
                                fruitname1.getText(),
                                fruitprice1.getText(),
                                fruitintroduction1.getText(),
                                fruitstate1.getText(),
                                warehousenumber1.getText(),
                                warehousetime1.getText(),
                                fruitquantiry1.getText()));
                        System.out.println("增加成功");
                    } catch (Exception ex) {
                        System.out.println("失败");
                    }
                }
            });
            panel.add(confirm);

            JButton cancel = new JButton("取消");
            cancel.setBounds(450, 500, 75, 45);
            cancel.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent actionEvent) {
                    System.exit(0);
                }
            });
            panel.add(cancel);
        }

        public void screen3(JPanel panel){
            JLabel fruitnumber = new JLabel("水果编号");
            fruitnumber.setBounds(200, 250, 200, 50);
            panel.add(fruitnumber);
            JTextField fruitnumber2 = new JTextField(10);
            fruitnumber2.setBounds(300, 260, 300, 30);
            panel.add(fruitnumber2);

            JButton detele = new JButton("确认 ");
            detele.setBounds(350, 270, 160, 90);
            detele.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent actionEvent) {
                    try {
                        AddDeleteUpdateSelect.keeperdeletefruit(DB.getCon(), new FruitGetSet
                                (fruitnumber2.getText()));
                        System.out.println("删除成功");
                    } catch (Exception ex) {
                        ex.printStackTrace();
                    }
                }
            });
            panel.add(detele);

            JButton cancel = new JButton("取消");
            cancel.setBounds(500, 270, 160, 90);
            cancel.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent actionEvent) {
                    System.exit(0);
                }
            });
            panel.add(cancel);
        }

        public void screen4(JPanel panel){
            panel.setLayout(null);
            JFrame jf = new JFrame();
            jf.setDefaultCloseOperation(jf.HIDE_ON_CLOSE);
            JLabel jl = new JLabel("修改水果");
            jl.setFont(new Font("宋体", Font.PLAIN, 30));
            jl.setBounds(250, 10, 150, 30);
            panel.add(jl);

            JLabel fruitnumber = new JLabel("水果编号");
            fruitnumber.setBounds(200, 50, 100, 50);
            panel.add(fruitnumber);
            JTextField fruitnumber1 = new JTextField(10);
            fruitnumber1.setBounds(300, 60, 200, 30);
            panel.add(fruitnumber1);


            JLabel fruitprice = new JLabel("水果单价");
            fruitprice.setBounds(200, 100, 100, 50);
            panel.add(fruitprice);
            JTextField fruitprice1 = new JTextField(10);
            fruitprice1.setBounds(300, 110, 200, 30);
            panel.add(fruitprice1);

            JLabel fruitintroduction = new JLabel("水果简介");
            fruitintroduction.setBounds(200, 150, 100, 50);
            panel.add(fruitintroduction);
            JTextField fruitintroduction1 = new JTextField(10);
            fruitintroduction1.setBounds(300, 160, 200, 30);
            panel.add(fruitintroduction1);

            JLabel fruitstate = new JLabel("水果状态");
            fruitstate.setBounds(200, 200, 100, 50);
            panel.add(fruitstate);
            JTextField fruitstate1 = new JTextField(10);
            fruitstate1.setBounds(300, 210, 200, 30);
            panel.add(fruitstate1);

            JLabel warehousenumber = new JLabel("水果所存仓库");
            warehousenumber.setBounds(200, 250, 100, 50);
            panel.add(warehousenumber);
            JTextField warehousenumber1 = new JTextField(10);
            warehousenumber1.setBounds(300, 260, 200, 30);
            panel.add(warehousenumber1);

            JLabel fruitquantity = new JLabel("水果数量");
            fruitquantity.setBounds(200, 300, 100, 50);
            panel.add(fruitquantity);
            JTextField fruitquantiry1 = new JTextField(10);
            fruitquantiry1.setBounds(300, 310, 200, 30);
            panel.add(fruitquantiry1);

            JButton confirm = new JButton("确认");
            confirm.setBounds(150, 500, 75, 45);
            confirm.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent actionEvent) {
                    try {
                        AddDeleteUpdateSelect.servicepersonupdatefruit(DB.getCon(), new FruitGetSet(
                                fruitnumber1.getText(),
                                fruitprice1.getText(),
                                fruitintroduction1.getText(),
                                fruitstate1.getText(),
                                warehousenumber1.getText(),
                                fruitquantiry1.getText()));
                        System.out.println("修改成功");
                    } catch (Exception ex) {
                        System.out.println("失败");
                    }
                }
            });
            panel.add(confirm);

            JButton cancel = new JButton("取消");
            cancel.setBounds(450, 500, 75, 45);
            cancel.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent actionEvent) {
                    System.exit(0);
                }
            });
            panel.add(cancel);
        }

        public void screen5(JPanel panel){
            panel.setLayout(null);

            JButton selectfruitButton = new JButton("查询水果");
            JButton selectshopperButton = new JButton("查询客户");
            JButton selectlistButton = new JButton("查询订单");
            JButton selectwarehouseButton = new JButton("查询仓库");

            selectfruitButton.setBounds(100, 550, 120, 45);
            selectfruitButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent actionEvent) {
                    JScrollPane js = AdminFruit.fruittable();
                    js.setBounds(10, 20, 1000, 500);
                    panel.add(js);
                }
            });
            panel.add(selectfruitButton);

            selectshopperButton.setBounds(300, 550, 120, 45);
            selectshopperButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent actionEvent) {
                    JScrollPane js = AdminClient.clienttable();
                    js.setBounds(10, 20, 1000, 500);
                    panel.add(js);
                }
            });
            panel.add(selectshopperButton);

            selectlistButton.setBounds(500, 550, 120, 45);
            selectlistButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent actionEvent) {
                    JScrollPane js = AdminList.listtable();
                    js.setBounds(10, 20, 1000, 500);
                    panel.add(js);
                }
            });
            panel.add(selectlistButton);

            selectwarehouseButton.setBounds(700, 550, 120, 45);
            selectwarehouseButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent actionEvent) {
                    JScrollPane js = AdminWareHouse.warehousetable();
                    js.setBounds(10, 20, 1000, 500);
                    panel.add(js);
                }
            });
            panel.add(selectwarehouseButton);
        }

        public void screen6(JPanel panel){
            panel.setLayout(null);
            JFrame jf = new JFrame();
            jf.setDefaultCloseOperation(jf.HIDE_ON_CLOSE);
            JLabel jl = new JLabel("增加客户");
            jl.setFont(new Font("宋体", Font.PLAIN, 30));
            jl.setBounds(250, 10, 150, 30);
            panel.add(jl);

            JLabel clientID = new JLabel("客户编号");
            clientID.setBounds(200, 50, 100, 50);
            panel.add(clientID);
            JTextField clientID1 = new JTextField(10);
            clientID1.setBounds(300, 60, 200, 30);
            panel.add(clientID1);

            JLabel clientname = new JLabel("客户姓名");
            clientname.setBounds(200, 100, 100, 50);
            panel.add(clientname);
            JTextField clientname1 = new JTextField(10);
            clientname1.setBounds(300, 110, 200, 30);
            panel.add(clientname1);

            JLabel clientsex = new JLabel("客户性别");
            clientsex.setBounds(200, 150, 100, 50);
            panel.add(clientsex);
            JTextField clientsex1 = new JTextField(10);
            clientsex1.setBounds(300, 160, 200, 30);
            panel.add(clientsex1);

            JLabel clientphone = new JLabel("客户电话");
            clientphone.setBounds(200, 200, 100, 50);
            panel.add(clientphone);
            JTextField clientphone1 = new JTextField(10);
            clientphone1.setBounds(300, 210, 200, 30);
            panel.add(clientphone1);

            JLabel clientaddress = new JLabel("客户地址");
            clientaddress.setBounds(200, 250, 100, 50);
            panel.add(clientaddress);
            JTextField clientaddress1 = new JTextField(10);
            clientaddress1.setBounds(300, 260, 200, 30);
            panel.add(clientaddress1);

            JLabel clientpassword = new JLabel("客户密码");
            clientpassword.setBounds(200, 300, 100, 50);
            panel.add(clientpassword);
            JPasswordField clientpassword1 = new JPasswordField(10);
            clientpassword1.setBounds(300, 310, 200, 30);
            panel.add(clientpassword1);

            JButton confirm = new JButton("确认");
            confirm.setBounds(150, 500, 75, 45);
            confirm.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent actionEvent) {
                    try {
                        AddDeleteUpdateSelect.keeperaddclient(DB.getCon(), new ClientGetSet(
                                clientID1.getText(),
                                clientname1.getText(),
                                clientsex1.getText(),
                                clientphone1.getText(),
                                clientaddress1.getText(),
                                clientpassword1.getText()));
                        System.out.println("增加成功");
                    } catch (Exception ex) {
                        System.out.println("失败");
                    }
                }
            });
            panel.add(confirm);

            JButton cancel = new JButton("取消");
            cancel.setBounds(450, 500, 75, 45);
            cancel.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent actionEvent) {
                    System.exit(0);
                }
            });
            panel.add(cancel);
        }

        public void screen7(JPanel panel){
            JLabel clientID = new JLabel("客户编号");
            clientID.setBounds(200, 50, 100, 50);
            panel.add(clientID);
            JTextField clientID2 = new JTextField(10);
            clientID2.setBounds(300, 60, 200, 30);
            panel.add(clientID2);

            JButton detele = new JButton("确认 ");
            detele.setBounds(150, 500, 75, 45);
            detele.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent actionEvent) {
                    try {
                        AddDeleteUpdateSelect.keeperdeleteclient(DB.getCon(), new ClientGetSet
                                (clientID2.getText()));
                        System.out.println("删除成功");
                    } catch (Exception ex) {
                        ex.printStackTrace();
                    }
                }
            });
            panel.add(detele);

            JButton cancel = new JButton("取消");
            cancel.setBounds(450, 500, 75, 45);
            cancel.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent actionEvent) {
                    System.exit(0);
                }
            });
            panel.add(cancel);
        }

        public void screen8(JPanel panel){
            panel.setLayout(null);
            JFrame jf = new JFrame();
            jf.setDefaultCloseOperation(jf.HIDE_ON_CLOSE);
            JLabel jl = new JLabel("修改客户");
            jl.setFont(new Font("宋体", Font.PLAIN, 30));
            jl.setBounds(250, 10, 150, 30);
            panel.add(jl);

            JLabel clientID = new JLabel("客户编号");
            clientID.setBounds(200, 50, 100, 50);
            panel.add(clientID);
            JTextField clientID1 = new JTextField(10);
            clientID1.setBounds(300, 60, 200, 30);
            panel.add(clientID1);

            JLabel clientname = new JLabel("客户姓名");
            clientname.setBounds(200, 100, 100, 50);
            panel.add(clientname);
            JTextField clientname1 = new JTextField(10);
            clientname1.setBounds(300, 110, 200, 30);
            panel.add(clientname1);

            JLabel clientsex = new JLabel("客户性别");
            clientsex.setBounds(200, 150, 100, 50);
            panel.add(clientsex);
            JTextField clientsex1 = new JTextField(10);
            clientsex1.setBounds(300, 160, 200, 30);
            panel.add(clientsex1);

            JLabel clientphone = new JLabel("客户电话");
            clientphone.setBounds(200, 200, 100, 50);
            panel.add(clientphone);
            JTextField clientphone1 = new JTextField(10);
            clientphone1.setBounds(300, 210, 200, 30);
            panel.add(clientphone1);

            JLabel clientaddress = new JLabel("客户地址");
            clientaddress.setBounds(200, 250, 100, 50);
            panel.add(clientaddress);
            JTextField clientaddress1 = new JTextField(10);
            clientaddress1.setBounds(300, 260, 200, 30);
            panel.add(clientaddress1);

            JLabel clientpassword = new JLabel("客户密码");
            clientpassword.setBounds(200, 300, 100, 50);
            panel.add(clientpassword);
            JPasswordField clientpassword1 = new JPasswordField(10);
            clientpassword1.setBounds(300, 310, 200, 30);
            panel.add(clientpassword1);

            JButton confirm = new JButton("确认");
            confirm.setBounds(150, 500, 75, 45);
            confirm.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent actionEvent) {
                    try {
                        AddDeleteUpdateSelect.keeperupdateclient(DB.getCon(), new ClientGetSet(
                                clientID1.getText(),
                                clientname1.getText(),
                                clientsex1.getText(),
                                clientphone1.getText(),
                                clientaddress1.getText(),
                                clientpassword1.getText()));
                        System.out.println("修改成功");
                    } catch (Exception ex) {
                        System.out.println("失败");
                    }
                }
            });
            panel.add(confirm);

            JButton cancel = new JButton("取消");
            cancel.setBounds(450, 500, 75, 45);
            cancel.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent actionEvent) {
                    System.exit(0);
                }
            });
            panel.add(cancel);
        }

        public void screen9(JPanel panel){
            panel.setLayout(null);
            JFrame jf = new JFrame();
            jf.setDefaultCloseOperation(jf.HIDE_ON_CLOSE);
            JLabel jl = new JLabel("增加购物单");
            jl.setFont(new Font("宋体", Font.PLAIN, 30));
            jl.setBounds(250, 10, 150, 30);
            panel.add(jl);

            JLabel Listnumber = new JLabel("购物单号");
            Listnumber.setBounds(200, 50, 100, 50);
            panel.add(Listnumber);
            JTextField Listnumber1 = new JTextField(10);
            Listnumber1.setBounds(300, 60, 200, 30);
            panel.add(Listnumber1);

            JLabel fruitnumber = new JLabel("水果编号");
            fruitnumber.setBounds(200, 100, 100, 50);
            panel.add(fruitnumber);
            JTextField fruitnumber1 = new JTextField(10);
            fruitnumber1.setBounds(300, 110, 200, 30);
            panel.add(fruitnumber1);

            JLabel fruitname = new JLabel("水果名称");
            fruitname.setBounds(200, 150, 100, 50);
            panel.add(fruitname);
            JTextField fruitname1 = new JTextField(10);
            fruitname1.setBounds(300, 160, 200, 30);
            panel.add(fruitname1);

            JLabel orderamount = new JLabel("订单水果数量");
            orderamount.setBounds(200, 200, 100, 50);
            panel.add(orderamount);
            JTextField orderamount1 = new JTextField(10);
            orderamount1.setBounds(300, 210, 200, 30);
            panel.add(orderamount1);

            JLabel Totalorderprice = new JLabel("订单总价");
            Totalorderprice.setBounds(200, 250, 100, 50);
            panel.add(Totalorderprice);
            JTextField Totalorderprice1 = new JTextField(10);
            Totalorderprice1.setBounds(300, 260, 200, 30);
            panel.add(Totalorderprice1);

            JLabel shippingmethod = new JLabel("发货方式");
            shippingmethod.setBounds(200, 300, 100, 50);
            panel.add(shippingmethod);
            JTextField shippingmethod1 = new JTextField(10);
            shippingmethod1.setBounds(300, 310, 200, 30);
            panel.add(shippingmethod1);

            JLabel shopperID = new JLabel("客户ID");
            shopperID.setBounds(200, 350, 100, 50);
            panel.add(shopperID);
            JTextField shopperID1 = new JTextField(10);
            shopperID1.setBounds(300, 360, 200, 30);
            panel.add(shopperID1);

            JLabel shoppername = new JLabel("客户姓名");
            shoppername.setBounds(200, 400, 100, 50);
            panel.add(shoppername);
            JTextField shoppername1 = new JTextField(10);
            shoppername1.setBounds(300, 410, 200, 30);
            panel.add(shoppername1);

            JButton confirm = new JButton("确认");
            confirm.setBounds(150, 500, 75, 45);
            confirm.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent actionEvent) {
                    try {
                        AddDeleteUpdateSelect.keeperaddlist(DB.getCon(), new ListGetSet(
                                Listnumber1.getText(),
                                fruitnumber1.getText(),
                                fruitname1.getText(),
                                orderamount1.getText(),
                                Totalorderprice1.getText(),
                                shippingmethod1.getText(),
                                shopperID1.getText(),
                                shoppername1.getText()));
                        System.out.println("增加成功");
                    } catch (Exception ex) {
                        System.out.println("失败");
                    }
                }
            });
            panel.add(confirm);

            JButton cancel = new JButton("取消");
            cancel.setBounds(450, 500, 75, 45);
            cancel.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent actionEvent) {
                    System.exit(0);
                }
            });
            panel.add(cancel);
        }

        public void screen10(JPanel panel){
            JLabel listnumber = new JLabel("购物单号");
            listnumber.setBounds(200, 50, 100, 50);
            panel.add(listnumber);
            JTextField listnumber2 = new JTextField(10);
            listnumber2.setBounds(300, 60, 200, 30);
            panel.add(listnumber2);

            JButton detele = new JButton("确认 ");
            detele.setBounds(150, 500, 75, 45);
            detele.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent actionEvent) {
                    try {
                        AddDeleteUpdateSelect.keeperdeletelist(DB.getCon(), new ListGetSet
                                (listnumber2.getText()));
                        System.out.println("删除成功");
                    } catch (Exception ex) {
                        ex.printStackTrace();
                    }
                }
            });
            panel.add(detele);

            JButton cancel = new JButton("取消");
            cancel.setBounds(450, 500, 75, 45);
            cancel.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent actionEvent) {
                    System.exit(0);
                }
            });
            panel.add(cancel);
        }

        public void screen11(JPanel panel){
            panel.setLayout(null);
            JFrame jf = new JFrame();
            jf.setDefaultCloseOperation(jf.HIDE_ON_CLOSE);
            JLabel jl = new JLabel("修改购物单");
            jl.setFont(new Font("宋体", Font.PLAIN, 30));
            jl.setBounds(250, 10, 150, 30);
            panel.add(jl);

            JLabel Listnumber = new JLabel("购物单号");
            Listnumber.setBounds(200, 50, 100, 50);
            panel.add(Listnumber);
            JTextField Listnumber1 = new JTextField(10);
            Listnumber1.setBounds(300, 60, 200, 30);
            panel.add(Listnumber1);

            JLabel orderamount = new JLabel("订单水果数量");
            orderamount.setBounds(200, 100, 100, 50);
            panel.add(orderamount);
            JTextField orderamount1 = new JTextField(10);
            orderamount1.setBounds(300, 110, 200, 30);
            panel.add(orderamount1);

            JLabel Totalorderprice = new JLabel("订单总价");
            Totalorderprice.setBounds(200, 150, 100, 50);
            panel.add(Totalorderprice);
            JTextField Totalorderprice1 = new JTextField(10);
            Totalorderprice1.setBounds(300, 160, 200, 30);
            panel.add(Totalorderprice1);

            JLabel shippingmethod = new JLabel("发货方式");
            shippingmethod.setBounds(200, 200, 100, 50);
            panel.add(shippingmethod);
            JTextField shippingmethod1 = new JTextField(10);
            shippingmethod1.setBounds(300, 210, 200, 30);
            panel.add(shippingmethod1);

            JButton confirm = new JButton("确认");
            confirm.setBounds(150, 500, 75, 45);
            confirm.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent actionEvent) {
                    try {
                        AddDeleteUpdateSelect.servicepersonupdatelist(DB.getCon(), new ListGetSet(
                                Listnumber1.getText(),
                                orderamount1.getText(),
                                Totalorderprice1.getText(),
                                shippingmethod1.getText()));
                        System.out.println("修改成功");
                    } catch (Exception ex) {
                        System.out.println("失败");
                    }
                }
            });
            panel.add(confirm);

            JButton cancel = new JButton("取消");
            cancel.setBounds(450, 500, 75, 45);
            cancel.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent actionEvent) {
                    System.exit(0);
                }
            });
            panel.add(cancel);
        }

        public static void main(String args[]){
            new ServicePersonOperation();
        }

        @Override
        public void actionPerformed(ActionEvent actionEvent) {
        }
    }

