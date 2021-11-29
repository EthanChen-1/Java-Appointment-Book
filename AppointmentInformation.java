import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class AppointmentInformation {
    /**
     * @author Ethan Chen
     * @group 5
     * @class CS370
     * @professor Aryeh Greenberg
     */
    Patient patient;
    Date date;
    public AppointmentInformation(Patient patient,String date, String time) throws ParseException {
        this.patient = patient;
        this.date = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss").parse(date + " " + time);
    }

    @Override
    public String toString(){
        return patient + " "  + date.toString();
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

}
