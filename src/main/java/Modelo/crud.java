package Modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class crud {
    public static Connection getConexion(){
String ConexionUrI = "jdbc:sqlserver://localhost:1433;databaseName=PetShop;user=AdministradorInventario;password=941036617xd;loginTimeout=30;TrustServerCertificate=True;";
       try{
    Connection con =DriverManager. getConnection (ConexionUrI) ;
           System.out.println("SQL Conectado");
    return con;
    } catch (SQLException ex) {
    System. out.println (ex.toString ( ) ) ;
    return null;
    }
}
}


