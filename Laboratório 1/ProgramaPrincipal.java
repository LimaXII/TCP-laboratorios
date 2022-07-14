public class ProgramaPrincipal {    
    public static void main(String[] args) {
        Imovel im1; // Declaração do objeto.
        double imposto;
        im1 = new Imovel(); // Instanciação do objeto.
        
        im1.nQuartos = 2;
        im1.nBanheiros = 1;
        im1.temGaragem = false;
        im1.endereco = "Rua dos Fulanos, n. 0";
        im1.aluguel = true;
        im1.valorVenda = 142000;
        
        
        // Parte 4.
        im1.imprimeDados();
        im1.valoriza(2.5);
        im1.imprimeDados();
        imposto = im1.calculaImposto();        
        System.out.println("Imposto incidente: " + imposto + " \n");
        
        // Parte 5.
        Imovel im2 = new Imovel(); // Instancia um novo objeto.
        im2.nQuartos = im1.nQuartos;
        im2.nBanheiros = im1.nBanheiros;
        im2.temGaragem = im1.temGaragem;
        im2.endereco = im1.endereco;
        im2.aluguel = im1.aluguel;
        im2.valorVenda = im1.valorVenda;
        
        
        /* Aqui os imoveis serão distintos, isso ocorre porque im1 e im2 são
         objetos diferentes e desta forma por mais que todos os seus campos
         tenham o mesmo valor, eles são diferentes. */        
        if (im1 == im2){
            System.out.println("Mesmos imoveis!");
        }
        else{
            System.out.println("Imoveis distintos!");
        }
        
        // Parte 6.
        
        /* Aqui os dois objetos, im3 e im1 são alterados juntos. Isso acontece 
          devido ao fato de ambos estarem "apontando" para o mesmo lugar. Desta forma
          qualquer alteração feita em um, impactará no outro.  */
        Imovel im3 = im1;
        im3.valorVenda = 0; // Imovel com perda total.
        im3.imprimeDados();
        im1.imprimeDados();
    }
    
}
