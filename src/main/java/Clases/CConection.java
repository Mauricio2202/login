
package Clases;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class CConection {
    Connection conectar;
    
    String usuario = "root";
    String contrasenia = "220204";
    String bd = "login";
    String ip = "localhost";
    String puerto = "3306";
    
    String cadena = "jdbc:mysql://" + ip +":"+puerto+"/"+bd;
    
    public Connection estableceConexion() {
        try {
           Class.forName("com.mysql.jdbc.Driver");
           conectar = DriverManager.getConnection(cadena, usuario, contrasenia);
           JOptionPane.showMessageDialog(null, "Se conectó correctamente a la base de datos");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Problemas en la conexión" + e.toString());
        }
        return conectar;
    }
}
