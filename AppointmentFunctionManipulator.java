import java.util.ArrayList;
import java.util.List;

public class AppointmentFunctionManipulator implements AppointmentFunction {
    List appointmentBook;
    public AppointmentFunctionManipulator(){
        appointmentBook = new ArrayList();
    }

    @Override
    public void addAppointment(AppointmentInfo ai) {
        appointmentBook.add(ai);
    }

    @Override
    public void removeAppointment(AppointmentInfo ai) {
        appointmentBook.remove(ai);
    }

    @Override
    public AppointmentIterator getAppointmentIterator() {
        return new AppointmentIteratorManipulator(appointmentBook);
    }
}
