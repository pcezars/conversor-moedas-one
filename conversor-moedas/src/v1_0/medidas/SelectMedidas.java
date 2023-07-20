package v1_0.medidas;

import javax.swing.*;

public class SelectMedidas {
    Object[] medidas = {
            "Metro para Centímetros",
            "Metro para Quilômetros",
            "Metro para Milímetro",
            "Metro para Milha",
            "Metro para Jardas",
            "Centímetros para Metro",
            "Quilômetros para Metro",
            "Milímetro para Metro",
            "Milha para Metro",
            "Jardas para Metro"
    };

    Object menu = JOptionPane.showInputDialog(null,
            "Escolha o tipo de conversão: ", "Conversor de Moedas.", JOptionPane.INFORMATION_MESSAGE,
            null, medidas, medidas[0]);

    double value = Double.parseDouble(JOptionPane.showInputDialog("Adicione o valor a ser convertido"));

    /**
     * Recebe o input do usuario e passa como parametro
     * para o contrutor da classe Converter
     */
    ConverterMedidas option = new ConverterMedidas(menu, value);

    /**
     * Chama a classe responsavel por realizar
     * os calculos de conversão
     */
    double resultado = option.calculaConversao();
}
