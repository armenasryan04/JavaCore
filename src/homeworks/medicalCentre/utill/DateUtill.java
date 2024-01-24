package homeworks.medicalCentre.utill;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtill {
    public static final SimpleDateFormat SDF = new SimpleDateFormat("dd/MM/yyyy");
    public static final SimpleDateFormat SDFM = new SimpleDateFormat("dd/MM/yyyy HH:mm");

    public static String dateToString(Date date) {
        if (date == null) {
            return null;
        }
        return SDFM.format(date);
    }

    public static Date stringToDate(String dateStr) throws ParseException {
        if (dateStr == null) {
            return null;
        }
        return SDFM.parse(dateStr);
    }

    public static boolean isSameDay(Date registerDate, Date today) {
        return SDF.format(registerDate).equals(SDF.format(today));
    }
}

