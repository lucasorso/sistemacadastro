package sistemacadastro.listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import sistemacadastro.arquivos.Consulta;
import sistemacadastro.arquivos.Pessoa;
import sistemacadastro.controle.ControleConsulta;
import sistemacadastro.filestream.GravarLogs;
import sistemacadastro.visao.TelaInternaCadastroDePessoas;
import sistemacadastro.visao.TelaInternaConsulta;

/**
 *
 * @author cri- UA
 */
public class ListenerTelaInternaConsulta implements ActionListener {
    private TelaInternaConsulta cadC;
    ControleConsulta control =  new ControleConsulta();
    Consulta cons =  new Consulta();
    public  ListenerTelaInternaConsulta (TelaInternaConsulta aThis) {
        this.cadC = aThis;
    }
    
    public void actionPerformed(ActionEvent e) {
        
    if ("Salvar".equals(e.getActionCommand())) {
        cons = cadC.setInfo();
        control.insert(cons);
    }
    
    if ("Buscar".equals(e.getActionCommand())) {
            try {
                GravarLogs.escrever("Buscou Paciente ", "Logs.txt");               
                cadC.getInfo(control.buscaPessoa(cadC.jTextFieldBusca.getText()));
            } catch (IOException ex) {
                Logger.getLogger(ListenerTelaInternaCadastroUsuario.class.getName()).log(Level.SEVERE, null, ex);
            }
        }     
    }
}
