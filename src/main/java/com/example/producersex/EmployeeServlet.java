package com.example.producersex;

import jakarta.inject.Inject;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(name = "EmployeeServlet", value = "/employeeServlet")
public class EmployeeServlet extends HttpServlet {
    @Inject
    private int i;
    @Inject
    private double d;
    @Inject
    @StringNumber1
    private String text;
    @Inject
    @StringNumber2
    private String text2;
    @Inject
    @EmployeeRusso
    private Employee employee_1;
    @Inject
    @EmployeeElena
    private Employee employee_2;



    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.getWriter().write( i + " " + d + " " + text + " " + employee_1 + " " + employee_2 +" " + text2);
    }
}
