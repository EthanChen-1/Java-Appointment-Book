import javax.swing.*;
import java.awt.*;

public class AppointmentBookGUI extends JFrame {
    JTextArea AppointmentArea = new JTextArea("Appointments Here");
    public AppointmentBookGUI(String title, int height, int width){
        setTitle(title);
        setSize(height, width);
        setLocation(700,300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        AppointmentArea.setEditable(false);
        Container content = getContentPane();
        content.setLayout(new GridLayout(1,1));
        content.add(AppointmentArea);

        JMenuBar menuBar = new JMenuBar(); // Creates the Menu Bar
        FileMenuHandler fmh = new FileMenuHandler(this); // File Menu Handler
        JMenu FileMenu = new JMenu("File"); // Creates a Menu

        JMenuItem addAppointment = new JMenuItem("Add Appointment"); // Item in Menu
        addAppointment.addActionListener(fmh);
        FileMenu.add(addAppointment);

        menuBar.add(FileMenu);
        setJMenuBar(menuBar);
        setVisible(true);
    }
}
