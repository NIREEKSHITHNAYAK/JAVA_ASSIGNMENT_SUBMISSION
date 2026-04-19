/* 7a. Build a Session Management using JSP program set with one minute session
 *  expiry time to get your name through text box and press submit to display the message by greeting Hello your name!. Check the expiry of the session after one minute.*/
package seventhA;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;

@WebServlet("/session")
public class SessionServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        // Create or get session
        HttpSession session = request.getSession();

        // Set session expiry time (60 seconds)
        session.setMaxInactiveInterval(60);

        String name = request.getParameter("username");

        if (name != null) {
            session.setAttribute("user", name);
        }

        String user = (String) session.getAttribute("user");

        out.println("<html><body>");

        if (user != null) {
            out.println("<h2>Hello " + user + "!</h2>");
            out.println("<p>Session expires in 1 minute.</p>");
        } else {
            out.println("<h2>Session expired! Please enter your name again.</h2>");
        }

        out.println("</body></html>");
    }
}