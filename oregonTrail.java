import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class oregonTrail {
    private JButton stopToLookAroundButton;
    private JButton nextDayButton;
    private JButton inventoryButton;
    private JPanel panel1;
    private JButton storeButton;
    private JLabel numberOfDays;


    public oregonTrail() {
        stopToLookAroundButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        inventoryButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int itemInventory[ ]= new int[8];
                itemInventory[1]= 100;
                itemInventory[2]= 45;
                itemInventory[3]= 2;
                itemInventory[4]= 55;
                itemInventory[5]= 300;
                itemInventory[6]= 35;
                itemInventory[7]= 36;

                JOptionPane.showMessageDialog(null, itemInventory[1] + " bottles of water" + "\n"
                        +itemInventory[2] + " bottles of beer" + "\n" + itemInventory[3] + " spare wheels" + "\n"
                        + itemInventory[4] + " bullets" + "\n" +itemInventory[5] +" dollars" + "\n"
                        +itemInventory[6] + " cases of food" + "\n" + itemInventory[7] + " cases of animal food");
            }
        });
        nextDayButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int dayCounter = 0;
                do {
                    dayCounter = dayCounter + 1;
                    numberOfDays.setText(Integer.toString(dayCounter));
                }while (dayCounter <= 200);
            }
        });
        storeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }

    public static void main(String[] args) {
        JFrame myFrame = new JFrame("Display Phone Number"); //Makes the frame
        myFrame.setContentPane(new oregonTrail().panel1); //attaches the panel to the frame

        //sets up what happens with the frame is closes
        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        myFrame.setPreferredSize(new Dimension(700, 500));
        myFrame.setResizable(false);

        myFrame.pack(); //put everything in the frame
        myFrame.setVisible(true); //allows us to see the frame

    }
}
