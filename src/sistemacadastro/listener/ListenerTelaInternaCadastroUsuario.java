/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemacadastro.listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import sistemacadastro.arquivos.Arquivo;
import sistemacadastro.arquivos.Usuario;
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
            Arquivo arq = new Arquivo();
            
            arq.gravarArquivo("Usuarios.txt", usuario);
        }
    }
}
