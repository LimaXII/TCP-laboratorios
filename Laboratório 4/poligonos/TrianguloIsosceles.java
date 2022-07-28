package poligonos;

public class TrianguloIsosceles extends Triangulo{

    // Construtor que chama o construtor da classe pai.
    public TrianguloIsosceles(float lado1, float lado2, float lado3){
        super(lado1, lado2, lado3);
    }    

    // Polimorfismo dinâmico. Calcula a área do triângulo isosceles.
    @Override
    public float calculaArea(){
        float altura = calculaAltura(getLado1(), getLado2(), getLado3());
        // Seta a altura calculada como a altura do triângulo.
        setAltura(altura);
        float base = getBase();
        // Chama o método da classe pai para calcular a área do triângulo.
        return super.calculaArea(base, altura);        
    }   

    // Polimorfismo dinâmico. Imprime o tipo do triângulo.
    @Override
    public void imprimeTipoPoligono(){
        System.out.println("Este triângulo é isosceles. \n");
    }

    // Função private que ajuda a calcular a altura do triângulo.
    private float calculaAltura(float lado1, float lado2, float lado3){
        float altura;
        // Descobre qual lado que é o diferente e será a base.
        if (lado1 == lado2){
            altura = (float)(Math.sqrt((Math.pow(lado1, 2)) - (Math.pow((lado3 / 2), 2))));
            // Seta este lado como base do triângulo.
            setBase(lado3);
        }
        else if (lado2 == lado3){
            altura = (float)(Math.sqrt((Math.pow(lado2, 2)) - (Math.pow((lado1 / 2), 2))));
            // Seta este lado como base do triângulo.
            setBase(lado1);
        }
        else{
            altura = (float)(Math.sqrt((Math.pow(lado1, 2)) - (Math.pow((lado2 / 2), 2))));
            // Seta este lado como base do triângulo.
            setBase(lado2);
        }        
        return altura;
    }
}
