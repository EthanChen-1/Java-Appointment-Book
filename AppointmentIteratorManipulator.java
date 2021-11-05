import java.util.List;

public class AppointmentIteratorManipulator implements AppointmentIterator {
    public List appointmentBook;
    int position;
    AppointmentInfo ai;
    public AppointmentIteratorManipulator(List appointmentList){
        this.appointmentBook = appointmentList;
    }

    @Override
    public AppointmentInfo nextAppointment() {
        System.out.println("An Appointment was found at Position: " + position);
        ai = (AppointmentInfo) appointmentBook.get(position);
        position++;
        return ai;
    }

    @Override
    public boolean lastAppointment() {
        if(position < appointmentBook.size()){
            return false;
        }
        return true;
    }
}
