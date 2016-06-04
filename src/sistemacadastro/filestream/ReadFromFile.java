package sistemacadastro.filestream;

import java.io.FileInputStream;
import java.io.IOException;

public class ReadFromFile {
    
    public static void ler(String logFile) throws IOException {
        FileInputStream leitorArquivos = new FileInputStream(logFile);
        
        int lido = leitorArquivos.read();
        while (lido != -1) {
            System.out.print((char)lido);
            lido = leitorArquivos.read();
        }
        leitorArquivos.close();
    }
    
    public static void main( String[] args ) {
        
        try {
            ReadFromFile.ler("log.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
        
    }
}
