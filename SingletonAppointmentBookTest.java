import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SingletonAppointmentBookTest {

    @Test
    void getAppointmentBook() {
        SingletonAppointmentBook testBook = SingletonAppointmentBook.getAppointmentBook();
        assertTrue(testBook == SingletonAppointmentBook.getAppointmentBook());
    }

    @Test
    void getAppointmentBookList() {
        List<AppointmentInformation> haha = SingletonAppointmentBook.getAppointmentBookList();
        assertTrue(haha == SingletonAppointmentBook.getAppointmentBookList());
    }
}