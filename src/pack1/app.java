package pack1;

import pack2.IConexion;

public class app {
    public static void main(String[] args) {
        ConexionFabrica fabrica = new ConexionFabrica();
        
        IConexion cx1 = fabrica.getConexion("ORACLE");
        cx1.conectar();
        cx1.desconectar();
        
        IConexion cx2 = fabrica.getConexion("MYSQL");
        cx2.conectar();
        cx2.desconectar();
        
        IConexion cx3 = fabrica.getConexion( "POSTGRE");
        cx3.conectar();
        cx3.desconectar();
           
        IConexion cx4 = fabrica.getConexion( "SQLServer");
        cx4.conectar();
        cx4.desconectar();
        
        
        IConexion cx5 = fabrica.getConexion("H2");
        cx5.conectar();
        cx5.desconectar();
        
        
    }
}
