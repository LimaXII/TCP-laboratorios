package teste;

import java.util.ArrayList;
import java.util.Scanner;

public class AplicacaoTestaPosicoes {
    int MAP_WIDTH;
    int MAP_HEIGHT;
    
    public void main(String[] args){
        Scanner entrada1 = new Scanner(System.in);
        Scanner entrada2 = new Scanner(System.in);
        
        PosicaoMapa4x4 p1 = new PosicaoMapa4x4(x,y);
        
        while(!(p1.setX(x) && p1.setY(y))){
            
        }   
        
        // Invoca o método imprime.
        p1.imprime();        
    }
    
    private static void imprimeMapa(ArrayList<PosicaoMapa4x4>){
        
    }           
}
