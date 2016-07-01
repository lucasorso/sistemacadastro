/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemacadastro.listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import sistemacadastro.arquivos.Medico;
import sistemacadastro.arquivos.Pessoa;
import sistemacadastro.controle.ControleMedicoDao;
import sistemacadastro.filestream.GravarLogs;
import sistemacadastro.visao.TelaInternaCadastroMedico;

/**
 *
 * @author Gregori Oliveira, Lucas Orso, Yuri Abel
 */
public class ListenerTelaInternaCadastroMedico implements ActionListener{
    
    private TelaInternaCadastroMedico cadM;
    private Medico med = new Medico();
    private ControleMedicoDao control = new ControleMedicoDao();
    
    public ListenerTelaInternaCadastroMedico(TelaInternaCadastroMedico aThis) {
        this.cadM = aThis;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if ("Salvar".equals(e.getActionCommand())) {
            med = cadM.setInfoMedico();
            control.insert(med);
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
            med = cadM.setID();
            control.delete(med);
            try {
                GravarLogs.escrever("Excluiu Medico ","Logs.txt");
            } catch (IOException ex) {
                Logger.getLogger(ListenerTelaInternaCadastroUsuario.class.getName()).log(Level.SEVERE, null, ex);
            }
            cadM.dispose();
        }
        if ("Buscar".equals(e.getActionCommand())) {    
            try {
                 if ("".equals(cadM.jTextFieldBuscar.getText())  ||  cadM.jTextFieldBuscar.getText() == null) {
                    List<Pessoa> listaPessoas = new ArrayList<Pessoa>();
                    listaPessoas = control.getAll();
                    cadM.getLista(listaPessoas);
                    GravarLogs.escrever("Buscou Paciente ", "Logs.txt");
                } else {
                   cadM.getInfo(control.buscaMedico(cadM.jTextFieldBuscar.getText()));
                    //JOptionPane.showMessageDialog(null, cadP.txtNomeCliente.getText());
                }
            } catch (IOException ex) {
                Logger.getLogger(ListenerTelaInternaCadastroUsuario.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        if ("Novo".equals(e.getActionCommand())) {
            cadM.limparCampos();
            try {
                GravarLogs.escrever("Buscou Medico ", "Logs.txt");
            } catch (IOException ex) {
                Logger.getLogger(ListenerTelaInternaCadastroUsuario.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
