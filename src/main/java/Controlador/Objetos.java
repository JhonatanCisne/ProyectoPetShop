package Controlador;

public class Objetos {
    public String nombre;
    public String tipo;
    public String medida;
    public int cantidad;
    public double precio;
    
    
    public void insertarNombre(String nombre){
        this.nombre=nombre;
    }
    
    public void insertarMedida(String medida){
        this.medida=medida;
    }
    
    public void insertarCantidad(int cantidad){
        this.cantidad=cantidad;
    }
    
    public void insertarPrecio(double precio){
        this.precio=precio;
    }
    
}
