import java.util.ArrayList;

public class AppointmentBook {
    private AppointmentBook(){}

    private static AppointmentBook ab = new AppointmentBook();

    private static ArrayList<String> listOfAppointment = new ArrayList<>();

    public static void addAppointment(String Appointment){
        listOfAppointment.add(Appointment);
    }

    public static void showAppointment(){
        System.out.println(listOfAppointment.size() + " appointments scheduled");
        System.out.println(String.join(",", listOfAppointment));
    }

    public static AppointmentBook getInstance(){
        return ab;
    }
}
