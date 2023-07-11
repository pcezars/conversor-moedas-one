import currency.Conversor;
import currency.SelectMoedas;

import javax.swing.*;

public class MainMenu {
    public static void main(String[] args) {
        Object[] options = {"Conversor de Moedas", "Em Breve outra opção"};

        Object valorSelecionado = JOptionPane.showInputDialog(null,
                "Escolha uma Opção", "Bem vindo ao Conversor!",
                JOptionPane.INFORMATION_MESSAGE, null,
                options, options[0]);

        try{
            if (valorSelecionado == options[0]){
                new SelectMoedas();
            } else if (valorSelecionado == options[1]) {
                JOptionPane.showMessageDialog(null, "Essa função será adicionada em breve");
            }
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, "Digite um valor válido.");
        }finally {
            int fim = JOptionPane.showConfirmDialog(null, "Deseja continuar? ", "Deseja Continuar?",
                    JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE);
            if (fim == 1){
                JOptionPane.showMessageDialog(null, "Programa finalizado.");
            } else if (fim == 2) {
                JOptionPane.showMessageDialog(null, "Programa Concluido.");
            }else {
                main(args);
            }
            //0 yes
            //1 no
            //2 cancel
        }
    }
}
