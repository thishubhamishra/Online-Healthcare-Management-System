public interface UserDAO {
    boolean saveUser(User user) throws Exception;
    User findByUsername(String username) throws Exception;
    User findById(int id) throws Exception;
}
