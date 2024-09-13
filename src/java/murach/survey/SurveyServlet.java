package murach.survey;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import java.io.*;

public class SurveyServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // Default URL
        String url = "/index.html";

        // Get parameters from the form
        String firstName = req.getParameter("firstName");
        String lastName = req.getParameter("lastName");
        String email = req.getParameter("email");
        String dob = req.getParameter("dob");
        String howHeard = req.getParameter("howHeard");
        String contactMethod = req.getParameter("contact-method");

        // Validate inputs (you can add more complex validation as needed)
        if (firstName != null && lastName != null && email != null && dob != null && howHeard != null && contactMethod != null) {
            // Create SurveyData object
            SurveyData surveyData = new SurveyData(firstName, lastName, email, dob, howHeard, contactMethod);

            // Set SurveyData object in the request
            req.setAttribute("surveyData", surveyData);

            // Set URL to forward to the thanks.jsp
            url = "/thanks.jsp";
        }

        // Forward to the appropriate page (thanks.jsp or index.html)
        getServletContext().getRequestDispatcher(url).forward(req, resp);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req, resp);
    }
}
