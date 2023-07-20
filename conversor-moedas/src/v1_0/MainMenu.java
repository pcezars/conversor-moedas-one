package v1_0;

import v1_0.currency.SelectMoedas;
import v1_0.medidas.SelectMedidas;

import javax.swing.*;

public class MainMenu {
    public static void main(String[] args) {
        Object[] options = {"Conversor de Moedas", "Conversor de Medidas"};

        /**
         * Inicializa o programa
         * Define o Conversor e a ser executado
         * Chama o conversor com tratativa de erro.
         */
        Object valorSelecionado = JOptionPane.showInputDialog(null,
                "Escolha uma Opção", "Bem vindo ao Conversor!",
                JOptionPane.INFORMATION_MESSAGE, null,
                options, options[0]);

        try{
            if (valorSelecionado == options[0]){
                new SelectMoedas();
            } else if (valorSelecionado == options[1]) {
                new SelectMedidas();
            }
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, "Digite um valor válido.");
        }finally {
            /**
             * Chama a ultima janela, solicitando a escolha do usuario
             * de continuar no programa ou não
             */
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
