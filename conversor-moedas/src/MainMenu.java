import javax.swing.*;

public class MainMenu {
    public static void main(String[] args) {
        Object[] options = {"Conversor de Moedas", "Em Breve outra opção"};

        Object valorSelecionado = JOptionPane.showInputDialog(null,
                "Escolha uma Opção", "Bem vindo ao Conversor!",
                JOptionPane.INFORMATION_MESSAGE, null,
                options, options[0]);
    }
}
