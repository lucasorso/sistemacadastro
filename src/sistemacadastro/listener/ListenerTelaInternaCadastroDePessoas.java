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
import sistemacadastro.filestream.WriteToFile;
import sistemacadastro.visao.TelaInternaCadastroDePessoas;
import sistemacadastro.visao.TelaInternaProcurar;
import sistemacadastro.visao.TelaPrincipal;

/**
 *
 * @author Gregori Oliveira, Lucas Orso, Yuri Abel
 */
public class ListenerTelaInternaCadastroDePessoas implements ActionListener{
    
    private TelaInternaCadastroDePessoas cadP;
    private Pessoa pessoa = new Pessoa();
    private Endereco endereco = new Endereco();

    public ListenerTelaInternaCadastroDePessoas(TelaInternaCadastroDePessoas aThis) {
        this.cadP = aThis;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if ("Sair".equals(e.getActionCommand())){
            cadP.dispose();
        }
        if ("Salvar".equals(e.getActionCommand())) {
            pessoa = cadP.setInformacoesPessoa();
            endereco = cadP.setInformacoesEndereco();
            
            try {
                WriteToFile.escrever("Cadastrou Paciente ", "Logs.txt");
            } catch (IOException ex) {
                Logger.getLogger(ListenerTelaInternaCadastroUsuario.class.getName()).log(Level.SEVERE, null, ex);
            }
            JOptionPane.showMessageDialog(null, pessoa.getNome() + " " +  pessoa.getCpf() + " " +  pessoa.getRg() + " " + pessoa.getSexo()
             + " " + endereco.getRua() + " " + endereco.getCep() + " " + endereco.getCidade() + " " + endereco.getEstado());
        }
        if ("Editar".equals(e.getActionCommand())) {
            try {
                WriteToFile.escrever("Editou Paciente ","Logs.txt");
            } catch (IOException ex) {
                Logger.getLogger(ListenerTelaInternaCadastroUsuario.class.getName()).log(Level.SEVERE, null, ex);
            }
            cadP.dispose();
        }
        if ("Excluir".equals(e.getActionCommand())) {
            try {
                WriteToFile.escrever("Excluiu Paciente ","Logs.txt");
            } catch (IOException ex) {
                Logger.getLogger(ListenerTelaInternaCadastroUsuario.class.getName()).log(Level.SEVERE, null, ex);
            }
            cadP.dispose();
        }
        if ("Buscar".equals(e.getActionCommand())) {
            try {
                WriteToFile.escrever("Buscou Paciente ", "Logs.txt");
            } catch (IOException ex) {
                Logger.getLogger(ListenerTelaInternaCadastroUsuario.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
