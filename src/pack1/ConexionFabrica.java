package pack1;

import ConexionesFac.ConexionVacia;
import conexionesFac.PostgreSQL;
import pack2.IConexion;
import conexionesFac.ConexionMySQL;
import conexionesFac.ConexionOracle;
import conexionesFac.ConexionSQLServer;


        
public class ConexionFabrica {
    public IConexion getConexion (String motor) {
        if (motor == null) {
            return new ConexionVacia();
        }
        if (motor.equalsIgnoreCase("MYSQL")){
            return new ConexionMySQL();
            
        } else if (motor.equalsIgnoreCase("ORACLE")){
            return new ConexionOracle();
            
        } else if (motor.equalsIgnoreCase("POSTGRE")){
            return new PostgreSQL();   
            
        } else if (motor.equalsIgnoreCase("SQLServer")){
            return new ConexionSQLServer();
        }
        return new ConexionVacia();
    }
}
