package universidade;

public class Monitor {
    private int semestreAtual;
    private boolean temExperiencia;

    // Construtor padrão.
    public Monitor(){
        this.semestreAtual = 0;
        this.temExperiencia = false;
    }

    // Construtor com argumentos.
    public Monitor(int semestreAtual, boolean temExperiencia){
        this.semestreAtual = semestreAtual;
        this.temExperiencia = temExperiencia;
    }

    // Getters.
    public int getSemestreAtual(){
        return this.semestreAtual;
    }

    public boolean getTemExperiencia(){
        return this.temExperiencia;
    }
}
