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

        ArrayList<String> dates = new ArrayList<String>();
        String[] allEvents = FileHandler.readAllLines();

        Collections.addAll(dates,allEvents);
            for(int counter = 0; counter<dates.size();counter++){
                Sorter sort = new Sorter(dates.get(counter));
                sort.getDate();
            }


        System.out.println("start");
        System.out.println(dates);
        System.out.println("end");
        //TODO COLLECT ALL DATES, PUT IN ORDER, USE INDEX OF TO DISPLAY THEM BACK IN
    }

}