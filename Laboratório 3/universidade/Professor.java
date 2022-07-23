package universidade;

public class Professor {
    private int id;
    private String departamento;

    // Construtor padrão.
    public Professor(){
        this.id = 0;
        this.departamento = "Vazio";
    }

    // Construtor com argumentos.
    public Professor(int id, String departamento){
        this.id = id;
        this.departamento = departamento;
    }

    // Getters.
    public int getId(){
        return this.id;
    }

    public String getDepartamento(){
        return this.departamento;
    }

    // Setters.
    public void setId(int id){
        this.id = id;
    }

    public void setDepartamento(String departamento){
        this.departamento = departamento;
    }   
}