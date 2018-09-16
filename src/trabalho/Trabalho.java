/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalho;

import Cadastro.Pessoa;
import Cadastro.Aluno;
import Cadastro.Media;
import javax.swing.JOptionPane;

/**
 *
 * @author Ivan
 */
public class Trabalho {
        Pessoa pessoa[] = new Pessoa[5];
       

    public static void main(String[] args) {

        Pessoa pessoa[] = new Pessoa[5];
        
        int opcao = 0;

        do {
             Trabalho cadastro = new Trabalho();
              opcao = Integer.parseInt(JOptionPane.showInputDialog("Escolha uma opção:\n"
               + "1 - Cadastrar Aluno\n"
               + "2 - Cadastrar Professor"
               + "3 - media \n"
               + "4 - Remover \n"
               + "4 - Sair"));
       
       
           switch(opcao){
            
                    
            
                case 1:
                    cadastro.cadastrarAluno();
                    break;
                case 2:
                    cadastro.cadastrarProfessor();
                    break;
                case 3:
                    cadastro.cadastrarNotas();
                    break;
                default:
                    System.out.println("Esta não é uma opção válida!");
            }
        } while (opcao !=3 );
    }
    private void cadastrarAluno(){
         Pessoa novoPessoa = null;
         
           String nome = JOptionPane.showInputDialog("");
            novoPessoa.setNome(nome);
           
            String telefone = JOptionPane.showInputDialog("");
            novoPessoa.setTelefone(telefone);
        
            String endereco = JOptionPane.showInputDialog("");
             novoPessoa.setEndereco(endereco);
        
             String sexo = JOptionPane.showInputDialog("");
              novoPessoa.setSexo(sexo);
              

           
        for(int i=0; i < pessoa.length; i++){
            if(pessoa[i] == null){
                pessoa[i] = novoPessoa;
                        break;
            }
        }
        JOptionPane.showMessageDialog(null, "Aluno cadastrado!");
    }

    private void cadastrarProfessor(){
         Pessoa novoProfessor = null;
         
           String nome = JOptionPane.showInputDialog("");
            novoProfessor.setNome(nome);
           
            String telefone = JOptionPane.showInputDialog("");
            novoProfessor.setTelefone(telefone);
        
            String endereco = JOptionPane.showInputDialog("");
             novoProfessor.setEndereco(endereco);
        
             String sexo = JOptionPane.showInputDialog("");
              novoProfessor.setSexo(sexo);
              
//              String ra = JOptionPane.showInputDialog("");
//              novoPessoa.setMatricula(ra);
//              
//               String curso = JOptionPane.showInputDialog("");
//              novoPessoa.setCurso(curso);
           
           
        for(int i=0; i < pessoa.length; i++){
            if(pessoa[i] == null){
                pessoa[i] = novoProfessor;
                        break;
            }
        }
        JOptionPane.showMessageDialog(null, "Professor cadastrado!");
    }
    private void cadastrarNotas(){
       Media novaMedia = null;
       for(int i=0; i< pessoa.length; i++){
           String nome = JOptionPane.showInputDialog("");
            novoPesoa.setNome(nome);
      JOptionPane.showMessageDialog(null,"aluno  : "+pessoa[i].getNome());
      
          String nota1= JOptionPane.showInputDialog("Entre com a nota");
          Integer.parseInt(nota1);
            
            
            String nota2= JOptionPane.showInputDialog("");
            Integer.parseInt(nota2);
            
            String nota3= JOptionPane.showInputDialog("");
            Integer.parseInt(nota3);
            
           media= (media =  (nota1+ nota2+ nota3)/3);
       }
    }

    private void exibir(){
        String menssagem = "Animais";
        for(int i=0; i< pessoa.length; i++){
            if(pessoa[i] != null){
                menssagem += "\n" + pessoa[i].getNome() +"\n" + pessoa[i].getTelefone() + "\n"+ pessoa[i].getEndereco() +"\n"
                        + pessoa[i].getSexo() ;
            }
        }
        JOptionPane.showMessageDialog(null, menssagem);
    }
    
}
