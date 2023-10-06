
package hotel_ideal.accesoADatos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Conexion {
    private static final String URL = "jdbc:mariadb://localhost/hotel_ideal";
    private static final String USUARIO = "root";
    private static final String PASSWORD = "";
    private static Connection connection;

    private Conexion() {}
    
    public static Connection getConexion() {
        
        connection = null;
        
        if (connection == null) {

            try {
                Class.forName("org.mariadb.jdbc.Driver");
                connection = DriverManager.getConnection(URL, USUARIO, PASSWORD);

                
            } catch (ClassNotFoundException ex) {
                JOptionPane.showMessageDialog(null, "Error al cargar el Driver"+ ex);
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Error de conexion "+ ex);
            }
            
        }

        // retorno  del get coneecion 
        return connection;
    }
}
