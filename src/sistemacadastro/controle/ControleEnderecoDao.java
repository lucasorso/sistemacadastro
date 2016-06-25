package sistemacadastro.controle;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import sistemacadastro.arquivos.Endereco;
import sistemacadastro.arquivos.Pessoa;

/**
 *
 * @author 
 */
public class ControleEnderecoDao {
    public void insert(Endereco end) {
        Connection conn = null;
        PreparedStatement ps = null;
        
        try {
            conn = Conexao.getConnection();
            String sql = "insert into endereco (rua,cidade,cep,estado) values(?,?,?,?)";
            JOptionPane.showMessageDialog(null, end.getCep());
            ps = conn.prepareStatement(sql);
            ps.setString(1, end.getRua());
            ps.setString(2, end.getCidade());
            ps.setString(3, end.getCep());
            ps.setString(4, end.getRua());
            ps.execute();
            conn.commit();
        } catch(SQLException e) {
            System.out.println("ERRO: " + e.getMessage());

            if(conn != null){
                try {
                    conn.rollback();
                } catch (SQLException ex) {
                    System.out.println("ERRO: " + ex.getMessage());
                }
            }
        } finally {
            if( ps != null) {
                try {
                    ps.close();
                } catch (SQLException ex) {
                    System.out.println("ERRO: " + ex.getMessage());
                }
            }
            if(conn != null) {
                try {
                    conn.close();
                } catch (SQLException ex) {
                    System.out.println("ERRO: " + ex.getMessage());
                }
            }
        }
    }
}
