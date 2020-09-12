package work;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "Entering")
public class Entering extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter writer=response.getWriter();

        String email =request.getParameter("email");
        String pass=request.getParameter("pass");

        if (email.isEmpty() || pass.isEmpty()){
            writer.print("Please full form");
        }
        else {
            if(pass.equals("akon4") && email.equals("admin@bk.ru")){

            }
            else {
                writer.print("Your email or password not correct");
            }
        }
    }
    private  void redirect(String http){

    }
}
