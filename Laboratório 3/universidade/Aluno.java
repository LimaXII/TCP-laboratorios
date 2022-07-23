package universidade;

public class Aluno {
    private int numeroMatricula;
    private float indiceDesempenho;

    // Construtor padrão.
    public Aluno(){
        this.numeroMatricula = 0;
        this.indiceDesempenho = 0;
    }

    // Construtor com argumentos.
    public Aluno(int numeroMatricula, float indiceDesempenho){
        this.numeroMatricula = numeroMatricula;
        this.indiceDesempenho = indiceDesempenho;
    }

    // Getters.
    public int getNumeroMatricula(){
        return this.numeroMatricula;
    }

    public float getIndiceDesempenho(){
        return this.indiceDesempenho;
    }
    
    // Aumenta o indice.
    public boolean aumentaIndiceDesempenho(float valor){  
        // Aumenta apenas se o valor somado não ultrapassar 10.     
        if ((this.indiceDesempenho + valor) <= 10){
            this.indiceDesempenho += valor;
            // Retorna true caso sucesso.
            return true;
        }
        // Retorna false caso fracasso.
        return false;
    }

    // Diminui o indice.
    public boolean diminuiIndiceDesempenho(float valor){   
        // Diminui apenas se o valor subtraído não for menor que 0.       
        if ((this.indiceDesempenho - valor) >= 0){
            this.indiceDesempenho -= valor;
            // Retorna true caso sucesso.
            return true;
        }
        // Retorna false caso fracasso.
        return false;
    }

    // Imprime as informações do aluno.
    public void imprime(){
        System.out.println("Número de matrícula: " + this.numeroMatricula);
        System.out.println("Índice de desempenho: " + this.indiceDesempenho);
    }
}
