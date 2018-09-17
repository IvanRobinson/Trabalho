/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cadastro;

/**
 *
 * @author Ivan
 */
public class Pessoa {
    private String nome;  
      private String endereco;      
      private String    telefone;      
      private String  sexo; 

//    public Pessoa(String nome, String endereco, String telefone, String sexo) {
//        this.nome = nome;
//        this.endereco = endereco;
//        this.telefone = telefone;
//        this.sexo = sexo;
//    }

   
    public String getNome() {
        return (nome);
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getTelefone() {
        return (telefone);
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    public String getEndereco() {
        return (endereco);
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    public String getSexo() {
        return (sexo);
    }
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
}
    
