package currency;

import javax.swing.*;

public class Conversor {
    public Conversor(){
    }
    String variavel;
    double valor;
    double resultado;

    public Conversor(Object opt, double value) {
        this.variavel = (String) opt;
        this.valor = value;
    }

    public double calculaConversao(){
        switch (variavel){
            case "Real para Dólar":
                resultado = valor * 4.80;
                JOptionPane.showMessageDialog(null, "US $ " + resultado);
                break;
            case "Real para Euro":
                resultado = valor * 5.39;
                JOptionPane.showMessageDialog(null, "EUR € " + resultado);
                break;
            case "Real para Libra Esterlina":
                resultado = valor * 6.30;
                JOptionPane.showMessageDialog(null, "GBP £" + resultado);
                break;
            case "Real para Peso Argentino":
                resultado = valor * 0.019;
                JOptionPane.showMessageDialog(null, "ARS $" + resultado);
                break;
            case "Real para Peso Chileno":
                resultado = valor * 0.0060;
                JOptionPane.showMessageDialog(null, "CLP $" + resultado);
                break;
            case "Dólar para Real":
                resultado = valor / 4.80;
                JOptionPane.showMessageDialog(null, "R$ " + resultado);
                break;
            case "Euro para Real":
                resultado = valor / 5.39;
                JOptionPane.showMessageDialog(null, "R$ " + resultado);
                break;
            case "Libra Esterlina para Real":
                resultado = valor / 6.30;
                JOptionPane.showMessageDialog(null, "R$ " + resultado);
                break;
            case "Peso Argentino para Real":
                resultado = valor / 0.019;
                JOptionPane.showMessageDialog(null, "R$ " + resultado);
                break;
            case "Peso Chileno para Real":
                resultado = valor / 0.0060;
                JOptionPane.showMessageDialog(null, "R$ " + resultado);
                break;
        } return resultado;
    }
}
