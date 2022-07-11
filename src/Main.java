import javax.swing.*;
import java.sql.SQLOutput;
import java.util.ArrayList;
//TODO implement arraylist somehow
import java.util.Collections;
import java.util.Scanner;
import java.lang.*;
import java.io.*;
import java.time.LocalDate;
import java.util.Date;
import java.io.IOException;
//TODO ADD IN STATISTICS?
public class Main {
    public static void main(String[] args) {


        JFrame frame1 = new JFrame("Login Frame");
        frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        GUILogin myDisplay = new GUILogin(450, 250, frame1);
        frame1.add(myDisplay);
        frame1.pack();
        frame1.setVisible(true);
        frame1.setResizable(false);

        boolean day = true;
        Scanner input = new Scanner(System.in);
        Database eventFile = new Database("N:\\computer science\\IB\\Java\\CALENDAR IA PROTOTYPE\\src\\events.txt", 21); //creates a new event file with a set data length
        //todo arraylist - how to read everything from the text list back into the array?

        ArrayList<Date> dates = new ArrayList<Date>();
        String[] allEvents = FileHandler.readAllLines(); //TODO MAYBE 2D ARRAY TO ALLOW EVENT TO BE STORED TOO?
        int counter = 0;
        //TODO SORT USING BUBBLE SORT - COMPLEXITY

            while(allEvents[counter]!=null){
                dates.add(Sorter.getDate(allEvents[counter]));
                counter+=1;
            }
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
        }
        System.out.println("The sorted count is " + sortedCount);
    }




    }

