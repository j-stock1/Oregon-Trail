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
    private int dayCounter;
    private int[] itemInventory = {100, 45, 2, 55, 300, 35, 36};
    private int[] itemInventorys = {100, 45, 2, 55, 300, 35, 36};
    public oregonTrail() {
        stopToLookAroundButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        inventoryButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                JOptionPane.showMessageDialog(null, itemInventory[0] + " bottles of water" + "\n"
                        +itemInventory[1] + " bottles of beer" + "\n" + itemInventory[2] + " spare wheels" + "\n"
                        + itemInventory[3] + " bullets" + "\n" +itemInventory[4] +" dollars" + "\n"
                        +itemInventory[5] + " cases of food" + "\n" + itemInventory[6] + " cases of animal food");
            }
        });
        nextDayButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dayCounter++;
                numberOfDays.setText(Integer.toString(dayCounter));
            }
        });
        storeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                JOptionPane.showMessageDialog(null, itemInventorys[0] + " bottles of water" + "\n"
                        +itemInventorys[1] + " bottles of beer" + "\n" + itemInventorys[2] + " spare wheels" + "\n"
                        + itemInventorys[3] + " bullets" + "\n" +itemInventorys[4] +" dollars" + "\n"
                        +itemInventorys[5] + " cases of food" + "\n" + itemInventorys[6] + " cases of animal food");
                for (int i = 0; i < 7; i++) {
                    itemInventory[i] += itemInventorys[i];
                    itemInventorys[i] = 0;
                }
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
