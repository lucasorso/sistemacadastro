package sistemacadastro.controle;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import sistemacadastro.arquivos.Endereco;
import sistemacadastro.arquivos.Pessoa;
import sistemacadastro.filestream.GravarLogs;

/**
 *
 * @author
 */
public class ControlePessoaDao {

    Conexao conecta = new Conexao();

    public void insert(Pessoa pessoa) {
        Connection conn = null;
        PreparedStatement ps = null;
        try {
            conn = Conexao.getConnection();
            String sql = "insert into pessoa (nome,cpf,rg,sexo) values(?,?,?,?)";
            ps = conn.prepareStatement(sql);
            ps.setString(1, pessoa.getNome());
            ps.setString(2, pessoa.getCpf());
            ps.setString(3, pessoa.getRg());
            ps.setString(4, pessoa.getSexo());
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

    public List<Pessoa> getAll() {
        List<Pessoa> listaPessoas = new ArrayList<Pessoa>();
        Connection conn = null;
        PreparedStatement ps = null;
        try {
            conn = Conexao.getConnection();
            String sql = "select * from pessoa";
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

    public void relaciona(Pessoa pessoa, Endereco end) throws IOException {
        Connection conn = null;
        PreparedStatement ps = null;
        int idEnd = 0, idPes = 0;
        try {
            conn = Conexao.getConnection();
            String sql = "select * from pessoa where nome = '" + pessoa.getNome() + "'";
            ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                idPes = rs.getInt(1);
            }

            String sql1 = "select * from endereco where cep = '" + end.getCep() + "'";
            ps = conn.prepareStatement(sql1);
            ResultSet rs1 = ps.executeQuery();
            if (rs1.next()) {
                idEnd = rs1.getInt(1);
            }

            String sql3 = "insert into pessoa_endereco (id_pessoa,id_endereco) values(?,?)";
            ps = conn.prepareStatement(sql3);
            ps.setInt(1, idPes);
            ps.setInt(2, idEnd);
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
                    GravarLogs.escrever("Dados inseridos com sucesso no banco de dados", "logs.txt");
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

    public void delete(Pessoa pessoa) {
        Connection conn = null;
        PreparedStatement ps = null;
        try {
            conn = Conexao.getConnection();
            String sql = "delete from produtos where codigo = ?";
            ps = conn.prepareStatement(sql);
            ps.setInt(1, pessoa.getCodigo());
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

    public void update(Pessoa pessoa) {
        Connection conn = null;
        PreparedStatement ps = null;
        try {
            conn = Conexao.getConnection();
            String sql = "update pessoa set nome = ?,cpf = ?,rg = ?,sexo = ? where codigo = ?";
            ps = conn.prepareStatement(sql);
            ps.setString(1, pessoa.getNome());
            ps.setString(2, pessoa.getCpf());
            ps.setString(3, pessoa.getRg());
            ps.setString(4, pessoa.getSexo());
            ps.setInt(5, pessoa.getCodigo());
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
