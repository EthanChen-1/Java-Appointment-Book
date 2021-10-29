
public class Main {
    public static void main(String[] args){
        AppointmentBook ab = AppointmentBook.getInstance();
        Appointment a = new Appointment("Doctor Appointment", "Darcula", 2021,10,29);
        ab.addAppointment(a);
        ab.showAppointment();
    }
}
