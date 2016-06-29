package sistemacadastro.controle;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Conexao {

    public ResultSet rs;
    public Statement stm;
    public static Connection getConnection() {
        Connection conn = null;
        try {
            Class.forName("org.hsqldb.jdbcDriver");
            conn = DriverManager.getConnection("jdbc:hsqldb:hsql://localhost/ERPSAUDE", "sa", "");
        } catch (SQLException e) {
            System.out.println("Problemas ao conectar no banco de dados");
        } catch (ClassNotFoundException e) {
            System.out.println("O driver não foi configurado corretametne");
        }

        return conn;
    }
    
//    public void executaSQL(String sql){
//        Connection conn = getConnection();
//        try {
//            stm = conn.createStatement(rs.TYPE_SCROLL_INSENSITIVE, rs.CONCUR_READ_ONLY);
//            rs = stm.executeQuery(sql);
//        } catch (SQLException ex) {
//            //JOptionPane.showMessageDialog(null, "erro ao criar ExecutaSQL" +ex);
//        }    
//    }
}
