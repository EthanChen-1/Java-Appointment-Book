import java.util.ArrayList;
import java.util.List;

public class SingletonAppointmentBook {
    private SingletonAppointmentBook(){}

    private static SingletonAppointmentBook instance = new SingletonAppointmentBook();

    private static List<AppointmentInformation> AppointmentBookList = new ArrayList<>();

    public static SingletonAppointmentBook getAppointmentBook(){
        return instance;
    }

    public static List<AppointmentInformation> getAppointmentBookList(){
        return AppointmentBookList;
    }

}
