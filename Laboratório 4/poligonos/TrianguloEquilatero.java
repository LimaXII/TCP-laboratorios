package poligonos;

public class TrianguloEquilatero extends Triangulo {
    
    public TrianguloEquilatero(float lado1, float lado2, float lado3){
        super(lado1, lado2, lado3);
    }

    @Override
    public float calculaArea(){
        float lado1 = getLado1();
        float area = (float)((Math.sqrt(3.0f) / 4) * (Math.pow(lado1, 2)));        
        return area;
    }

    @Override
    public void imprimeTipoPoligono(){
        System.out.println("Este triângulo é equilatero. \n");
    }
}
