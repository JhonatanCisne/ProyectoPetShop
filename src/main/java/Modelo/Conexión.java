package Modelo;

import java.sql.Connection;

public class Conexión {
    public static void main(String[] args) {
        Connection connection = crud.getConexion();
        if (connection != null) {
            System.out.println("Conectado");
        } else {
            System.out.println("No se pudo establecer la conexión.");
        }
    }
}
