/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemacadastro.arquivos;

import java.io.BufferedWriter;
import java.io.FileWriter;
import javax.swing.JOptionPane;

/**
 *
 * @author Lucas
 */
public class GravarUsuario extends Arquivo{
    
    public static void gravarArquivo(String nomeArquivo){
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        try {
            fileWriter = new FileWriter(nomeArquivo + ".txt", false);
            bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write("Novo Aquivo");
            bufferedWriter.flush();
            //Se chegou ate essa linha, conseguiu salvar o arquivo com sucesso.
            //JOptionPane.showMessageDialog(null, "Salvo com sucesso");
        } catch (java.io.IOException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao salvar o arquivo: " + ex.getMessage());
        }
    }

    public static void gravarArquivo(String nomeArquivo, Usuario aUsuario) {
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        String textoArquivo = (aUsuario.getNome() + ";" + aUsuario.getSenha());
        try {
            fileWriter = new FileWriter(nomeArquivo + ".txt", false);
            bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(textoArquivo);
            bufferedWriter.flush();
            //Se chegou ate essa linha, conseguiu salvar o arquivo com sucesso.
            //JOptionPane.showMessageDialog(null, "Salvo com sucesso");
        } catch (java.io.IOException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao salvar o arquivo: " + ex.getMessage());
        } 
    }
}
