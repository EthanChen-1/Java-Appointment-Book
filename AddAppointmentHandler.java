import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class AddAppointmentHandler implements ActionListener {
    AppointmentBookGUI AppointmentGUI;

    public AddAppointmentHandler(AppointmentBookGUI gui){
        AppointmentGUI = gui;
    }
    @Override
    public void actionPerformed(ActionEvent event) {
        String menuName = event.getActionCommand();
        if(menuName.equals("Add Appointments")){
            System.out.println("Add Appointment Clicked");
            String inputDate = JOptionPane.showInputDialog(AppointmentGUI, "Enter the date of the appointment", LocalDate.now().format(DateTimeFormatter.ofPattern("MM-dd-yyyy")));
            String inputTime = JOptionPane.showInputDialog(AppointmentGUI, "Enter the time of the appointment", LocalTime.now().format(DateTimeFormatter.ofPattern("hh:mm:ss")));;

            try {
                AppointmentInformation ai = new AppointmentInformation(inputDate, inputTime);
                JCheckBox appointmentMarker = new JCheckBox(ai.toString());
                AppointmentGUI.placeAppointmentArea.append(ai.toString() + "\n");
                AppointmentGUI.markAppointmentArea.add(appointmentMarker);
            } catch (ParseException e) {
                e.printStackTrace();
            }

        }
    }
}
