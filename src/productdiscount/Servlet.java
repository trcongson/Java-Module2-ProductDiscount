package productdiscount;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "Servlet", urlPatterns = "/calculator")
public class Servlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
String description = request.getParameter("description");
Double price = Double.parseDouble(request.getParameter("price"));
Double discount = Double.parseDouble(request.getParameter("discount"));
Double calculator = price * discount / 100;
        PrintWriter writer = response.getWriter();
        writer.println("<htlm>");
        writer.println("Description: " + description);
        writer.println("<br>Price: " + price);
        writer.println("<br>Discount: " + discount + "%");
        writer.println("<br>Calculator " + calculator);
        writer.println("</html>");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
