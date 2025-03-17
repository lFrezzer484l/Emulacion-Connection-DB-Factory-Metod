package conexionesFac;

import pack2.IConexion;

public class ConexionSQLServer implements IConexion {
    private String host;
    private String puerto;
    private String user;
    private String pass;
    
    public ConexionSQLServer(){
        this.host = "localhost";
        this.puerto = "1521";
        this.user = "root";
        this.pass = "123";
    }
    @Override
   public void conectar(){
       System.out.println("Se conecto a SQLServer");
   }
    @Override
   public void desconectar(){
       System.out.println("Se desconecto de SQLServer");
   }
    @Override
   public String toString(){
       return "conexionOracle (host=" + host + ", puerto =" + puerto + ", usuario =" + user +",contraseña =" + pass + ")";
   }
}