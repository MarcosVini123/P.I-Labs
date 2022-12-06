package br.senac.sp.aula3;

public class Carro {
    
    private static String Frabricante = "Lamborghini";
        
        private String[] Rodas;
        private String cor;
        private String modelo;
        private int velocidadeAtual; 
        
    public Carro(){

    }

    public String[] getRodas() {
        return Rodas;
    }

    public void setRodas(String[] Esportiva14) {
        this.Rodas = Esportiva14;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String amarelo) {
        this.cor = amarelo;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String lamborghiniAventador) {
        this.modelo = lamborghiniAventador;
    }
    
    public void acelerar(){
        this.velocidadeAtual+=10;
    }

    public void acelerar(int numVelocidade){
          this.velocidadeAtual+=numVelocidade;
    }

    public void frear(){
        this.velocidadeAtual-=10;
    }
}
