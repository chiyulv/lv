package Shopper;

import Miscellaneous.AddDeleteUpdateSelect;
import Miscellaneous.ListGetSet;
import Sql.DB;
import view.AdminFruit;
import view.AdminList;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ShopperOperation extends JFrame implements ActionListener {
    JFrame frame = new JFrame("顾客操作");

    private JPanel panel1 = new JPanel();
    private JPanel panel2 = new JPanel();
    private JPanel panel3 = new JPanel();
    private JPanel panel4 = new JPanel();
    private JPanel panel5 = new JPanel();

    JSplitPane jSplitPane1 = new JSplitPane();

    public ShopperOperation(){
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
        frame.setVisible(true);
        jSplitPane1.setEnabled(false);
    }
    public void screen1(JPanel panel){
        panel.setLayout(null);

        JButton addButton = new JButton("增加");
        JButton deleteButton = new JButton("删除");
        JButton reviseButton = new JButton("修改");
        JButton selectButton = new JButton("查询");

        JComboBox table = new JComboBox();
        table.addItem("购物单表");
        table.setBounds(50, 100, 200, 45);

        addButton.setBounds(100, 200, 75, 45);
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                AddDeleteUpdateSelect.setRight(panel2, jSplitPane1);
            }
        });
        panel.add(addButton);

        deleteButton.setBounds(100, 300, 75, 45);
        deleteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                    AddDeleteUpdateSelect.setRight(panel3, jSplitPane1);
            }
        });
        panel.add(deleteButton);

        reviseButton.setBounds(100, 400, 75, 45);
        reviseButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                    AddDeleteUpdateSelect.setRight(panel4, jSplitPane1);
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
    public void screen3(JPanel panel){
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
    public void screen4(JPanel panel){
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

        JButton confirm = new JButton("确认");
        confirm.setBounds(150, 500, 75, 45);
        confirm.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                try {
                    AddDeleteUpdateSelect.shopperupdatelist(DB.getCon(), new ListGetSet(
                            Listnumber1.getText(),
                            fruitnumber1.getText(),
                            fruitname1.getText(),
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
    public void screen5(JPanel panel){
        panel.setLayout(null);

        JButton selectfruitButton = new JButton("查询水果");
        JButton selectlistButton = new JButton("查询订单");

        selectfruitButton.setBounds(250, 550, 120, 45);
        selectfruitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                JScrollPane js = AdminFruit.fruittable();
                js.setBounds(10, 20, 1000, 500);
                panel.add(js);
            }
        });
        panel.add(selectfruitButton);

        selectlistButton.setBounds(650, 550, 120, 45);
        selectlistButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                JScrollPane js = AdminList.listtable();
                js.setBounds(10, 20, 1000, 500);
                panel.add(js);
            }
        });
        panel.add(selectlistButton);

    }

    public static void main(String args[]){
        new ShopperOperation();
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
    }
}
