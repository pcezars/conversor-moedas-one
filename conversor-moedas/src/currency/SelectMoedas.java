package currency;

import javax.swing.*;

public class SelectMoedas{
    Object[] moedas = {
            "Real para Dólar",
            "Real para Euro",
            "Real para Libra Esterlina",
            "Real para Peso Argentino",
            "Real para Peso Chileno",
            "Dólar para Real",
            "Euro para Real",
            "Libera Esterlina para Real",
            "Peso Argentino para Real",
            "Peso Chileno para real"
    };

    Object menu = JOptionPane.showInputDialog(null,
            "Escolha o tipo de conversão: ", "Conversor de Moedas.", JOptionPane.INFORMATION_MESSAGE,
            null, moedas, moedas[0]);

    double value = Double.parseDouble(JOptionPane.showInputDialog("Adicione o valor a ser convertido"));

    Conversor option = new Conversor(menu, value);

    double resultado = option.calculaConversao();


}
