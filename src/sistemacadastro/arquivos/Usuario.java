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
public class Usuario {
    
   private int id;
   private String nome;
   private String senha;

   /**
     * @return the id
     */
   public int getId(){
       return id;
   }
   
   /**
     * @param id the id to set id
     */
   public void setId(int id){
       this.id = id;
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
     * @return the senha
     */
    public String getSenha() {
        return senha;
    }

    /**
     * @param senha the senha to set
     */
    public void setSenha(String senha) {
        this.senha = senha;
    }
   
}
