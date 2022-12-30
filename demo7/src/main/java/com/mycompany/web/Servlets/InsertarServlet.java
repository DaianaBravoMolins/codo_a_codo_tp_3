package com.mycompany.web.Servlets; 

import java.io.IOException;


import com.mycompany.web.Models.Cliente;
import com.mycompany.web.Models.AccionesCliente;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse; 

@WebServlet("/nuevocliente")
public class  InsertarServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String n , a , c;

        n = req.getParameter("nombre");

        a = req.getParameter("apellido");

        c = req.getParameter("contacto");

        Cliente nuevoCliente = new Cliente ();

        nuevoCliente.setnombre(n);
        nuevoCliente.setapellido(a);
        nuevoCliente.setcontacto(c);

        int estado = AccionesCliente.registrarCliente(nuevoCliente); 

        if (estado ==1){
            System.out.println("Todo ok");
            resp.sendRedirect("exito.jsp");
        } else {
            System.out.println("Error");
            resp.sendRedirect("error.jsp");
        }


    }
}