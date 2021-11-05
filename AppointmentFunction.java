public interface AppointmentFunction {
    void addAppointment(AppointmentInfo ai);
    void removeAppointment(AppointmentInfo ai);
    AppointmentIterator getAppointmentIterator();
}
