
package exercicio4;

 
public class Veiculo {
    
        protected int velocidadeMaxima;

    public void setVelocidadeMaxima(int velocidadeMaxima) {
        if (velocidadeMaxima > 0) {
            this.velocidadeMaxima = velocidadeMaxima;
        } else {
            System.out.println("Velocidade inválida!");
        }
    }
}
    
    
    
    
    
    
    
    
    
    
    
