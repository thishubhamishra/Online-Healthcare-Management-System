import java.util.List;

public interface AppointmentDAO {
    boolean saveAppointment(Appointment appointment) throws Exception;
    List<Appointment> findByDoctorId(int doctorId) throws Exception;
    List<Appointment> findByPatientId(int patientId) throws Exception;
}
