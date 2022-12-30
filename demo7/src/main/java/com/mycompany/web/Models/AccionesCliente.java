package com.mycompany.web.Models;

import java.sql.*;
import com.mycompany.web.Models.Cliente;
import java.util.List;
import java.util.ArrayList;


public class AccionesCliente {
    public static int registrarCliente(Cliente c){
        int estado = 0;  
        
        try{
            Class.forName("com.mysql.jdbc.Driver"); //Cargar clase para identificar el driver y conectarse a la bbdd
            Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost/bsas", "root", null);

            String query = "INSERT INTO clientes (Nombre, Apellido, Contacto) values (?,?,?)";

            String nombre = c.getnombre();
            String apellido = c.getapellido();
            String contacto= c.getcontacto();

            PreparedStatement pst = conexion.prepareStatement(query);

            pst.setString(1, nombre);
            pst.setString(2, apellido);
            pst.setString(3, contacto);

            estado = pst.executeUpdate();
            
            conexion.close();


        } catch(Exception e){
            System.out.println(e);
            System.out.println("upss algo salio mal");
        }
        return estado;
    }


// Consulta por id

    public static Cliente verCliente(int idaConsultar){
        Cliente clienteadevolver = new Cliente ();  
        
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost/bsas", "root", null);

            String query = "SELECT*FROM clientes WHERE id = ?";

            PreparedStatement pst = conexion.prepareStatement(query);
           

            pst.setInt(1, idaConsultar);

            ResultSet consultaCliente = pst.executeQuery();
            
            if (consultaCliente.next()){
                clienteadevolver.setid(consultaCliente.getInt(1));
                clienteadevolver.setnombre(consultaCliente.getString(2));
                clienteadevolver.setapellido(consultaCliente.getString(3));
                clienteadevolver.setcontacto(consultaCliente.getString(4));

                conexion.close();

            }

        } catch(Exception e){
            System.out.println(e);
            System.out.println("upss algo salio mal");
        }
        return clienteadevolver;
    }

}
