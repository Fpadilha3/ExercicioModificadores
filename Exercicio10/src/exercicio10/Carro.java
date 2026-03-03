
package exercicio10;


public class Carro {
    
  

    private String marca;
    private String modelo;
    public int ano;  // atributo público

    // Getter e Setter para marca
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    // Getter e Setter para modelo
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    // Setter para ano com validação
    public void setAno(int ano) {
        if (ano >= 1886) {  // validação do primeiro automóvel
            this.ano = ano;
        } else {
            System.out.println("Ano inválido! Deve ser 1886 ou posterior.");
        }
    }

    // Getter para ano (opcional, já que ano é público)
    public int getAno() {
        return ano;
    }
}
    

