import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.*;
import javax.servlet.http.*;

public class LoginServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String username = req.getParameter("username");
        String password = req.getParameter("password");

        User found = null;

        try {
            UserDAO dao = new UserDAOImpl();
            found = dao.findByUsername(username);
        } catch (Exception e) {
            e.printStackTrace();
        }

        resp.setContentType("text/plain");
        PrintWriter out = resp.getWriter();

        if (found != null && found.getPassword().equals(password)) {
            out.println("Login Successful");
        } else {
            out.println("Invalid Login");
        }
    }
}
