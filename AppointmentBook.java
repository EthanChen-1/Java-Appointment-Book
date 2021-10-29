import java.util.ArrayList;

public class AppointmentBook {
    private AppointmentBook(){}

    private static AppointmentBook ab = new AppointmentBook();

    private static ArrayList<Appointment> listOfAppointment = new ArrayList<>();

    public static void addAppointment(Appointment a){
        listOfAppointment.add(a);
    }

    public static void showAppointment(){
        System.out.println(listOfAppointment.size() + " appointments scheduled");
        System.out.println(listOfAppointment.toString());
    }

    public static AppointmentBook getInstance(){
        return ab;
    }
}
