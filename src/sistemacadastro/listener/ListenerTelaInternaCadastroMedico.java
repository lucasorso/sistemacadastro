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
import javax.swing.JButton;
import javax.swing.JOptionPane;
import sistemacadastro.arquivos.Arquivo;
import sistemacadastro.arquivos.Endereco;
import sistemacadastro.arquivos.Pessoa;
import sistemacadastro.filestream.GravarLogs;
import sistemacadastro.visao.TelaInternaCadastroMedico;
import sistemacadastro.visao.TelaInternaProcurar;
import sistemacadastro.visao.TelaPrincipal;

/**
 *
 * @author Gregori Oliveira, Lucas Orso, Yuri Abel
 */
public class ListenerTelaInternaCadastroMedico implements ActionListener{
    
    private TelaInternaCadastroMedico cadM;
    private Endereco endereco = new Endereco();

    public ListenerTelaInternaCadastroMedico(TelaInternaCadastroMedico aThis) {
        this.cadM = aThis;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if ("Salvar".equals(e.getActionCommand())) {
            try {
                GravarLogs.escrever("Cadastrou Medico ", "Logs.txt");
            } catch (IOException ex) {
                Logger.getLogger(ListenerTelaInternaCadastroUsuario.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        if ("Editar".equals(e.getActionCommand())) {
            try {
                GravarLogs.escrever("Editou Medico ","Logs.txt");
            } catch (IOException ex) {
                Logger.getLogger(ListenerTelaInternaCadastroUsuario.class.getName()).log(Level.SEVERE, null, ex);
            }
            cadM.dispose();
        }
        if ("Excluir".equals(e.getActionCommand())) {
            try {
                GravarLogs.escrever("Excluiu Medico ","Logs.txt");
            } catch (IOException ex) {
                Logger.getLogger(ListenerTelaInternaCadastroUsuario.class.getName()).log(Level.SEVERE, null, ex);
            }
            cadM.dispose();
        }
        if ("Buscar".equals(e.getActionCommand())) {
            try {
                GravarLogs.escrever("Buscou Medico ", "Logs.txt");
            } catch (IOException ex) {
                Logger.getLogger(ListenerTelaInternaCadastroUsuario.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
