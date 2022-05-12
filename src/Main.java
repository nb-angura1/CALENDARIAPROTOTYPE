import java.util.Scanner;
import java.lang.*;
import java.io.*;
public class Main {
    public static void main(String[] args) {
        boolean day = true;
        Scanner input = new Scanner(System.in);
        Database eventFile = new Database("N:\\computer science\\IB\\Java\\CALENDAR IA PROTOTYPE\\src\\events.txt", 21);
        //gives user the option of what they would like to do
        System.out.println("What would you like to do?" +
                "1) Enter new events" +
                "2) View current events" +
                "3)Exit.");
        int num = input.nextInt();
        if (num == 1) {
            while (day) { //loops and keeps adding data until one day is completed
                System.out.println("Enter the event to take place");
                String event = input.nextLine();
                int eventLength = event.length(); //find length of input for random file access
                //System.out.println(eventLength);
                //pads every event to the same length (100 characters) to allow for successful random file access
                event = Padder.rightPadding(event, ' ', 10);
                eventFile.appendRecord(event);
                //System.out.println("padded event " + event);

                System.out.println("Would you like to enter more events for today?");
                String answer = input.nextLine();
                if (answer.equals("no")) {
                    day = false;
                }
            }
        } else if (num == 2) {

        } else {
            //if user selects option 3, the program in ended
            System.out.println("Finished.");
            System.exit(0);
        }
    }
}
//  String eevent = eventFile.getRecord(10);
 //           System.out.println(eevent);
