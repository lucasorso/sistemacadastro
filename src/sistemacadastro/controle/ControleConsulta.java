package sistemacadastro.controle;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javafx.scene.shape.CullFace;
import javax.swing.JOptionPane;
import sistemacadastro.arquivos.Consulta;
import sistemacadastro.arquivos.Pessoa;

/**
 *
 * @author cri- UA
 */
public class ControleConsulta {
     public Pessoa buscaPessoa(String pessoa_nome){
        Pessoa pessoa= new Pessoa();
        Connection conn = null;
        PreparedStatement ps = null;
        try {
            conn = Conexao.getConnection();
            String sql = "select * from pessoas where nome = '"+ pessoa_nome +"'";
            ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            if (rs.next()){
                pessoa.setId(rs.getInt(1));
                pessoa.setNome(rs.getString(2));
                pessoa.setCpf(rs.getString(3));
                pessoa.setRg(rs.getString(4));
                pessoa.setSexo(rs.getString(5));
                pessoa.setRua(rs.getString(6));
                pessoa.setCidade(rs.getString(7));
                pessoa.setCep(rs.getString(8));
                pessoa.setEstado(rs.getString(9));
            }
            
        } catch (SQLException e) {
            System.out.println("ERRO: " + e.getMessage());
        } finally {
            if (ps != null) {
                try {
                    ps.close();
                } catch (SQLException ex) {
                    System.out.println("ERRO: " + ex.getMessage());
                }
            }
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException ex) {
                    System.out.println("ERRO: " + ex.getMessage());
                }
            }
        }
        return pessoa;
    }
    public void insert(Consulta cons) {
        Connection conn = null;
        PreparedStatement ps = null;
        try {
            conn = Conexao.getConnection();
            String sql = "insert into consulta(nome,problema,temperatura,pressao,peso,altura) values(?,?,?,?,?,?)";
            ps = conn.prepareStatement(sql);
            ps.setString(1, cons.getNome_paciente());
            ps.setString(2, cons.getProblema());
            ps.setString(3, cons.getTemp());
            ps.setString(4, cons.getPressao());
            ps.setString(5, cons.getPeso());
            ps.setString(6, cons.getAltura());
            ps.execute();
            JOptionPane.showMessageDialog(null, "Salvo com sucesso");
            conn.commit();
        } catch (SQLException e) {
            System.out.println("ERRO: " + e.getMessage());

            if (conn != null) {
                try {
                    conn.rollback();
                } catch (SQLException ex) {
                    System.out.println("ERRO: " + ex.getMessage());
                }
            }

        } finally {
            if (ps != null) {
                try {
                    ps.close();
                } catch (SQLException ex) {
                    System.out.println("ERRO: " + ex.getMessage());
                }
            }
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException ex) {
                    System.out.println("ERRO: " + ex.getMessage());
                }
            }
        }
    }
}
