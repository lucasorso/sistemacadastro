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
import sistemacadastro.arquivos.Pessoa;
import sistemacadastro.controle.ControlePessoaDao;
import sistemacadastro.filestream.GravarLogs;
import sistemacadastro.visao.TelaInternaProcurar;

/**
 *
 * @author Lucas
 */
public class ListenerTelaInternaProcurar implements ActionListener {

    private TelaInternaProcurar procP;
    private ControlePessoaDao control = new ControlePessoaDao();

    public ListenerTelaInternaProcurar(TelaInternaProcurar aThis) {
        this.procP = aThis;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if ("Buscar".equals(e.getActionCommand())) {
            try {
                List<Pessoa> listaPessoas = new ArrayList<Pessoa>();
                listaPessoas = control.getAll();
                procP.getLista(listaPessoas);
                GravarLogs.escrever("Buscou Paciente ","Logs.txt");
            } catch (IOException ex) {
                Logger.getLogger(ListenerTelaInternaCadastroUsuario.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
