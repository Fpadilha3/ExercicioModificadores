
package exercicio10;


public class Exercicio10 {

   
    public static void main(String[] args) {
       

        Carro carro = new Carro();

        carro.setMarca("Ford");
        carro.setModelo("Mustang");
        carro.setAno(1965);

        System.out.println("Marca: " + carro.getMarca());
        System.out.println("Modelo: " + carro.getModelo());
        System.out.println("Ano: " + carro.getAno());

        // Testando ano inválido
        carro.setAno(1700); // Deve exibir mensagem de erro
    }
}
        
        
        
        
        
        
        
        
       