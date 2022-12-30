package com.mycompany.web.Servlets;

import java.io.IOException;

import com.mycompany.web.Models.AccionesCliente;
import com.mycompany.web.Models.Cliente;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/verCliente")

public class VerServlet extends HttpServlet{
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    int i = Integer.parseInt(req.getParameter("id"));
    
    Cliente registro = AccionesCliente.verCliente(i);
    
    req.setAttribute("c", registro);

    RequestDispatcher respuesta = req.getRequestDispatcher("/infoCliente.jsp");

    respuesta.forward(req, resp);

    }
}
