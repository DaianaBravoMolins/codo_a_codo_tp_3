package com.mycompany.web.Models;

import java.io.Serializable;

public class Cliente implements Serializable {
        private int id;
        private String nombre;
        private String apellido;
        private String contacto;
 
        public Cliente (){
    
        }
    
        public int getid(){
            return id;
        }
    
        public void setid(int nuevoid){
            this.id = nuevoid;
        }
        public String getnombre(){
            return nombre;
        }
    
        public void setnombre(String nuevonombre){
            this.nombre = nuevonombre;
        }

        
        public String getapellido(){
            return apellido;
        }
    
        public void setapellido(String nuevoapellido){
            this.apellido = nuevoapellido;
        }
        public String getcontacto(){
            return contacto;
        }
    
        public void setcontacto(String nuevocontacto){
            this.contacto = nuevocontacto;
        }
        
    }

