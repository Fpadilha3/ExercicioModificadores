
package exercicio8;


public class Porta {
    
    
   

    private boolean aberta;  // atributo privado

    // Método para abrir a porta
    public void abrir() {
        if (!aberta) {
            aberta = true;
            System.out.println("Porta aberta.");
        } else {
            System.out.println("A porta já está aberta.");
        }
    }

    // Método para fechar a porta
    public void fechar() {
        if (aberta) {
            aberta = false;
            System.out.println("Porta fechada.");
        } else {
            System.out.println("A porta já está fechada.");
        }
    }

    // Método para consultar o estado da porta
    public boolean isAberta() {
        return aberta;
    }
}
    
    
    
    
    
    
    
    
    
