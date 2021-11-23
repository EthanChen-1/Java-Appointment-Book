import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class FileMenuHandler implements ActionListener {

    AppointmentBookGUI abg;
    SingletonAppointmentBook AppointmentBook = SingletonAppointmentBook.getAppointmentBook();

    public FileMenuHandler(AppointmentBookGUI abg){
        this.abg = abg;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String menuName = e.getActionCommand();
        if(menuName.equals("Add Appointment")){
            String inputDate = JOptionPane.showInputDialog(abg, "Enter a Date MM-dd-yyyy",
                    LocalDate.now().format(DateTimeFormatter.ofPattern("MM-dd-yyyy")));
            String inputTime = JOptionPane.showInputDialog(abg, "Enter a Time hh:mm:ss",
                    LocalTime.now().format(DateTimeFormatter.ofPattern("hh:mm:ss")));

            try {
                AppointmentInformation ai = new AppointmentInformation(inputDate, inputTime);
                AppointmentBook.getAppointmentBookList().add(ai);
            } catch (ParseException ex) {
                System.out.println(ex);
            }
            if(inputDate == null || inputTime == null){
                JOptionPane.showMessageDialog(abg, "You didn't input anything");
            } else {
                abg.AppointmentArea.append("\n" + inputDate + " " +inputTime);
            }
        }
    }
}
