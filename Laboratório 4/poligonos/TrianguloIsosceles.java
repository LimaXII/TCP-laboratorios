package poligonos;

public class TrianguloIsosceles extends Triangulo{

    public TrianguloIsosceles(float lado1, float lado2, float lado3){
        super(lado1, lado2, lado3);
    }    

    @Override
    public float calculaArea(){
        float altura = calculaAltura(getLado1(), getLado2(), getLado3());
        setAltura(altura);
        float base = getBase();
        return super.calculaArea(base, altura);        
    }   

    @Override
    public void imprimeTipoPoligono(){
        System.out.println("Este triângulo é isosceles. \n");
    }

    private float calculaAltura(float lado1, float lado2, float lado3){
        float altura;
        if (lado1 == lado2){
            altura = (float)(Math.sqrt((Math.pow(lado1, 2)) - (Math.pow((lado3 / 2), 2))));
            setBase(lado3);
        }
        else if (lado2 == lado3){
            altura = (float)(Math.sqrt((Math.pow(lado2, 2)) - (Math.pow((lado1 / 2), 2))));
            setBase(lado1);
        }
        else{
            altura = (float)(Math.sqrt((Math.pow(lado1, 2)) - (Math.pow((lado2 / 2), 2))));
            setBase(lado2);
        }        
        return altura;
    }
}
