package conexionesFac;

import pack2.IConexion;

public class ConexionMySQL implements IConexion {
    private String host;
    private String puerto;
    private String user;
    private String pass;
    
    public ConexionMySQL(){
        this.host = "localhost";
        this.puerto = "1610";
        this.user = "root";
        this.pass = "1315";
    }
   public void conectar(){
       System.out.println("Se conecto a Mysql");
   }
   public void desconectar(){
       System.out.println("Se desconecto de Mysql");
   }
   public String toString(){
       return "conexionOracle (host=" + host + ", puerto =" + puerto + ", usuario =" + user +",contraseña =" + pass + ")";
   }
}