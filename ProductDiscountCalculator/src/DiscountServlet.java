import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "DiscountServlet", urlPatterns = "/display-discount")
public class DiscountServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        float Price = Float.parseFloat(request.getParameter("ListPrice"));
        float DiscountPercent = Float.parseFloat(request.getParameter("DiscountPercent"));

        float DiscountAmount = (float) (Price * DiscountPercent * 0.01);
        float DiscountPrice = Price - DiscountAmount;

        PrintWriter writer = response.getWriter();
        writer.println("<html>");
        writer.println("<h1>Discount Amount : " + DiscountAmount + "</h1>");
        writer.println("<h1>Discount Price : " + DiscountPrice + "</h1>");
        writer.println("</html>");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
