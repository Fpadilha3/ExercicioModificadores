
package exercicio7;


public class Exercicio7 {

  
    public static void main(String[] args) {
        
        
        
        
       
        // Criando usuário
        Usuario usuario = new Usuario("maria123", "senhaSegura");

        // Testando autenticação
        if (usuario.autenticar("maria123", "senhaSegura")) {
            System.out.println("Autenticação bem-sucedida!");
        } else {
            System.out.println("Login ou senha incorretos!");
        }

        if (usuario.autenticar("maria123", "1234")) {
            System.out.println("Autenticação bem-sucedida!");
        } else {
            System.out.println("Login ou senha incorretos!");
        }
    }
}
      
  