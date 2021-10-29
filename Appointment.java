import java.util.Calendar;

public class Appointment {
    String name;
    String description;
    int year;
    int month;
    int day;
    public Appointment(String name, String descript, int year, int month, int day){
        this.name = name;
        this.description = descript;
        this.year = year;
        this.month = month;
        this.day = day;
    }

    @Override
    public String toString() {
        return "{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", year=" + year +
                ", month=" + month +
                ", day=" + day +
                '}';
    }
}
