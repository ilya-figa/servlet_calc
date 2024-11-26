package com.example.servlet_calc.servlet;

import java.io.*;

import com.example.servlet_calc.util.Calculator;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet("/calculator")
public class CalculatorServlet extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String example = request.getParameter("example");

        System.out.println("example" + example);

        PrintWriter printWriter = response.getWriter();
        printWriter.println("Return = " + Calculator.calculation(example));
    }
}