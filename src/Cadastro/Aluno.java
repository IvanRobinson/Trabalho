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
public class Aluno extends Pessoa {
   private String ra;
     private String curso;    

    public Aluno(String ra, String curso, String nome, String telefone, String sexo) {
        super(nome, telefone, sexo);
        this.ra = ra;
        this.curso = curso;
    }

      
    public String getMatricula() {
        return ra;
    }
    public void setMatricula(String matricula) {
        this.ra = matricula;
    }
    public String getCurso() {
        return (curso);
    }
    public void setCurso(String curso) {
        this.curso = curso;
    }

    @Override
    public String toString() {
        return "Aluno{" + "ra=" + ra + ", curso=" + curso + '}';
    }
    
}
