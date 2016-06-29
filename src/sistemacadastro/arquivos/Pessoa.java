/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemacadastro.arquivos;

/**
 *
 * @author comp1
 */
public class Pessoa {
    
    private int id;
    private String nome;
    private String cpf;
    private String rg;
    private String sexo;
    
    /**
     * @return the codigo
     */
    public int getCodigo(){
        return id;
    }
    
     /**
     * @param codigo the nome to set
     */
    public void setCodigo(int codigo){
        this.id = codigo;
    }

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
     * @return the rg
     */
    public String getRg() {
        return rg;
    }

    /**
     * @param rg the rg to set
     */
    public void setRg(String rg) {
        this.rg = rg;
    }

    /**
     * @return the sexo
     */
    public String getSexo() {
        return sexo;
    }

    /**
     * @param sexo the sexo to set
     */
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    @Override
    public String toString() {
        return 
                getCodigo() + " " +
                getNome() + " " +
                getCpf() + " " +
                getRg() + " " +
                getSexo();
               // super.toString(); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
