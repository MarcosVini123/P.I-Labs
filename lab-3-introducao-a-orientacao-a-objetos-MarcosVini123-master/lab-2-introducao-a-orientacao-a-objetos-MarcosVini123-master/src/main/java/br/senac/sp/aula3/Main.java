/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senac.sp.aula3;

import javax.swing.JOptionPane;

/**
 *
 * @author fernando.fernandes
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Carro carro1 = new Carro();
       carro1.setModelo("LamborghiniVeneno");
    
       Carro tipoRodizio = new Carro();
       tipoRodizio.setModelo("LamborghiniAventador");
       tipoRodizio.setCor("Amarelo");
       tipoRodizio.acelerar();
      JOptionPane.showMessageDialog(this, "Modelo: " + tipoRodizio.getModelo() + ", Cor: "
              + tipoRodizio.getCor());
    }
}
