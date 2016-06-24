/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemacadastro.arquivos;

/**
 *
 * @author Gregori Oliveira, Lucas Orso, Yuri Abel
 */
public class Medico {
    
    private int id;
    private String nome;
    private String cpf;
    private String RG;
    private String especializacao;
    private String email;
    private String CRM;

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the cpf
     */
    public String getCpf() {
        return cpf;
    }

    /**
     * @param cpf the cpf to set
     */
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    /**
     * @return the RG
     */
    public String getRG() {
        return RG;
    }

    /**
     * @param RG the RG to set
     */
    public void setRG(String RG) {
        this.RG = RG;
    }

    /**
     * @return the especializacao
     */
    public String getEspecializacao() {
        return especializacao;
    }

    /**
     * @param especializacao the especializacao to set
     */
    public void setEspecializacao(String especializacao) {
        this.especializacao = especializacao;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the CRM
     */
    public String getCRM() {
        return CRM;
    }

    /**
     * @param CRM the CRM to set
     */
    public void setCRM(String CRM) {
        this.CRM = CRM;
    }
    
    
}
