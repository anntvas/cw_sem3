package controller;

import db.ServiceReturner;
import model.Schedule;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/info")
public class InfoServlet extends HttpServlet {
    private ServiceReturner serviceReturner;

    @Override
    public void init(ServletConfig config) throws ServletException {
        super.init(config);
        serviceReturner = (ServiceReturner) config.getServletContext().getAttribute("database");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Schedule schedule = serviceReturner.getScheduleService().getSchedule(Long.parseLong(req.getParameter("id")));
        req.setAttribute("schedule", schedule);
        req.getRequestDispatcher("/WEB-INF/jsp/info.jsp").forward(req, resp);

    }
}
