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
import sistemacadastro.arquivos.Endereco;
import sistemacadastro.arquivos.Pessoa;
import sistemacadastro.controle.ControleEnderecoDao;
import sistemacadastro.controle.ControlePessoaDao;
import sistemacadastro.exceptions.ExceptionArmazenarInformacoes;
import sistemacadastro.filestream.GravarLogs;
import sistemacadastro.visao.TelaInternaCadastroDePessoas;

/**
 *
 * @author Gregori Oliveira, Lucas Orso, Yuri Abel
 */
public class ListenerTelaInternaCadastroDePessoas implements ActionListener {

    private TelaInternaCadastroDePessoas cadP;
    private Pessoa pessoa = new Pessoa();
    private Endereco endereco = new Endereco();
    private ControlePessoaDao controlPes = new ControlePessoaDao();
    private ControleEnderecoDao controlEnd = new ControleEnderecoDao();

    public ListenerTelaInternaCadastroDePessoas(TelaInternaCadastroDePessoas aThis) {
        this.cadP = aThis;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if ("Sair".equals(e.getActionCommand())) {
            cadP.dispose();
        }
        if ("Salvar".equals(e.getActionCommand())) {
            try {
                pessoa = cadP.setInformacoesPessoa();
                endereco = cadP.setInformacoesEndereco();
                if (pessoa == null && endereco == null) {
                    GravarLogs.escrever("Campos obrigatótios não informados no cadastro", "Logs.txt");
                    JOptionPane.showMessageDialog(cadP, "É necessário preencher todos os campos !");
                } else {
                    controlPes.insert(pessoa);
                    controlEnd.insert(endereco);
                    controlPes.relaciona(pessoa, endereco);
                    GravarLogs.escrever("Cadastrou novo usuario", "Logs.txt");
                }
            } catch (ExceptionArmazenarInformacoes ex) {
                ex.getMessage();
            } catch (IOException ex) {
                ex.getMessage();
            }
        }
        if ("Editar".equals(e.getActionCommand())) {

            try {
                pessoa = cadP.setInformacoesPessoa();
                endereco = cadP.setInformacoesEndereco();
            } catch (ExceptionArmazenarInformacoes ex) {
                Logger.getLogger(ListenerTelaInternaCadastroDePessoas.class.getName()).log(Level.SEVERE, null, ex);
            }

            controlPes.update(pessoa);

            try {
                GravarLogs.escrever("Editou Paciente ", "Logs.txt");
            } catch (IOException ex) {
                Logger.getLogger(ListenerTelaInternaCadastroUsuario.class.getName()).log(Level.SEVERE, null, ex);
            }
            cadP.dispose();
        }
        if ("Excluir".equals(e.getActionCommand())) {
            try {
                GravarLogs.escrever("Excluiu Paciente ", "Logs.txt");
            } catch (IOException ex) {
                Logger.getLogger(ListenerTelaInternaCadastroUsuario.class.getName()).log(Level.SEVERE, null, ex);
            }
            cadP.dispose();
        }
        if ("Buscar".equals(e.getActionCommand())) {
            try {
                GravarLogs.escrever("Buscou Paciente ", "Logs.txt");
            } catch (IOException ex) {
                Logger.getLogger(ListenerTelaInternaCadastroUsuario.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }
}
