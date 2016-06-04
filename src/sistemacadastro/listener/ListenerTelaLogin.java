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
import sistemacadastro.arquivos.Arquivo;
import sistemacadastro.arquivos.Usuario;
import sistemacadastro.filestream.WriteToFile;
import sistemacadastro.visao.TelaLogin;

/**
 *
 * @author comp1
 */
public class ListenerTelaLogin implements ActionListener {

    TelaLogin telaLogin;
    Usuario cadUser = new Usuario();
    WriteToFile salvaLogs = new WriteToFile();
    
    public ListenerTelaLogin(TelaLogin telaLogin) {
        this.telaLogin = telaLogin;
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if("Entrar".equals(e.getActionCommand())){
            try {
                 Arquivo arq = new Arquivo();
            cadUser = telaLogin.setInfo();
            arq.gravarArquivo("Usuarios.txt", cadUser);
                //Arquivo arq = new Arquivo();
                //arq.lerArquivo("Login.txt");
                //arq.lerArquivo("Login.txt").equals();(cadUser.getNome() + ";" + cadUser.getSenha())
                
                salvaLogs.escrever((cadUser.getNome() + ";" + cadUser.getSenha()), "Logs.txt");
            } catch (IOException ex) {
                Logger.getLogger(ListenerTelaLogin.class.getName()).log(Level.SEVERE, null, ex);
            }
             
        }
    }
}
