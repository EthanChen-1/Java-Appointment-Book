public class Main {
    public static void main(String[] args){
        AppointmentBook ab = AppointmentBook.getInstance();
        ab.addAppointment("Chicken");
        ab.addAppointment("Duck");
        ab.addAppointment("Goose");
        ab.addAppointment("Cows");
        ab.showAppointment();
    }
}
