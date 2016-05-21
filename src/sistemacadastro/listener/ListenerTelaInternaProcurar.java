/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemacadastro.listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import sistemacadastro.visao.TelaInternaProcurar;

/**
 *
 * @author Lucas
 */
public class ListenerTelaInternaProcurar implements ActionListener{
    
    private TelaInternaProcurar procP;
    
    public ListenerTelaInternaProcurar(TelaInternaProcurar aThis) {
        this.procP = aThis;
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
      
    }
    
}
