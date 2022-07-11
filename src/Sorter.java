import java.util.Date;

public class Sorter {

    public Sorter(){
    }
    public static Date getDate(String record){
        String month = record.substring(24,27); //TODO convert to integers
        String day = record.substring(28,30);
        String year = record.substring(45,48);

        int day2 = Integer.parseInt(day); //TODO CONTINUE THIS, CONVERTING TO INTEGER
        int year2 = Integer.parseInt(year);
        year2+=100;
        int month2 = 0;

        if(month.equals("Jan")==true){
            month2 = 0;
        } else if (month.equals("Feb")==true) {
            month2 = 1;
        }else if (month.equals("Mar")==true) {
            month2 = 2;
        }else if (month.equals("Apr")==true) {
            month2 = 3;
        }else if (month.equals("May")==true) {
            month2 = 4;
        }else if (month.equals("Jun")==true) {
            month2 = 5;
        }else if (month.equals("Jul")==true) {
            month2 = 6;
        }else if (month.equals("Aug")==true) {
            month2 = 7;
        }else if (month.equals("Sep")==true) {
            month2 = 8;
        }else if (month.equals("Oct")==true) {
            month2 = 9;
        }else if (month.equals("Nov")==true) {
            month2 = 10;
        }else if (month.equals("Dec")==true) {
            month2 = 11;
        }

        Date converted = new Date(year2, month2,day2);
        System.out.println("THIS IS THE DATE:");
        System.out.println(converted);
        return converted;
    }
}
//TODO TAKE SORTED CODE OUT OF MAIN AND PUT IN HERE - connect to view all events