package com.example.cw_sem3.controller;


import com.example.cw_sem3.service.ScheduleService;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

public class ScheduleController extends HttpServlet {
    private final ScheduleService service = new ScheduleService();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("schedules", service.getAllSchedules());
        RequestDispatcher dispatcher = req.getRequestDispatcher("/WEB-INF/views/index.jsp");
        dispatcher.forward(req, resp);
    }
}
