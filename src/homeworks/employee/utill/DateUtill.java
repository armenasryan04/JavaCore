package homeworks.employee.utill;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtill {
    public static final SimpleDateFormat SDF = new SimpleDateFormat("dd/MM/yyyy");

    public static String dateToString(Date date) {
        if (date == null) {
            return null;
        }
        return SDF.format(date);
    }

    public static Date stringToDate(String dateStr) throws ParseException {
        if (dateStr == null) {
            return null;
        }
        return SDF.parse(dateStr);
    }
}
