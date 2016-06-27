package sistemacadastro.filestream;

import java.io.FileOutputStream;
import java.io.IOException;

public class GravarLogs {
    
    public static void escrever(String mensagem, String logFile) throws IOException {
        //O segundo parametro "true" indica append para o arquivo em quest�o.
        FileOutputStream escritorArquivos = new FileOutputStream(logFile, true);
        int tamanho = 0;
        String data = (new java.util.Date()).toString();
        String msg = data + " : " + mensagem + "\n";
        while (tamanho < msg.length()) {
            escritorArquivos.write((int)msg.charAt(tamanho++));
        }
        escritorArquivos.flush();
        escritorArquivos.close();
    }
}
