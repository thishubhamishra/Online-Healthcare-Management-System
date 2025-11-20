import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class AppointmentDAOImpl implements AppointmentDAO {

    @Override
    public boolean saveAppointment(Appointment appointment) throws Exception {
        String sql = "INSERT INTO appointments (patient_id, doctor_id, appointment_datetime, reason, status) VALUES (?, ?, ?, ?, ?)";

        Connection conn = DBUtil.getConnection();
        PreparedStatement ps = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

        ps.setInt(1, appointment.getPatientId());
        ps.setInt(2, appointment.getDoctorId());
        ps.setTimestamp(3, Timestamp.valueOf(appointment.getAppointmentDateTime()));
        ps.setString(4, appointment.getReason());
        ps.setString(5, appointment.getStatus());

        int rows = ps.executeUpdate();
        if (rows == 0) return false;

        ResultSet rs = ps.getGeneratedKeys();
        if (rs.next()) appointment.setId(rs.getInt(1));

        return true;
    }

    private Appointment map(ResultSet rs) throws Exception {
        Appointment a = new Appointment();
        a.setId(rs.getInt("id"));
        a.setPatientId(rs.getInt("patient_id"));
        a.setDoctorId(rs.getInt("doctor_id"));
        a.setAppointmentDateTime(rs.getTimestamp("appointment_datetime").toLocalDateTime());
        a.setReason(rs.getString("reason"));
        a.setStatus(rs.getString("status"));
        return a;
    }

    @Override
    public List<Appointment> findByDoctorId(int doctorId) throws Exception {
        String sql = "SELECT * FROM appointments WHERE doctor_id = ?";
        Connection conn = DBUtil.getConnection();
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setInt(1, doctorId);

        ResultSet rs = ps.executeQuery();
        List<Appointment> list = new ArrayList<>();

        while (rs.next()) list.add(map(rs));
        return list;
    }

    @Override
    public List<Appointment> findByPatientId(int patientId) throws Exception {
        String sql = "SELECT * FROM appointments WHERE patient_id = ?";
        Connection conn = DBUtil.getConnection();
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setInt(1, patientId);

        ResultSet rs = ps.executeQuery();
        List<Appointment> list = new ArrayList<>();

        while (rs.next()) list.add(map(rs));
        return list;
    }
}
