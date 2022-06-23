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
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        String dateAsString = sdf.format(date);
        FileHandler.writeLineAt();
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


