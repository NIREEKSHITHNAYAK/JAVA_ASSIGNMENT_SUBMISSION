/*6b. Build a servlet program to create a cookie to get your name 
 * through text box and press submit button( through HTML) to display the message by greeting Welcome back your name ! , you have visited this page n times ( n = number of your visit ) and demonstrate the expiry of cookie also.*/
package sixthB;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;

@WebServlet("/cookie")
public class CookieServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        String username = request.getParameter("username");
        int count = 1;

        Cookie[] cookies = request.getCookies();

        if (cookies != null) {
            for (Cookie c : cookies) {

                if (c.getName().equals("count")) {
                    count = Integer.parseInt(c.getValue());
                    count++;
                }

                if (c.getName().equals("user")) {
                    username = c.getValue();
                }
            }
        }

        // Create cookies
        Cookie userCookie = new Cookie("user", username);
        Cookie countCookie = new Cookie("count", String.valueOf(count));

        // Expiry time (30 seconds)
        userCookie.setMaxAge(30);
        countCookie.setMaxAge(30);

        response.addCookie(userCookie);
        response.addCookie(countCookie);

        // Output
        out.println("<html><body>");
        out.println("<h2>Welcome back " + username + "!</h2>");
        out.println("<h3>You have visited this page " + count + " times.</h3>");
        out.println("<p>Cookie expires in 30 seconds.</p>");
        out.println("</body></html>");
    }
}