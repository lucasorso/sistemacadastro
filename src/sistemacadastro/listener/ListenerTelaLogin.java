/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemacadastro.listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import javax.swing.JOptionPane;
import sistemacadastro.arquivos.GravarUsuario;
import sistemacadastro.arquivos.LerUsuario;
import sistemacadastro.arquivos.Usuario;
import sistemacadastro.controle.ControleTelaLoginDao;
import sistemacadastro.filestream.GravarLogs;
import sistemacadastro.visao.TelaLogin;
import sistemacadastro.visao.TelaPrincipal;

/**
 *
 * @author comp1
 */
public class ListenerTelaLogin implements ActionListener {

    TelaLogin telaLogin;
    Usuario cadUser = new Usuario();
    //WriteToFile salvaLogs = new GravarLogs();

    public ListenerTelaLogin(TelaLogin telaLogin) {
        this.telaLogin = telaLogin;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if ("Entrar".equals(e.getActionCommand())) {

            LerUsuario lietorArquivo = new LerUsuario();
            GravarUsuario gravadorUsuario = new GravarUsuario();
            GravarLogs gravaLog = new GravarLogs();

            try {

                this.cadUser = telaLogin.setInfo();
                ControleTelaLoginDao loginDao = new ControleTelaLoginDao();
                Usuario userReturnedDB = new Usuario();
                userReturnedDB = loginDao.getUsuario(cadUser);

                try {
                    if (cadUser.getNome().equals(userReturnedDB.getNome()) && cadUser.getSenha().equals(userReturnedDB.getSenha())) {
                        gravadorUsuario.gravarArquivo("Login", cadUser);
                        GravarLogs.escrever("Novo login " + (cadUser.getNome()), "Logs.txt");
                        TelaPrincipal mainTela = new TelaPrincipal();
                        mainTela.setVisible(true);
                        telaLogin.setVisible(false);

                    } else {
                        JOptionPane.showMessageDialog(telaLogin, "Usuário ou senha incorretos", "Erro !", JOptionPane.ERROR_MESSAGE);
                    }
                } catch (NullPointerException exception) {
                    try {
                        String erro = "Falha ao entrar no sistema !";
                        GravarLogs.escrever(erro, "Logs.txt");
                        JOptionPane.showMessageDialog(telaLogin, "É preciso informar um usuário e senha", "Erro !", JOptionPane.ERROR_MESSAGE);
                        exception.getMessage();
                        
                    } catch (IOException exception1) {
                        String erro = "Erro ao abrir o Arquivo.txt";
                        GravarLogs.escrever(erro, "Logs.txt");
                        exception1.getMessage();
                        
                    }
                } catch (IOException ex) {
                    ex.printStackTrace();
                    GravarLogs.escrever("Erro ao salvar arquivo", "Log.txt");
                }
            } catch (IOException ex) {
                ex.printStackTrace();
            } 
        }
    }
}
