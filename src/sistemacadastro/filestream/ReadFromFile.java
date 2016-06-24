package sistemacadastro.filestream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import jdk.nashorn.internal.ir.CatchNode;
import sistemacadastro.exceptions.ExceptionLerArquivo;

public class ReadFromFile {

    public static void ler(String logFile) throws IOException, FileNotFoundException, ExceptionLerArquivo {
        FileInputStream leitorArquivos = new FileInputStream(logFile);

        int lido = leitorArquivos.read();
        while (lido != -1) {
            System.out.print((char) lido);
            lido = leitorArquivos.read();
        }
        leitorArquivos.close();
    }
}
