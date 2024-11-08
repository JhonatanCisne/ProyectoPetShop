package Controlador;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ListaEnlazada {
    private Nodo head;

    public ListaEnlazada() {
        head = null;
    }

    public void addInstruccion(String instruccionSQL) {
        Nodo nuevoNodo = new Nodo(instruccionSQL);

        if (head == null) {
            head = nuevoNodo;
        } else {
            Nodo current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = nuevoNodo;
        }
    }

    public void imprimirInstrucciones() {
        if (head == null) {
            System.out.println("Lista vacía");
            return;
        }

        Nodo current = head;
        while (current != null) {
            System.out.println("Instrucción SQL: " + current.instruccionSQL);
            current = current.next;
        }
    }

    public void ejecutarInstrucciones() {
        Nodo current = head;
        while (current != null) {
            ejecutarSQL(current.instruccionSQL);
            current = current.next;
        }
    }

    private void ejecutarSQL(String instruccionSQL) {
        System.out.println("Ejecutando instrucción SQL: " + instruccionSQL);
    }
    
    public void ejecutarInstrucciones(Connection con) {
    Nodo current = head;
    while (current != null) {
        try (PreparedStatement statement = con.prepareStatement(current.instruccionSQL)) {
            statement.executeUpdate();
            System.out.println("Instrucción ejecutada: " + current.instruccionSQL);
        } catch (SQLException e) {
            System.out.println("Error al ejecutar instrucción: " + current.instruccionSQL);
        }
        current = current.next;
    }
    }

    private class Nodo {
        String instruccionSQL; 
        Nodo next;

        public Nodo(String instruccionSQL) {
            this.instruccionSQL = instruccionSQL;
            this.next = null;
        }
    }
}




