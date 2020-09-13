package work;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "Calc")
public class Calc extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        Double num1 = Double.parseDouble(request.getParameter("first"));
        Double num2 = Double.parseDouble(request.getParameter("second"));

        if (num1 != null && num2 != null) {
            Double ans = num1 + num2;
            request.setAttribute("ans",ans);
        }else {
            request.setAttribute("error","Please full form");
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
