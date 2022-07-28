package poligonos;

public class TrianguloEquilatero extends Triangulo {
    
    // Construtor que chama o construtor da classe pai.
    public TrianguloEquilatero(float lado1, float lado2, float lado3){
        super(lado1, lado2, lado3);
    }

    // Polimorfismo dinâmico. Calcula a área do triângulo equilatero.
    @Override
    public float calculaArea(){
        // Utiliza o getLado1 para pegar o valor de um lado do triângulo.
        float lado1 = getLado1();
        // Calcula e retorna o valor da área.
        float area = (float)((Math.sqrt(3.0f) / 4) * (Math.pow(lado1, 2)));        
        return area;
    }

    // Polimorfismo dinâmico. Imprime o tipo do triângulo.
    @Override
    public void imprimeTipoPoligono(){
        System.out.println("Este triângulo é equilatero. \n");
    }
}
