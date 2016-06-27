/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemacadastro.exceptions;

import javax.swing.JOptionPane;

/**
 *
 * @author Lucas
 */
public class ExceptionArmazenarInformacoes extends Exception {

    public ExceptionArmazenarInformacoes() {
        super("Algum erro ocorreu ao armazenar informações !");
    }

    public ExceptionArmazenarInformacoes(String msg) {
        super(msg);
    }
}
