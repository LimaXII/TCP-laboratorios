public class Imovel {
    int nQuartos;
    int nBanheiros;
    boolean temGaragem;
    String endereco;
    boolean aluguel;
    double valorVenda;  
    
    public void imprimeDados(){
        String garagem_string;
        String aluguel_string;
        if (temGaragem){
            garagem_string = "Sim";            
        }
        else{
            garagem_string = "Não";
        }
        
        if (aluguel){
            aluguel_string = "Sim";
        }
        else{
            aluguel_string = "Não";
        }
        
        System.out.println("Quartos: " + nQuartos + " \n"
                            + "Banheiros: " + nBanheiros + " \n"
                            + "Garagem: " + garagem_string + " \n" 
                            + "Endereco: " + endereco + " \n"
                            + "Aluguel: " + aluguel_string + " \n"
                            + "Valor da venda: " + valorVenda + " \n");
    }
    
    public void valoriza(double perc){
        valorVenda = valorVenda + (valorVenda * perc / 100);
    } 
    
    public double calculaImposto(){
        if (aluguel){
            double valorAluguel;
            valorAluguel = (valorVenda * 5)/100;
            return((valorAluguel * 12)/100);
        }
        else{
             return((valorVenda * 12)/100);
        }
    }
}

