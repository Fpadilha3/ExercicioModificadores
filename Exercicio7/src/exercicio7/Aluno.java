
package exercicio7;


public class Aluno extends Pessoa {

    // Método para definir a idade
    public void setIdade(int idade) {
        if (idade >= 0) {
            this.idade = idade;  // acessando atributo protected da superclasse
        } else {
            System.out.println("Idade inválida!");
        }
    }

    // Método para exibir a idade
    public void exibirIdade() {
        System.out.println("Idade do aluno: " + idade + " anos");
    }
}
    
    
    
    
    
    
    
    
    
    

