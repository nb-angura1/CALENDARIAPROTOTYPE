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
//todo add in editable events
//TODO write everything into labels so it can be shown in the Gui
public class Main {
    public static void main(String[] args) {

        GUILogin myDisplay = new GUILogin(450, 300);

        boolean day = true;
        Scanner input = new Scanner(System.in);
        Database eventFile = new Database("N:\\computer science\\IB\\Java\\CALENDAR IA PROTOTYPE\\src\\events.txt", 21); //creates a new event file with a set data length
        //todo arraylist - how to read everything from the text list back into the array?

        ArrayList<Date> dates = new ArrayList<Date>();
        String[] allEvents = FileHandler.readAllLines(); //TODO MAYBE 2D ARRAY TO ALLOW EVENT TO BE STORED TOO?
        int counter = 0;
        //TODO PUT ALL IN A CLASS

    }




    }

