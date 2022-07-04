import javax.swing.*;
import java.util.ArrayList;
//TODO implement arraylist somehow
import java.util.Collections;
import java.util.Scanner;
import java.lang.*;
import java.io.*;
import java.time.LocalDate;
import java.util.Date;
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
        System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
        Collections.addAll(dates,allEvents);
        System.out.println("start");
        System.out.println(dates);
        System.out.println("end");


    }
   public Date getDate(String record){ //TODO TO BE CHANGED
        String month = record.substring(25,28); //TODO convert to integers
        String day = record.substring(29,31);
        String year = record.substring(46,50);
        try{
            int day2 = Integer.parseInt(day); //TODO CONTINUE THIS, CONVERTING TO INTEGER
            int year2 = Integer.parseInt(year);
        }catch(IOException e){
            e.printStackTrace();
       }
        //TODO IF STATEMENTS

        //Date converted= new Date (year,month,day);
    }
}