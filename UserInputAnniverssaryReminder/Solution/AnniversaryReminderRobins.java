import java.text.SimpleDateFormat;
import java.util.Calendar;


public class AnniversaryReminderRobins {
    public static void main(String[] args) {

        Calendar suzeBirthday = Calendar.getInstance();
        suzeBirthday.set(2000, Calendar.NOVEMBER, 21);

        Calendar karlBirthday = Calendar.getInstance();
        karlBirthday.set(1993, Calendar.SEPTEMBER, 7);

        Calendar kaiserBirthday = Calendar.getInstance();
        kaiserBirthday.set(1855, Calendar.SEPTEMBER, 7);

        System.out.println("Suzes Birthday is: " + giveDate(suzeBirthday));
        System.out.println("Karls Birthday is: " + giveDate(karlBirthday));
        System.out.println("Kaisers Birthday is: " + giveDate(kaiserBirthday));
    }

    private static String giveDate(Calendar calendar){

        int day = calendar.get(Calendar.DAY_OF_MONTH);
        String month = new SimpleDateFormat("MMM").format(calendar.getTime());
        int year = calendar.get(Calendar.YEAR);

        return String.format("%d %s %d", day, month, year);
    }



}
