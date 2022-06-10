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
        // TODO: Pad the data to the correct record width
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
      //TODO WRITING HASHTAG IN RIGHT PLACE, READ THROUGH EVERY CHAR AND IF THERE IS A HASHTAG IGNORE IT
    }

    public void addRecord(String input, Date date) {
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


