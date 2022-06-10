import javax.swing.*;
import java.text.SimpleDateFormat;
import java.util.Scanner;
import java.lang.*;
import java.io.*;
import java.time.LocalDate;
import java.util.Date;
//TODO FIND A WAY TO READ THROUGH EACH CHAR IN THE FILE AND FIND A WAY TO ORGANISE BY MONTHS + OUTPUT
public class Main {
    public static void main(String[] args) {
        JFrame frame1 = new JFrame("Login Frame");
        frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        GUILogin myDisplay = new GUILogin(450,250,frame1);
        frame1.add(myDisplay);
        frame1.pack();
        frame1.setVisible(true);
        frame1.setResizable(false);



        boolean day = true;
        Scanner input = new Scanner(System.in);
        Database eventFile = new Database("N:\\computer science\\IB\\Java\\CALENDAR IA PROTOTYPE\\src\\events.txt", 21); //creates a new event file with a set data length
        //gives user the option of what they would like to do

        System.out.println("Input time in form dd-MM-yyyy:");
        String dateInString = input.nextLine();
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
            Date date = sdf.parse(dateInString);
            System.out.println(date);
        }catch(java.text.ParseException e){
            e.printStackTrace();
        }

        System.out.println("What would you like to do?");
        System.out.println("1)Enter new events");
        System.out.println("2)View current events");
        System.out.println("3)Exit.");


        int num = input.nextInt();

        /*if (num == 1) {
            System.out.println("Enter 'no' in order to exit the program.");
            while (day) { //loops and keeps adding data until one day is completed
                System.out.println("Enter the event to take place.");
                String answer = input.nextLine();
                System.out.println("okay");
                if(answer.equals("no")){
                    day =false;
                }else {
                    String event = answer;
                    int eventLength = event.length(); //find length of input for random file access
                    //pads every event to the same length (100 characters) to allow for successful random file access
                    event = Padder.rightPadding(event, ' ', 20);
                    eventFile.addRecord(event);
                    //System.out.println("padded event " + event);
                }
            }
        } else if (num == 2) {

        } else {
            //if user selects option 3, the program in ended
            System.out.println("Finished.");
            System.exit(0);
        }
    }*/
    }
}
//  String eevent = eventFile.getRecord(10);
 //           System.out.println(eevent);
