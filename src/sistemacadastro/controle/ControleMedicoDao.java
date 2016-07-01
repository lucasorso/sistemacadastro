package sistemacadastro.controle;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
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
            String sql = "insert into medicos (nome,cpf,rg,especializacao,email,crm,rua,cidade,cep,estado) values(?,?,?,?,?,?,?,?,?,?)";
            ps = conn.prepareStatement(sql);
            ps.setString(1, medico.getNome());
            ps.setString(2, medico.getCpf());
            ps.setString(3, medico.getRG());
            ps.setString(4, medico.getEspecializacao());
            ps.setString(5, medico.getEmail());
            ps.setString(6, medico.getCRM());
            ps.setString(7, medico.getRua());
            ps.setString(8, medico.getCidade());
            ps.setString(9, medico.getCep());
            ps.setString(10, medico.getEstado());
            ps.execute();
            JOptionPane.showMessageDialog(null, "Salvo com sucesso!");
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
    
    public List<Pessoa> getAll() {
        List<Pessoa> listaPessoas = new ArrayList<Pessoa>();
        Connection conn = null;
        PreparedStatement ps = null;
        try {
            conn = Conexao.getConnection();
            String sql = "select * from medicos";
            ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                int codigo = rs.getInt(1);
                String nome = rs.getString(2);
                String cpf = rs.getString(3);
                String rg = rs.getString(4);
                String sexo = rs.getString(5);
                Pessoa p = new Pessoa();
                p.setCodigo(codigo);
                p.setNome(nome);
                p.setCpf(cpf);
                p.setRg(rg);
                p.setSexo(sexo);
                listaPessoas.add(p);
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
        return listaPessoas;
    }
    
    public Medico buscaMedico(String medico_nome){
        Medico Medico= new Medico();
        Connection conn = null;
        PreparedStatement ps = null;
        try {
            conn = Conexao.getConnection();
            String sql = "select * from medicos where nome = '"+ medico_nome +"'";
            ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            if(rs.next()){
                Medico.setId(rs.getInt(1));
                Medico.setNome(rs.getString(2));
                Medico.setCpf(rs.getString(3));
                Medico.setRG(rs.getString(4));
                Medico.setEmail(rs.getString(5));
                Medico.setEspecializacao(rs.getString(6));
                Medico.setCRM(rs.getString(7));
                Medico.setRua(rs.getString(8));
                Medico.setCidade(rs.getString(9));
                Medico.setCep(rs.getString(10));
                Medico.setEstado(rs.getString(11));
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
        return Medico;
    }
    
    public void delete(Medico Med) {
        Connection conn = null;
        PreparedStatement ps = null;
        try {
            conn = Conexao.getConnection();
            String sql = "delete from medicos where id = ?";
            ps = conn.prepareStatement(sql);
            ps.setInt(1, Med.getId());
            ps.execute();
            JOptionPane.showMessageDialog(null, "Excluido com sucesso");
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
