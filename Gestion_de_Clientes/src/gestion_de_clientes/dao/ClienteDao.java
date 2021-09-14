/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestion_de_clientes.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author CamiDamiAmelie
 */
public class ClienteDao {
    public void conectar (){
        
        
        String usuario = "root";
        String pass = "";
        String driver = "com.mysql.cj.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/java";
        
        Connection conexion=null;
        
        try {
            Class.forName(driver);
            conexion = DriverManager.getConnection(url, usuario, pass);
        } catch (Exception ex) {
            Logger.getLogger(ClienteDao.class.getName()).log(Level.SEVERE, null, ex);
        }
      
    }
}
