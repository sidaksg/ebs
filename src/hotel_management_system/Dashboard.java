package hotel_management_system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Dashboard extends JFrame {
    public static void main(String[] args) {
        new Dashboard().setVisible(true);

    }
    public Dashboard(){
        super("Hotel Mangement System");
        setForeground(Color.CYAN);
        setLayout(null);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/third.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1950, 100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel NewLabel = new JLabel(i3);
        NewLabel.setBounds(0,0, 1950, 100);
        add(NewLabel);

        JLabel AirlineManagementSystem = new JLabel("THE TAJ GROUP WELCOMES YOU");
        AirlineManagementSystem.setForeground(Color.WHITE);
        AirlineManagementSystem.setFont(new Font("Tahoma", Font.PLAIN, 46));
        AirlineManagementSystem.setBounds(600, 60, 1000, 85);
        NewLabel.add(AirlineManagementSystem);

        JMenuBar menuBar = new JMenuBar();
        setJMenuBar(menuBar);

        JMenu AirlineSystem = new JMenu("Hotel Management");
        AirlineSystem.setForeground(Color.BLUE);
        menuBar.add(AirlineSystem);

        JMenuItem FlightDetails = new JMenuItem("RECEPTION");
        AirlineSystem.add(FlightDetails);

        JMenu AirlineSystemHello = new JMenu("ADMIN");
        AirlineSystemHello.setForeground(Color.RED);
        menuBar.add(AirlineSystemHello);

        JMenuItem FlightDetailshello1 = new JMenuItem("ADD EMPLOYEE");
        AirlineSystemHello.add(FlightDetailshello1);

        FlightDetailshello1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    new AddEmployee().setVisible(true);
                }catch (Exception ee){}
            }
        });
        JMenuItem FlightDetailshello2 = new JMenuItem("ADD ROOMS");
        AirlineSystemHello.add(FlightDetailshello2);
        FlightDetailshello2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                try{
                    new AddRoom().setVisible(true);
                }catch(Exception e ){}
            }
        });
        FlightDetails.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                new hotel.Reception();
            }
        });


        JMenuItem FlightDetailshello3  = new JMenuItem("ADD DRIVERS");
        AirlineSystemHello.add(FlightDetailshello3);

        FlightDetailshello3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    new AddDrivers().setVisible(true);

                }catch(Exception e1){}
            }
        });
        setSize(1950, 1090);
        setVisible(true);
getContentPane().setBackground(Color.WHITE);
}
}