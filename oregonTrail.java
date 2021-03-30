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
    private JButton tradeButton;
    private JButton talkButton;
    private JButton restButton;
    private JButton paceButton;
    private JButton huntButton;
    private JButton mapButton;
    private JButton guideButton;
    private JButton statusButton;
    private JButton rationsButton;
    private JButton buyButton;
    private JButton continueButton;
    private int dayCounter;
    private int[] itemInventory = {100, 45, 2, 55, 300, 35, 36};
    private int[] itemInventorys = {100, 45, 2, 55, 300, 35, 36};
    private int currentLocation = 0;
    private String[] locations = {"Kansas River Crossing", "Big Blue River", "Fort Kearney", "Chimney Rock", "Fort Laramie", "Independence Rock", "South Pass", "Fort Bridger", "Green River", "Soda Springs", "Fort Hall", "Snake River", "Fort Boise", "Grade Ronde Valley"};
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
        paceButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Object[] options = {"A steady pace", "A strenuous pace", "A grueling pace"};
                JOptionPane.showOptionDialog(null, "How fast do you want to travel?", "Question", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[2]);
            }
        });
        continueButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "You have reached " + locations[currentLocation++]);
            }
        });
        mapButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ImageIcon icon = new ImageIcon("OregonTrailMap.jpg");
                JOptionPane.showMessageDialog(null, icon);
            }
        });
        rationsButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Object[] options = {"Filling", "Meager", "Bare Bones"};
                JOptionPane.showOptionDialog(null, "How much do you want to eat?", "Question", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[2]);
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
