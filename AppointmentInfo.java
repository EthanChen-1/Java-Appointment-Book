public class AppointmentInfo {

    private String appointmentName;
    private String appointmentDate;
    private String appointmentTime;
    public AppointmentInfo(String name, String date, String time){
        this.appointmentName = name;
        this.appointmentDate = date;
        this.appointmentTime = time;
    }

    public String getAppointmentName() {
        return appointmentName;
    }

    public String getAppointmentDate() {
        return appointmentDate;
    }

    public String getAppointmentTime() {
        return appointmentTime;
    }
}
