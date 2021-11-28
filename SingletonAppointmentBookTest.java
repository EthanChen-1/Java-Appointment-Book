import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SingletonAppointmentBookTest {
    /**
     * @author Ethan Chen
     * @group 5
     * @class CS370
     * @professor Aryeh Greenberg
     */
    @Test
    void getAppointmentBook() {
        SingletonAppointmentBook testBook = SingletonAppointmentBook.getAppointmentBook();
        assertTrue(testBook.equals(SingletonAppointmentBook.getAppointmentBook()) );
    }

    @Test
    void getAppointmentBookList() {
        List<AppointmentInformation> haha = SingletonAppointmentBook.getAppointmentBookList();
        assertTrue(haha.equals(SingletonAppointmentBook.getAppointmentBookList()));
    }
}