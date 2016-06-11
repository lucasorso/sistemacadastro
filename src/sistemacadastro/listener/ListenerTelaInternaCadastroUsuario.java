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
import sistemacadastro.arquivos.GravarUsuario;
import sistemacadastro.arquivos.Usuario;
import sistemacadastro.filestream.WriteToFile;
import sistemacadastro.visao.TelaInternaCadastoUsuario;

/**
 *
 * @author comp1
 */
public class ListenerTelaInternaCadastroUsuario implements ActionListener{
    
    TelaInternaCadastoUsuario cadUser;
    Usuario usuario = new Usuario();

    public ListenerTelaInternaCadastroUsuario(TelaInternaCadastoUsuario aThis) {
       this.cadUser = aThis;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if ("Salvar".equals(e.getActionCommand())){
            
            usuario = cadUser.setInfoUsuario();
            GravarUsuario arq = new GravarUsuario();
            try {
                WriteToFile.escrever("Cadastrou Usuario ","Logs.txt");
            } catch (IOException ex) {
                Logger.getLogger(ListenerTelaInternaCadastroUsuario.class.getName()).log(Level.SEVERE, null, ex);
            }
            arq.gravarArquivo("Usuarios.txt", usuario);
        }
    }
}
