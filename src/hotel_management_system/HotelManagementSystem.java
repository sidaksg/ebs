package hotel_management_system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.jar.JarFile;

public class HotelManagementSystem extends JFrame implements ActionListener {
JLabel l1;
JButton b1;
public HotelManagementSystem(){
    setSize(1366, 430);
    setLayout(null);
    setLocation(300, 300);

    l1 = new JLabel("");
    b1 = new JButton("Next");
    b1.setBackground(Color.WHITE);
    b1.setForeground(Color.BLACK);

    ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/first.jpg"));
    Image i3 = i1.getImage().getScaledInstance(1366, 390, Image.SCALE_DEFAULT);
    ImageIcon i2 = new ImageIcon(i3);
    l1 = new JLabel(i2);

    JLabel lid = new JLabel("Hotel Management System");
    lid.setBounds(30, 300, 1500, 100);
    lid.setFont(new Font("serif", Font.PLAIN, 70));
    lid.setForeground(Color.MAGENTA);

    b1.setBounds(1170, 325, 150, 50);
    l1.setBounds(0, 0, 1366, 390);
    l1.add(b1);
    add(l1);

    while(true){
        lid.setVisible(false);
        try{
            Thread.sleep(5000);
        }catch (Exception e){}
    }

}
public void actionPerformed(ActionEvent ae){
    new Login().setVisible(true);
    this.setVisible(false);
}

    public static void main(String[] args) {
        HotelManagementSystem window = new HotelManagementSystem();
       window.setVisible(true);
    }
}
