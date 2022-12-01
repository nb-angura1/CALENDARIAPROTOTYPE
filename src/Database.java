import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.sql.SQLOutput;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Database { //database code, responsible for writing to, reading from and deleting records from the text file

    private String fileName;
    private int rowWidth;
    private int recordCount = 0;


    public Database(String fileName, int rowWidth) {
        this.fileName = fileName;
        this.rowWidth = rowWidth;
        //countRecords();
    }

    public void appendRecord(String data, Date date) {

        int currentLength = data.length();
        int padLength = rowWidth - currentLength;
        if (data.length() < 50) {
            String result = Padder.rightPadding(data, ' ', 50);
            FileHandler.appendLine(fileName, result, date);
        } else {
            FileHandler.appendLine(fileName, data, date);
        }

        // TODO: Report an error if the data is too long for the record
    }

    public void deleteRecord(int rowNumber) {
      FileHandler.writeLineAt(fileName,"#",49*rowNumber);
    }

    public void deleteRecord(Date date){
        SimpleDateFormat sdf = new SimpleDateFormat("E MMM dd HH:mm:ss z yyyy");
        String dateAsString = sdf.format(date);
        System.out.println("this is " + dateAsString);
        int count = 0;
        try {
            FileReader fr = new FileReader("N:\\computer science\\IB\\Java\\CALENDAR IA PROTOTYPE\\src\\events.txt");
            BufferedReader br = new BufferedReader(fr);
            String line = br.readLine();
            while (line != null) {
                System.out.println(count);
                int index = line.indexOf(dateAsString);
                if(index>0){
                    System.out.print("yes");
                    FileHandler.writeLineAt("N:\\computer science\\IB\\Java\\CALENDAR IA PROTOTYPE\\src\\events.txt","#",count *49);
                }else{
                    System.out.print("no");
                }
                line = br.readLine();
                count +=1;
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }


    public void addRecord(String input, Date date) {
        //TODO polymorphism - overloading possible here (possibly adding in an optional specific time)
        FileHandler.appendLine(fileName, input, date);
    }

    public String getRecord(int rowNumber) {
        return FileHandler.readLineAt(fileName, rowNumber * (rowWidth + 1));
    }

    public int getRecordCount() {
        int count = 1;
        String record = " ";
        while (record != null) {
            record = getRecord(count);
            count++;
            record = getRecord(count);
            System.out.println(record);
        }
        return count - 1;
    }

    //public boolean findRecord(String data) {
        // search for a record matching data
        // return true if found
        //String fileData = "";
        // while (fileData null){

        // }
//}
    }


