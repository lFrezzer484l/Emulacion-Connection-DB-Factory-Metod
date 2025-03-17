package ConexionesFac;

import pack2.IConexion;

public class ConexionVacia implements IConexion {

    @Override
    public void conectar() {
        System.out.println("Conexion Vacia : no se puede conectar");
    }

    @Override
    public void desconectar() {
        System.out.println("Conexion vacia : no se puede desconectar");
    }
    @Override
    public String toString()    {
        return ("Conexion Vacia : no se establecio conexion");
    }
}