package work;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "Entering")
public class Entering extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String email = request.getParameter("email");
        String pass = request.getParameter("pass");

        if (email.isEmpty() || pass.isEmpty()) {
            request.setAttribute("message", "Please full form");
        } else {
            if (pass.equals("akon4") && email.equals("admin@bk.ru")) {
                response.sendRedirect("/welcome.jsp");
            } else {
                response.sendRedirect("/kick.jsp");
            }
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

}
