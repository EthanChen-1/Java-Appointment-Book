import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class AppointmentInformation {
    Date date;
    public AppointmentInformation(String date, String time) throws ParseException {
        this.date = new SimpleDateFormat("MM-dd-yyyy HH:mm:ss").parse(date + " " + time);
    }

    @Override
    public String toString(){
        return date.toString();
    }

}
