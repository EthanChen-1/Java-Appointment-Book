import javax.swing.*;
import java.awt.*;
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
                } else {
                    try {
                        AppointmentInformation newAppointment = new AppointmentInformation(new Patient(patientName, patientID), appointmentDate, appointmentTime);
                        Boolean isThere = false;
                        if(!AppointmentBookList.isEmpty()){
                            for(int i = 0; i < AppointmentBookList.size(); i++){
                                if(newAppointment.getDate().equals(AppointmentBookList.get(i).getDate())){
                                    JOptionPane.showMessageDialog(mainPanel, newAppointment.getDate() + " is already in booked");
                                    isThere = true;
                                    break;
                                }
                            }
                        }
                        if(!isThere){
                            AppointmentBookList.add(newAppointment);
                            taConfirmCreationArea.append("A new appointment was created for " + newAppointment.getPatient().getPatientName() + " on " +  newAppointment.getDate() + "\n");
                            jbClearButton.doClick(1);
                        }
                    } catch (ParseException ex) {
                        System.out.println(ex.getMessage());
                    }
                }
            }
        });

        jbClearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tfPatientID.setText(null);
                tfPatientName.setText(null);
                tfAppointmentDate.setText(null);
                tfAppointmentTime.setText(null);
                rbAddReminder.setSelected(false);
                rbSendForms.setSelected(false);
            }
        });

        jbViewScheduledAppointment.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(mainPanel,AppointmentBookList.toString());
            }
        });
    }


}
