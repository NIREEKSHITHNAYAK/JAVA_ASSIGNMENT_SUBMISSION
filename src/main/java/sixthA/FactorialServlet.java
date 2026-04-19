/*6a. Build a servlet program to find the factorial of a number using HTML with step
 *  by step procedure.*/

package sixthA;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;

@WebServlet("/factorial")
public class FactorialServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        int num = Integer.parseInt(request.getParameter("num"));

        long fact = 1;
        for (int i = 1; i <= num; i++) {
            fact *= i;
        }

        out.println("<html><body>");
        out.println("<h2>Factorial of " + num + " is: " + fact + "</h2>");
        out.println("</body></html>");
    }
}