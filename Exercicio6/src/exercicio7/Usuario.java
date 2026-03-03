
package exercicio7;


public class Usuario {
    


    private String login;
    private String senha;

    // Construtor para inicializar login e senha
    public Usuario(String login, String senha) {
        this.login = login;
        this.senha = senha;
    }

    // Getters e setters (opcionais, dependendo da necessidade)
    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    // Método de autenticação
    public boolean autenticar(String login, String senha) {
        if (this.login.equals(login) && this.senha.equals(senha)) {
            return true;  // Login e senha corretos
        } else {
            return false; // Login ou senha incorretos
        }
    }
}
    
    
    
    
    
    
    
    
    
    

