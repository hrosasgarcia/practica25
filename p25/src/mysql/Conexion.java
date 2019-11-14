package mysql;

import java.sql.*;

public class Conexion {

    private Connection cnx = null;
   // private final String servidor = "190.1.1.99:3306";

    private String url;

    public Connection obtener(String Usuario, String Contraseña, String Bdd) throws SQLException, ClassNotFoundException {
        //this.url = "jdbc:mysql://" + servidor + "/" + Bdd + "";
        this.url = "jdbc:mysql://190.1.1.99:3306/" + Bdd + "";
        if (cnx == null) {

            try {
                Class.forName("com.mysql.jdbc.Driver");
                cnx = DriverManager.getConnection(url, Usuario, Contraseña);
            } catch (ClassNotFoundException ex) {
                System.out.println(ex.toString());
            }
        }
        return cnx;
    }

    public void cerrar() throws SQLException {
        if (cnx != null) {
            cnx.close();
        }
    }

}
