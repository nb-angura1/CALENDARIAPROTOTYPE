import java.io.FileReader;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.io.FileWriter;
import java.io.PrintWriter;

public class Database { //database code, responsible for writing to, reading from and deleting records from the text file

    private String fileName;
    private int rowWidth;
    private int recordCount = 0;


    public Database(String fileName, int rowWidth) {
        this.fileName = fileName;
        this.rowWidth = rowWidth;
        //countRecords();
    }

    public void appendRecord(String data) {
        // TODO: Pad the data to the correct record width
        int currentLength = data.length();
        int padLength = rowWidth - currentLength;
        if (data.length() < 20) {
            String result = Padder.rightPadding(data, ' ', 20);
            FileHandler.appendLine(fileName, result);
        } else {
            FileHandler.appendLine(fileName, data);
        }

        // TODO: Report an error if the data is too long for the record
    }

    public void deleteRecord(int rowNumber) {
        try (FileWriter fw = new FileWriter(fileName, true);
             RandomAccessFile raf = new RandomAccessFile(fileName, "rws");
        ) {
            raf.seek(rowNumber);
            raf.write(getRecordCount(fileName));
            fw.write("      ");
        } catch (IOException e) {
            e.printStackTrace();
        }
        //remember to decrement record count
        recordCount = recordCount - 1;
    }

    public void addRecord(String input) {
        FileHandler.appendLine(fileName, input);
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


