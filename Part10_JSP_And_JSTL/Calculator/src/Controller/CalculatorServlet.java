package Controller;

import Model.Calculator;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "CalculatorServlet")
public class CalculatorServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        float firstOperand = Float.parseFloat(request.getParameter("firstOperand"));
        float secondOperand = Float.parseFloat(request.getParameter("secondOperand"));
        byte operator = Byte.parseByte(request.getParameter("operator"));
        PrintWriter writer = response.getWriter();
        try {
            double result = Calculator.calculator(firstOperand, secondOperand, operator);
            writer.println("<html>");
            writer.println("<body>");
            writer.println("<h1>Result = " + result + "</h1>");
            writer.println("</body>");
            writer.println("</html>");
        }catch (Exception e){
            writer.println("<html>");
            writer.println("<body>");
            writer.println("<h1>" + e + "</h1>>");
            writer.println("</body>");
            writer.println("</html>");
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
