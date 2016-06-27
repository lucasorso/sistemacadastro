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
import sistemacadastro.filestream.GravarLogs;
import sistemacadastro.visao.TelaInternaProcurar;

/**
 *
 * @author Lucas
 */
public class ListenerTelaInternaProcurar implements ActionListener {

    private TelaInternaProcurar procP;

    public ListenerTelaInternaProcurar(TelaInternaProcurar aThis) {
        this.procP = aThis;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if ("Buscar".equals(e.getActionCommand())) {
            try {
                GravarLogs.escrever("Buscou Paciente ","Logs.txt");
            } catch (IOException ex) {
                Logger.getLogger(ListenerTelaInternaCadastroUsuario.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
