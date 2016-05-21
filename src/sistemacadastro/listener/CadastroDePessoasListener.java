/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemacadastro.listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import sistemacadastro.arquivos.Arquivo;
import sistemacadastro.arquivos.Endereco;
import sistemacadastro.arquivos.Pessoa;
import sistemacadastro.visao.CadastroDePessoas;

/**
 *
 * @author comp1
 */
public class CadastroDePessoasListener implements ActionListener{
    
    private CadastroDePessoas cadP;
    private Pessoa pessoa = new Pessoa();
    private Endereco endereco = new Endereco();

    public CadastroDePessoasListener(CadastroDePessoas aCadastro) {
        this.cadP = aCadastro;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if ("Sair".equals(e.getActionCommand())){
            cadP.dispose();
        }
        if ("Salvar".equals(e.getActionCommand())) {
            pessoa = cadP.setinf();
            JOptionPane.showMessageDialog(null, pessoa.getNome() + " " +  pessoa.getCpf() + " " +  pessoa.getRg() + " " + pessoa.getSexo());
        }
        if ("Editar".equals(e.getActionCommand())) {
            cadP.dispose();
        }
        if ("Excluir".equals(e.getActionCommand())) {
            cadP.dispose();
        }
        if ("Buscar".equals(e.getActionCommand())) {
            cadP.dispose();
        }
    }
}
