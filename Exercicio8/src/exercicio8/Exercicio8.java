
package exercicio8;


public class Exercicio8 {

    public static void main(String[] args) {
       

        Porta porta = new Porta();

        porta.abrir();   // Porta aberta
        porta.abrir();   // Já está aberta
        porta.fechar();  // Porta fechada
        porta.fechar();  // Já está fechada

        System.out.println("A porta está aberta? " + porta.isAberta());
    }
}
        
        
        
        
        
        
        
        
        

