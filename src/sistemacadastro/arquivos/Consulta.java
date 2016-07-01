/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemacadastro.arquivos;

/**
 *
 * @author cri- UA
 */
public class Consulta {
    private int id;
    private String nome_paciente;
    private String problema;
    private String Temp;
    private String Pressao;
    private String Peso;
    private String altura;

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the nome_paciente
     */
    public String getNome_paciente() {
        return nome_paciente;
    }

    /**
     * @param nome_paciente the nome_paciente to set
     */
    public void setNome_paciente(String nome_paciente) {
        this.nome_paciente = nome_paciente;
    }

    /**
     * @return the problema
     */
    public String getProblema() {
        return problema;
    }

    /**
     * @param problema the problema to set
     */
    public void setProblema(String problema) {
        this.problema = problema;
    }

    /**
     * @return the Temp
     */
    public String getTemp() {
        return Temp;
    }

    /**
     * @param Temp the Temp to set
     */
    public void setTemp(String Temp) {
        this.Temp = Temp;
    }

    /**
     * @return the Pressao
     */
    public String getPressao() {
        return Pressao;
    }

    /**
     * @param Pressao the Pressao to set
     */
    public void setPressao(String Pressao) {
        this.Pressao = Pressao;
    }

    /**
     * @return the Peso
     */
    public String getPeso() {
        return Peso;
    }

    /**
     * @param Peso the Peso to set
     */
    public void setPeso(String Peso) {
        this.Peso = Peso;
    }

    /**
     * @return the altura
     */
    public String getAltura() {
        return altura;
    }

    /**
     * @param altura the altura to set
     */
    public void setAltura(String altura) {
        this.altura = altura;
    }
    
}
