package universidade;

import java.util.ArrayList;

public class Turma {
    private int numAlunos;
    private int numMonitores;
    private Professor professor;
    private ArrayList<Aluno> alunos;
    private ArrayList<Monitor> monitores;

    // Construtor padrão.
    public Turma(){
        this.numAlunos = 0;
        this.numMonitores = 0;
        this.professor = null;       
    }

    // Construtor com argumentos.
    public Turma(Professor prof1, ArrayList<Monitor> monitores, ArrayList<Aluno> alunos){
        this.alunos = alunos;
        this.numAlunos = alunos.size();
        this.monitores = monitores;
        this.numMonitores = monitores.size();
        this.professor = prof1;
    }

    // Getters.
    public int getNumAlunos(){
        return this.numAlunos;
    }

    public int getNumMonitores(){
        return this.numMonitores;
    }

    public Professor getProfessor(){
        return this.professor;
    }

    // Setters.
    public void setProfessor(Professor professor){
        this.professor = professor;
    }

    public void setMonitores(ArrayList<Monitor> monitores){
        this.monitores = monitores;
        this.numMonitores = monitores.size();
    }

    public void setAlunos(ArrayList<Aluno> alunos){
        this.alunos = alunos;
        this.numAlunos = alunos.size();
    }

    // Adiciona um aluno na turma.
    public boolean adicionaAluno(Aluno aluno){
        // Só adiciona caso a turma não esteja com capacidade máxima (45).
        if (numAlunos < 45){
            this.alunos.add(aluno);  
            // Retorna true caso sucesso.          
            return true;
        }        
        // Retorna false caso fracasso.
        return false;
    }
    
    // Remove um aluno da turma.
    public boolean removeAluno(){
        // Varíavel para saber o tamanho do ArrayList.
        int tamanho = 0;

        // Só remove caso a turma tenha pelo menos mais que 10 alunos.
        if (numAlunos > 10){           
            tamanho = this.alunos.size();
            // Remove o último elemento do Array.
            this.alunos.remove(tamanho - 1);
            // Retorna true caso sucesso. 
            return true;
        } 
        // Retorna false caso fracasso.       
        return false;
    }

    // Imprime todos os alunos da turma.
    public void imprimeAlunos(){
        // Percorre o array imprimindo aluno por aluno.
        for (Aluno i : alunos){
            i.imprime();
        }        
    }
}
