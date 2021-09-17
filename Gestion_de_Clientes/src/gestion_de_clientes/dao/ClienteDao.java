/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestion_de_clientes.dao;

import gestion_de_clientes.models.Cliente;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author CamiDamiAmelie
 */
public class ClienteDao {
    public void agregar (Cliente cliente){
        
        
        String usuario = "root";
        String pass = "";
        String driver = "com.mysql.cj.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/java";
        
        Connection conexion=null;
        
        try {
            Class.forName(driver);
            conexion = DriverManager.getConnection(url, usuario, pass);
            
            String sql= "INSERT INTO `clientes` (`id`, `nombre`, `apellido`, `email`, `telefono`) VALUES (NULL, '"+cliente.getNombre()+"', '"+cliente.getApellido()+"', '"+cliente.getEmail()+"', '"+cliente.getTelefono()+"');";
            Statement statement = conexion.createStatement();
            statement.execute(sql);
        
        } catch (Exception ex) {
            Logger.getLogger(ClienteDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
    
      public List <Cliente> listar (){
        
        
        String usuario = "root";
        String pass = "";
        String driver = "com.mysql.cj.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/java";
        
        Connection conexion=null;
        
        List<Cliente> listado = new ArrayList<>();
        
        try {
            Class.forName(driver);
            conexion = DriverManager.getConnection(url, usuario, pass);
            
            String sql= "SELECT * FROM `clientes`;";
            
             
            Statement statement = conexion.createStatement();
            ResultSet resultado = statement.executeQuery(sql);
            
            while(resultado.next()){
                Cliente cliente = new Cliente();
                cliente.setNombre(resultado.getString("nombre"));
                cliente.setApellido(resultado.getString("apellido"));
                cliente.setEmail(resultado.getString("email"));
                cliente.setTelefono(resultado.getString("telefono"));
                cliente.setId(resultado.getString("id"));
                
                listado.add(cliente);
            }
        
        } catch (Exception ex) {
            Logger.getLogger(ClienteDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return listado;
    }
}
