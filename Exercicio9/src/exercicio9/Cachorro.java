
package exercicio9;


public class Cachorro  extends Animal {

    // Sobrescrevendo o método protegido
    @Override
    protected void fazerSom() {
        System.out.println("Cachorro: Au Au!");
    }

    // Método público para chamar o som
    public void emitirSom() {
        fazerSom();  // acessando o método protected da superclasse
    }
}
    

