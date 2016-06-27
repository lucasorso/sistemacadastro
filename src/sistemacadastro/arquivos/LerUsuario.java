/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemacadastro.arquivos;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import sistemacadastro.exceptions.ExceptionLerArquivo;
import sistemacadastro.visao.TelaLogin;

/**
 *
 * @author Lucas
 */
public class LerUsuario extends Arquivo {

    @Override
    public String lerArquivo(String nomeArquivo) {
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        try {
            fileReader = new FileReader(nomeArquivo);
            bufferedReader = new BufferedReader(fileReader);
            StringBuilder sb = new StringBuilder();
            while (bufferedReader.ready()) {
                sb.append(bufferedReader.readLine());
                sb.append("\n");
            }
            return sb.toString();
        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(this, "Não foi encotrado, Será criado um novo arquivo");
            //GravarUsuario.gravarArquivo("Login");
            ex.printStackTrace();
        }  catch(IOException ex){
            ex.printStackTrace();
        }
        return null;
    }
}
