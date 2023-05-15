package com.example.servlet_tu_dien;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

@WebServlet(name = "Servlet_tu_dien", value = "/translate")
public class Servlet_tu_dien extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Map<String,String> dictionary = new HashMap<>();
        dictionary.put("hello","Xin-Chào");
        dictionary.put("how","Thế Nào");
        dictionary.put("book","Sách");
        dictionary.put("computer","Máy Tính");

        String search = request.getParameter("txtSearch");
        PrintWriter writer = response.getWriter();

        writer.println("<html>");
        writer.println("<head> <meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\"/> </head>");
        String result = dictionary.get(search);
        if (result != null){
            writer.println("Word  : " + search);
            writer.println("Search : " + result);
        }else {
            writer.println("Not Found");
        }

        writer.println("</html>");
    }
}
