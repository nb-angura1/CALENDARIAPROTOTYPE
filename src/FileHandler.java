import java.io.BufferedReader;
import java.io.FileReader;
import java.io.PrintWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.text.SimpleDateFormat;
import java.util.Date;


public class FileHandler {

    public static void appendLine(String fileName, String data, Date date) {
        // write text to end of the file
        boolean append = true;
        try (PrintWriter pr = new PrintWriter(new FileWriter(fileName, append))) {
            pr.println(data + date);
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String readLineAt(String fileName, int start) {
        // grab the line from position "start" in the file
        String readData;
        try (RandomAccessFile rf = new RandomAccessFile(fileName, "rws")) {
            rf.seek(start);
            readData = rf.readLine();
            //System.out.println(readData.indexOf("#"));
            if(readData.indexOf("#")!=-1){ //TODO MAKE THIS CORRECTLY FLAG CERTAIN LINES TO NOT BE READ
                return ("this line has been deleted");
            }else{
                return readData;
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static void writeLineAt(String fileName, String data, int start) {
        try (RandomAccessFile rf = new RandomAccessFile(fileName, "rws")) {
            rf.seek(start);
            rf.writeBytes(data);
            System.out.println(start);
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static int countLines(String fileName) {
        // return the number of lines in the file
        int count = 0;
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line = br.readLine();
            while (line != null) {
                count++;
                System.out.println(line);
                line = br.readLine();
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        return count;
    }
    public static String[] readAllLines(){ //reads all the lines in the file line-by-line
    //todo make this an array
        String line1;
        String[] line2 = new String[16];
        try {
            FileReader fr = new FileReader("N:\\computer science\\IB\\Java\\CALENDAR IA PROTOTYPE\\src\\events.txt");
            BufferedReader br = new BufferedReader(fr);
            int count = 0;
            line1 = br.readLine();
            //linear search essentially
            while (line1 != null) {
                int index = line1.indexOf('#');
                if(index > 0){
                }else {
                    line2[count] =line1;
                    System.out.println(line2[count]);
                    count+=1;
                }
                line1 = br.readLine();
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        return line2;
    }
    public static void readAllLines(String month){ //reads all the lines in the file line-by-line
        try {
            FileReader fr = new FileReader("N:\\computer science\\IB\\Java\\CALENDAR IA PROTOTYPE\\src\\events.txt");
            BufferedReader br = new BufferedReader(fr);
            String line = br.readLine();
            //linear search essentially
            while (line != null) {
                int index = line.indexOf('#');
                int indexTwo = line.indexOf(month);
                if(index > 0){
                    System.out.print("");
                }else{
                    if(indexTwo > 0) {
                        System.out.println(line);
                    }else{
                        System.out.print("");
                    }
                }
                line = br.readLine();
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }

        //todo possibly another filehandler class???? - needed to actually have the events with their date
    }

}