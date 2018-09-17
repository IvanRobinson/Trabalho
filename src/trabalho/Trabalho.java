/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalho;

import Cadastro.Pessoa;
import Cadastro.Aluno;


import Cadastro.Professor;
import javax.swing.JOptionPane;

/**
 *
 * @author Ivan
 */
public class Trabalho {
        Aluno cadastroAluno = new Aluno();   
  
        Professor cadastroProfessor = new Professor();   
           private int n1;
           private int n2;
           private int n3;
    
    public void cadastrarAluno() {
        cadastroAluno.setNome(JOptionPane.showInputDialog("Insira o nome do aluno: "));
        cadastroAluno.setMatricula(JOptionPane.showInputDialog("Insira a matrícula do aluno: "));
        cadastroAluno.setCurso(JOptionPane.showInputDialog("Insira o curso do aluno: "));
        cadastroAluno.setEndereco(JOptionPane.showInputDialog("Insira o endereço do aluno: "));
        cadastroAluno.setSexo(JOptionPane.showInputDialog("Insira o sexo do aluno: "));
        cadastroAluno.setTelefone(JOptionPane.showInputDialog("Insira o telefone do aluno: "));
            String s = null;
            
           String nome, n1, n2, n3;
		double nota1, nota2,nota3, media;
				
		n1 = JOptionPane.showInputDialog("Digite a nota1");
		//converte a String em double
		nota1 = Double.parseDouble(n1);
		n2 = JOptionPane.showInputDialog("Digite a nota2");
		nota2 = Double.parseDouble(n2);
                n3 = JOptionPane.showInputDialog("Digite a nota3");
                nota3 = Double.parseDouble(n3);
		media = (nota1+nota2+nota3)/3;
		if (media>=7)
		{
			JOptionPane.showMessageDialog(null,"\n"+"A média do aluno é"+media,"Aluno Aprovado",JOptionPane.INFORMATION_MESSAGE);
		}else 
		{
		JOptionPane.showMessageDialog(null,"\n"+"A media do aluno é"+media, "Deverá fazer Prova Substituta", JOptionPane.WARNING_MESSAGE);
		}
       
	}
    
        
    
    public void exibirAluno() {
        String matricula;          
        matricula = JOptionPane.showInputDialog("Insira a matrícula do aluno a ser pesquisado: ");
        if (cadastroAluno.getMatricula().equals(matricula)) {
            JOptionPane.showMessageDialog(null, "Aluno consta no sistema!\nNome: " + cadastroAluno.getNome()
                    + "\nEndereço: " + cadastroAluno.getEndereco() + "\nCurso: " + cadastroAluno.getCurso()
                    + "\nSexo: " + cadastroAluno.getSexo() + "\nTelefone: " + cadastroAluno.getTelefone());
        } 
        else {
            JOptionPane.showMessageDialog(null, "Aluno não encontrado!", "Aviso", JOptionPane.ERROR_MESSAGE);
        }
    } 
    private void cadastrarProfessor () {  
        cadastroProfessor.setNome(JOptionPane.showInputDialog("Insira o nome do Professor: "));
        cadastroProfessor.setDisciplinas(JOptionPane.showInputDialog("Insira o nome da Diciplina que ministra: "));
        cadastroProfessor.setRegistro(JOptionPane.showInputDialog("Insira o registro: "));
        cadastroProfessor.setEndereco(JOptionPane.showInputDialog("Insira o endereço do professor: "));
        cadastroProfessor.setSexo(JOptionPane.showInputDialog("Insira o sexo M para masculino F para feminino: "));
        cadastroProfessor.setTelefone(JOptionPane.showInputDialog("Insira o telefone do Professor: "));
}
    public void exibirProfessor() {
        String registro;           
        registro= JOptionPane.showInputDialog("Insira o numero do registro: ");
           
        if (cadastroProfessor.getRegistro().equals(registro)) {
            JOptionPane.showMessageDialog(null, "Professor consta no sistema!\nNome: " + cadastroProfessor.getNome()
                    + "\nEndereço: " + cadastroProfessor.getEndereco() + "\nCurso: " + cadastroProfessor.getDisciplinas()
                    + "\nSexo: " + cadastroProfessor.getSexo() + "\nTelefone: " + cadastroProfessor.getTelefone());
        } // if
        else {
            JOptionPane.showMessageDialog(null, "Professorão não encontrado!", "Aviso", JOptionPane.ERROR_MESSAGE);
        }
    }
  private void removerAluno(){
        String matricula = JOptionPane.showInputDialog("Insira a matrícula do aluno : ");
        boolean removido = false;
        
            if(cadastroAluno != null){
                if(cadastroAluno.getNome().equals(matricula)){
                    cadastroAluno = null;
                    removido = true;
                }
            }
        
        if(removido){
            JOptionPane.showMessageDialog(null,"Aluno removido com sucesso!");
        }else{
            JOptionPane.showMessageDialog(null,"Aluno não encontrado!");
        }
    }
     private void removerProfessor(){
        String registro = JOptionPane.showInputDialog("Insira o numero do registro : ");
        boolean removido = false;
        
            if(cadastroProfessor != null){
                if(cadastroProfessor.getNome().equals(registro)){
                    cadastroProfessor = null;
                    removido = true;
                }
            }
        
        if(removido){
            JOptionPane.showMessageDialog(null,"Professor removido com sucesso!");
        }else{
            JOptionPane.showMessageDialog(null,"Professor não encontrado!");
        }
    }
    
    
    public static void main(String[] args) {
        int OpcaoMenu;                                      // opção do menu
        Trabalho ca = new Trabalho();
        do { // loop para menu de opções
            OpcaoMenu = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite uma Opção: \n\n"
                    + "Opção 1: Cadastrar Aluno \n"
                    + "Opção 2: Cadastrar Professor \n"
                    + "Opção 3: Exibir Aluno \n"
                    + "Opção 4: Exibir Professor \n"
                    + "Opção 5: Excluir Aluno \n"
                    + "Opção 6: Excluir Professor \n"
                    + "Opção 7: SAIR \n\n", "Menu de Opções", JOptionPane.PLAIN_MESSAGE));
            switch (OpcaoMenu) { 
                case 1: 
                    ca.cadastrarAluno();
                    break;
                case 2: 
                    ca.cadastrarProfessor();
                    break;
                case 3: 
                    ca.exibirAluno();
                    break;
                case 4: 
                  ca.exibirProfessor();
                    break;
                case 5: 
                    ca.removerAluno();
                    break;
                case 6: 
                    ca.removerProfessor();
                    break;
                case 7: 
                    break;
                default: 
                   JOptionPane.showMessageDialog(null,"Opção inválida!");
               break;
            }       
        } while (OpcaoMenu != 7);
    } 

    
} 

