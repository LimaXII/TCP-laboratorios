package poligonos;

// Classe abstrata que implementa a interface poligono.
public abstract class Triangulo implements Poligono {
    // Atributos.
    private float base;
    private float altura;
    private float lado1;
    private float lado2;
    private float lado3;    

    // Setters.
    public void setBase(float base){
        this.base = base;
    }

    public void setAltura(float altura){
        this.altura = altura;
    }

    public void setLado1(float lado1){
        this.lado1 = lado1;
    }

    public void setLado2(float lado2){
        this.lado2 = lado2;
    }

    public void setLado3(float lado3){
        this.lado3 = lado3;
    }

    // Getters.
    public float getBase(){
        return this.base;
    }

    public float getAltura(){
        return this.altura;
    }

    public float getLado1(){
        return this.lado1;
    }

    public float getLado2(){
        return this.lado2;
    }

    public float getLado3(){
        return this.lado3;
    }

    // Construtor que recebe base e altura.
    public Triangulo(float base, float altura){
        this.base = base;
        this.altura = altura;
    }

    // Construtor que recebe os lados do triângulo.
    public Triangulo(float lado1, float lado2, float lado3){
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }
    
    // Método que cálcula e retorna a área do triângulo com base nos valores de base e altura recebidos como argumento.
    public static float calculaArea(float base, float altura){
        float area = (base * altura) / 2;
        return area;
    }

    // Método que cálcula e retorna a área do triângulo com base nos valores de base e altura do objeto.
    public float calculaArea(){
        float area = (this.base * this.altura) / 2;
        return area;
    }   

    // Método abstrato que imprime o tipo do triângulo
    public abstract void imprimeTipoPoligono();
}
