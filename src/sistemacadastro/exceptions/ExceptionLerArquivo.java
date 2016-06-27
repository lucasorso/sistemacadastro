/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemacadastro.exceptions;

/**
 *
 * @author Lucas
 */
public class ExceptionLerArquivo extends Exception {

    public ExceptionLerArquivo() {
        super("Erro ao ler arquivo");
    }
}
