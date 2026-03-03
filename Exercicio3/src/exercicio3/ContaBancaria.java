
package exercicio3;


public class ContaBancaria {
    
    

    public String titular;   
    private double saldo;    

    // Método para depositar
    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito realizado com sucesso!");
        } else {
            System.out.println("Valor de depósito inválido!");
        }
    }

    public void sacar(double valor) {
        if (valor > 0) {
            if (saldo >= valor) {
                saldo -= valor;
                System.out.println("Saque realizado com sucesso!");
            } else {
                System.out.println("Saldo insuficiente!");
            }
        } else {
            System.out.println("Valor de saque inválido!");
        }
    }

    
    public double getSaldo() {
        return saldo;
    }
}
    
    
    
    
    
    
    
    
    
    
    
