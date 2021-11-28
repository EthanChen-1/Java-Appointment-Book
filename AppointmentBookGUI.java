import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.util.List;

public class AppointmentBookGUI extends JFrame{
    /**
     * @author Ethan Chen
     * @group 5
     * @class CS370
     * @professor Aryeh Greenberg
     */
    private JPanel mainPanel;
    private JLabel jlAppointmentDate;
    private JLabel jlAppointmentTime;
    private JButton jbOkButton;
    private JButton jbClearButton;
    private JTextField tfAppointmentDate;
    private JTextField tfAppointmentTime;
    private JRadioButton rbAddReminder;
    private JRadioButton rbSendForms;
    private JLabel jlPatientID;
    private JTextField tfPatientID;
    private JTextArea taConfirmCreationArea;
    private JButton jbViewScheduledAppointment;
    private JTextField tfPatientName;
    private JLabel jlPatientName;
    private List<AppointmentInformation> AppointmentBookList = SingletonAppointmentBook.getAppointmentBookList();

    public AppointmentBookGUI(){
        setContentPane(mainPanel);
        setTitle("Appointment Book Viewer");
        setSize(700,500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);

        jbOkButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String patientID = tfPatientID.getText();
                String patientName = tfPatientName.getText();
                String appointmentDate = tfAppointmentDate.getText();
                String appointmentTime = tfAppointmentTime.getText();
                if(patientID.equals("") || appointmentDate.equals("") || appointmentTime.equals("") || patientName.equals("")){
                    JOptionPane.showMessageDialog(mainPanel, "One or more fields are missing, please fill them in before pressing ok");
                }

            }
        });

        jbClearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tfPatientID.setText(null);
                tfAppointmentDate.setText(null);
                tfAppointmentTime.setText(null);
                rbAddReminder.setSelected(false);
                rbSendForms.setSelected(false);
            }
        });

        jbViewScheduledAppointment.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String appointment = "";
                for(AppointmentInformation ai : AppointmentBookList){
                    appointment += ai.toString() + "\n";
                }
                JOptionPane.showMessageDialog(mainPanel, appointment);
            }
        });
    }

    public static void main(String[] args){
        AppointmentBookGUI ABG = new AppointmentBookGUI();
    }
}
