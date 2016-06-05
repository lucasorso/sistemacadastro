/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemacadastro.listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import sistemacadastro.arquivos.GravarUsuario;
import sistemacadastro.arquivos.LerUsuario;
import sistemacadastro.arquivos.Usuario;
import sistemacadastro.exceptions.ExceptionGravarArquivo;
import sistemacadastro.filestream.WriteToFile;
import sistemacadastro.visao.TelaLogin;
import sistemacadastro.visao.TelaPrincipal;

/**
 *
 * @author comp1
 */
public class ListenerTelaLogin implements ActionListener {

    TelaLogin telaLogin;
    Usuario cadUser = new Usuario();
    //WriteToFile salvaLogs = new WriteToFile();

    public ListenerTelaLogin(TelaLogin telaLogin) {
        this.telaLogin = telaLogin;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if ("Entrar".equals(e.getActionCommand())) {
            
            LerUsuario leitorAquivo = new LerUsuario();
            
            if (leitorAquivo.lerArquivo("login.txt") == null) {
                JOptionPane.showMessageDialog(null, "Bem vindo ao SISTEMA", "Boas Vindas", JOptionPane.INFORMATION_MESSAGE);
                try {
                    GravarUsuario gravadorUsuario = new GravarUsuario();
                    cadUser = telaLogin.setInfo();
                    gravadorUsuario.gravarArquivo("Login", cadUser);
                    WriteToFile.escrever("Novo login " + (cadUser.getNome() + ";" + cadUser.getSenha()), "Logs.txt");
                } catch (IOException ex) {
                    Logger.getLogger(ListenerTelaLogin.class.getName()).log(Level.SEVERE, null, ex);
                } catch (ExceptionGravarArquivo ex) {
                    Logger.getLogger(ListenerTelaLogin.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else {
                try {
                    cadUser = telaLogin.setInfo();
                    WriteToFile.escrever("Último login por " + (cadUser.getNome() + ";" + cadUser.getSenha()), "Logs.txt");
                    //JOptionPane.showMessageDialog(null, "Por equanto nada", " Usuário ou senha inválidos", JOptionPane.INFORMATION_MESSAGE);
                } catch (IOException ex) {
                    Logger.getLogger(ListenerTelaLogin.class.getName()).log(Level.SEVERE, null, ex);
                } catch (ExceptionGravarArquivo ex) {
                    Logger.getLogger(ListenerTelaLogin.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            TelaPrincipal mainTela = new TelaPrincipal();
            mainTela.setVisible(true);
            telaLogin.setVisible(false);
        }
    }
}
