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

 public class Professor extends Pessoa {
        private String registro;    
        private String  disciplinas; 


    

    public void setRegistro(String registro) {
        this.registro = registro;
    }
    public String getRegistro() {
        return (registro);
    }
    public void setDisciplinas(String disciplinas) {
        this.disciplinas = disciplinas;
    }
    public String getDisciplinas() {
        return (disciplinas);
    }
}