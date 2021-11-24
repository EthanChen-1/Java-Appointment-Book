import javax.swing.*;
import java.awt.*;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;
import java.util.List;

public class AppointmentBookGUI extends JFrame {

    JTextArea placeAppointmentArea = new JTextArea();

    JTextArea markAreaTitle = new JTextArea("Mark Appointments Done Here:");

    JButton addAppointmentButton = new JButton("Add Appointments");

    JPanel markAppointmentArea = new JPanel();


    List<AppointmentInformation> AppointmentBookList = SingletonAppointmentBook.getAppointmentBookList();

    public AppointmentBookGUI(){
        setTitle("Appointment Book Viewer");
        setSize(700,500);
        setLocation(600,300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        placeAppointmentArea.setBackground(Color.CYAN);
        placeAppointmentArea.setFont(new Font("Arial", Font.PLAIN, 24));


        markAreaTitle.setBackground(Color.lightGray);
        markAreaTitle.setFont(new Font("Arial", Font.PLAIN, 14));

        markAppointmentArea.setLayout(new GridLayout(0,1));
        markAppointmentArea.add(markAreaTitle);

        AddAppointmentHandler AAH = new AddAppointmentHandler(this);
        addAppointmentButton.addActionListener(AAH);

        Container container = getContentPane();
        container.setLayout(new BorderLayout());
        container.add(addAppointmentButton, BorderLayout.NORTH);
        container.add(placeAppointmentArea, BorderLayout.CENTER);
        container.add(markAppointmentArea, BorderLayout.WEST);

        setVisible(true);
    }


}
