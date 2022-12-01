import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Date;

public class GUIViewEvent extends JPanel implements ActionListener {
    //TODO ALLOW CLIENT TO PUT IN SPECIFIC MONTH AND RETURN EVERY EVENT IN THAT MONTH
    //TODO READ ALL DATES INTO AN ARRAYLIST THEN SORT - MORE COMPLEXITY + STATISTICS THING
    //TODO ADD VIEW ALL BUTTON SORTED USING ARRAYLIST
    Database eventFile = new Database("N:\\computer science\\IB\\Java\\CALENDAR IA PROTOTYPE\\src\\events.txt", 21);

    JFrame frame;

    JButton viewMonth;

    JButton viewAll;

    JTextField date;

    JLabel eventLabel;

    public GUIViewEvent(int width, int height){
        this.setPreferredSize(new Dimension (width, height));
        setLayout(null);

        frame = new JFrame("View"); //initialising the window
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        //disposes the window when closed without closing the entire program
        frame.setSize(width, height);

        viewMonth = new JButton("view by month");
        viewMonth.setBounds(0,10,150,40);
        viewMonth.addActionListener(this);

        viewAll = new JButton("view all");
        viewAll.setBounds(0,60,150,40);
        viewAll.addActionListener(this);

        date = new JTextField("which month?"); //inputting the date as an integer (might change to JCalendar later)
        date.setBounds(170,10,100,40);
        date.addActionListener(this);

        frame.getContentPane().add(this);//canvas to hold the graphics

        frame.setVisible(true);//displays the frame after adding the panel to avoid drawing errors

        add(viewMonth);
        add(viewAll);
        add(date);
    }
    @Override
    public void actionPerformed(ActionEvent e){
        //TODO VIEW BY MONTH/ VIEW BY DAY OF THE WEEK BUTTONS - FILEHANDLER.READALLLINES POLYMORPHISM
        //TODO ARRAYLIST
        if(e.getSource()== viewMonth){
            if(date.getText().equals("")){
                JOptionPane.showMessageDialog(null, "You need to enter something in month.");
            }else if(date.getText().length()<3) {
                JOptionPane.showMessageDialog(null, "Enter a valid month.");
                date.setText("");
            }else{
                String month = (date.getText().substring(0, 3));
                System.out.println("Showing all data");
                FileHandler.readAllLines(month);
            }
        }else if(e.getSource()==viewAll){
            ArrayList<Date> dates = new ArrayList<Date>();
            String[] allEvents = FileHandler.readAllLines();

            int counter = 0;

            while(allEvents[counter]!=null){
                dates.add(Sorter.getDate(allEvents[counter]));
                counter+=1;
                boolean swapped = true;
                int sortedCount = 0;
                Date swap1;
                Date swap2;

                while (swapped == true) {
                    swapped = false;
                    for (int swapCounter = 0; swapCounter < dates.size() - 1; swapCounter++) {
                        if (dates.get(swapCounter).compareTo(dates.get(swapCounter+1))>0 ) {
                            swapped = true;
                            swap1 = dates.get(swapCounter);
                            swap2 = dates.get(swapCounter + 1);
                            dates.set(swapCounter+1,swap1);
                            dates.set(swapCounter,swap2);
                        }
                    }
                    sortedCount++;
                }
                System.out.println("outputting dates in order");

                for(int displayCount=0;displayCount<dates.size();displayCount++){
                    System.out.println(dates.get(displayCount));
                    //TODO NEW JScrollPane CONTAINING ALL THE VALUES

                }
                System.out.println("The sorted count is " + sortedCount);
            }
            GUIEvents show = new GUIEvents(600,400,dates);
            //TODO ALSO MAKE THIS FOR SHOW SPECIFIC EVENTS!
        }
    }
}
