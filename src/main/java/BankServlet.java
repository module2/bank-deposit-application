import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class BankServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Double chovay =  Double.parseDouble(request.getParameter("chovay"));
        Double tilai =  Double.parseDouble(request.getParameter("tilai"));
        Double sothang =  Double.parseDouble(request.getParameter("sothang"));
        Double result = chovay;
        for (int i = 0; i < sothang; i++) {
            result = result + result * tilai * 0.01;
        }
        PrintWriter writer = response.getWriter();
        writer.println("<html>");
        writer.println("<h1>Result: </h1>"+result);
        writer.println("<html/>");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
