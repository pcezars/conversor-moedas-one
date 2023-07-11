package medidas;

import javax.swing.*;

public class ConverterMedidas {
    public ConverterMedidas(){
    }
    String variavel;
    double valor;
    double resultado;

    public ConverterMedidas(Object opt, double value) {
        this.variavel = (String) opt;
        this.valor = value;
    }

    public double calculaConversao(){
        switch (variavel){
            case "Metro para Centímetros":
                resultado = valor / 0.01;
                JOptionPane.showMessageDialog(null, resultado + " cm.");
                break;
            case "Metro para Quilômetros":
                resultado = valor / 1000;
                JOptionPane.showMessageDialog(null, resultado + " Km.");
                break;
            case "Metro para Milímetro":
                resultado = valor / 0.001;
                JOptionPane.showMessageDialog(null, resultado + " mm.");
                break;
            case "Metro para Milha":
                resultado = valor *  0.00062137;
                JOptionPane.showMessageDialog(null, resultado + " mi.");
                break;
            case "Metro para Jardas":
                resultado = valor * 1.0936;
                JOptionPane.showMessageDialog(null, resultado + " yd.");
                break;
            case "Centímetros para Metro":
                resultado = valor / 100.0;
                JOptionPane.showMessageDialog(null, resultado + " mts.");
                break;
            case "Quilômetros para Metro":
                resultado = valor / 0.0010000;
                JOptionPane.showMessageDialog(null, resultado + " mts.");
                break;
            case "Milímetro para Metro":
                resultado = valor / 1000.0;
                JOptionPane.showMessageDialog(null, resultado + " mts.");
                break;
            case "Milha para Metro":
                resultado = valor / 0.00062137;
                JOptionPane.showMessageDialog(null, resultado + " mts.");
                break;
            case "Jardas para Metro":
                resultado = valor / 1.0936;
                JOptionPane.showMessageDialog(null, resultado + " mts.");
                break;
        } return resultado;
    }
}
