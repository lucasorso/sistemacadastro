package sistemacadastro.controle;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import sistemacadastro.arquivos.Medico;
import sistemacadastro.arquivos.Pessoa;

/**
 *
 * @author Drull
 */
public class ControleMedicoDao {
    public void insert(Medico medico) {
        Connection conn = null;
        PreparedStatement ps = null;
        try {
            conn = Conexao.getConnection();
            String sql = "insert into pessoas (nome,cpf,rg,sexo,rua,cidade,cep,estado) values(?,?,?,?,?,?,?,?)";
            ps = conn.prepareStatement(sql);
            ps.setString(1, pessoa.getNome());
            ps.setString(2, pessoa.getCpf());
            ps.setString(3, pessoa.getRg());
            ps.setString(4, pessoa.getSexo());
            ps.setString(5, pessoa.getRua());
            ps.setString(6, pessoa.getCidade());
            ps.setString(7, pessoa.getCep());
            ps.setString(8, pessoa.getEstado());
            ps.execute();

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
