package Controlador;

public class Usuario {
    public String usuario;
    public String contraseña;
    
    public Usuario(String usuario, String contraseña){
        this.usuario=usuario;
        this.contraseña=contraseña;
    }
    
    public String getUsuario(){
        return usuario;
    }
    
    public String getContraseña(){
        return contraseña;
    }
    
    public void mostrar(){
        System.out.println(usuario+", "+contraseña);
    }
}
