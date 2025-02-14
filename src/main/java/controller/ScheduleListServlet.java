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
import java.util.List;

@WebServlet("/")
public class ScheduleListServlet extends HttpServlet {
    private ServiceReturner serviceReturner;

    @Override
    public void init(ServletConfig config) throws ServletException {
        super.init(config);
        serviceReturner = (ServiceReturner) config.getServletContext().getAttribute("database");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Schedule> list = serviceReturner.getScheduleService().getAllSchedule();
        req.setAttribute("list", list);
        req.getRequestDispatcher("/WEB-INF/jsp/list.jsp").forward(req, resp);
    }
}