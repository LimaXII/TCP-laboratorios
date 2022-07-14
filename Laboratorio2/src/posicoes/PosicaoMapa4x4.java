package posicoes;

public class PosicaoMapa4x4 {    
        private int x;
        private int y;
        public static int numPosicoesOcupadas;    

    public PosicaoMapa4x4(){
        reset();
        numPosicoesOcupadas++;
    }

    public PosicaoMapa4x4(int x, int y){
        this.x = x;
        this.y = y;
        numPosicoesOcupadas++;
    }

    public boolean setX(int x){
        if(x >= 0 && x < 4){
            this.x = x;
            return true;
        }
        reset();
        return false;
    }

    public boolean setY(int y){
        if(y >= 0 && x < 4){
           this.y = y;
           return true;
        }
        reset();
        return false;
    }

    public int getX(){
        return this.x;
    }

    public int getY(){
        return this.y;
    }

    public int getNumPosicoesOcupadas(){
        return numPosicoesOcupadas;
    }

    public PosicaoMapa4x4 copy(){
        PosicaoMapa4x4 p1;
        p1 = new PosicaoMapa4x4(this.x, this.y);   
        return p1;
    }

    public void imprime(){
        System.out.println("(" + x + "," + y + ")");
    }

    public double distancia(PosicaoMapa4x4 p){
        double dE;        
        dE = Math.sqrt(Math.pow(this.x - p.x, 2)+ Math.pow(this.y - p.y, 2));        
        return dE;
    }

    private void reset(){
        this.x = 0;
        this.y = 0;
    }

    public boolean estaoMesmaPosicao(PosicaoMapa4x4 p1, PosicaoMapa4x4 p2){
        if((p1.x == p2.x) && (p1.y == p2.y)){
            return true;
        }
        return false;
    }
}
