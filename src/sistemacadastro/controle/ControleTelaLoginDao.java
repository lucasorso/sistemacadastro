/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemacadastro.controle;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import sistemacadastro.arquivos.Pessoa;
import sistemacadastro.arquivos.Usuario;
import sistemacadastro.filestream.GravarLogs;

/**
 *
 * @author Lucas
 */
public class ControleTelaLoginDao {

    public Usuario getUsuario(Usuario usuario) throws IOException {
        Connection conn = null;
        PreparedStatement ps = null;
        try {
            conn = Conexao.getConnection();
            // Comando SQL ->  select id, nome, senha from usuario where nome like 'Lucas'
            String sql = "select id, nome, senha from usuario where nome like'"+ usuario.getNome() +"'";
            ps = conn.prepareStatement(sql);
            //ps.setString(2, usuario.getNome()); //<- nã sei o que faz ?????
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                int id = rs.getInt(1);
                String nome = rs.getString(2);
                String senha = rs.getString(3);
                Usuario userReturnedDB = new Usuario();
                userReturnedDB.setId(id);
                userReturnedDB.setNome(nome);
                userReturnedDB.setSenha(senha);
                return userReturnedDB;
            }
        } catch (SQLException e) {
            GravarLogs.escrever("Erro: " +  e.getMessage(), "Logs.txt");
            //System.out.println("ERRO: " + e.getMessage());
        } finally {
            if (ps != null) {
                try {
                    ps.close();
                } catch (SQLException ex) {
                    GravarLogs.escrever("Erro: " +  ex.getMessage(), "Logs.txt");
                    //System.out.println("ERRO: " + ex.getMessage());
                }
            }
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException ex) {
                    GravarLogs.escrever("Erro: " +  ex.getMessage(), "Logs.txt");
                    //System.out.println("ERRO: " + ex.getMessage());
                }
            }
        }
        return null;
    }
}
