import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTabbedPane;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.BoxLayout;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.Color;
import javax.swing.DefaultComboBoxModel;

public abstract class MultiConversor extends JFrame implements ActionListener{

	private JPanel contentPane;
	protected JTextField inputMoedas;
	protected JTextField outputMoedas;
	private String[] moedas = {"BRL", "USD", "EUR", "GBP", "ARS", "CLP"};
	private String[] temperaturas = {"Celsius", "Fahrenheit",  "Kelvin"};
	protected JTextField inputTemp;
	protected JTextField outputTemp;
	public JComboBox convertMoedasTo;
	public JComboBox convertMoedasFrom;
	protected JButton btnConvertMoedas;
	protected JComboBox convertTempTo;
	protected JComboBox convertTempFrom;
	protected JButton btnConvertTemp;
	protected JLabel lblErrorMoedas;
	protected JLabel lblErrorTemp;
	


	public MultiConversor() {
		setTitle("Multi-Conversores");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 400, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new BoxLayout(contentPane, BoxLayout.X_AXIS));
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		contentPane.add(tabbedPane);
		
		JPanel conversorMoedas = new JPanel();
		tabbedPane.addTab("Conversor de Moedas", null, conversorMoedas, null);
		conversorMoedas.setLayout(null);
		
		JLabel moedasIcon = new JLabel("");
		moedasIcon.setHorizontalAlignment(SwingConstants.CENTER);
		moedasIcon.setIcon(new ImageIcon(MultiConversor.class.getResource("/imgs/icon1.png")));
		moedasIcon.setBounds(132, 11, 100, 100);
		conversorMoedas.add(moedasIcon);
		
		inputMoedas = new JTextField();
		inputMoedas.setBounds(26, 153, 239, 34);
		conversorMoedas.add(inputMoedas);
		inputMoedas.setColumns(10);
		
		
		convertMoedasTo = new JComboBox(moedas);
		convertMoedasTo.setBounds(275, 212, 84, 34);
		conversorMoedas.add(convertMoedasTo);
		
		convertMoedasFrom = new JComboBox(moedas);
		convertMoedasFrom.setBounds(275, 153, 84, 34);
		conversorMoedas.add(convertMoedasFrom);
		
		outputMoedas = new JTextField();
		outputMoedas.setEditable(false);
		outputMoedas.setForeground(new Color(0, 128, 0));
		outputMoedas.setFont(new Font("Tahoma", Font.BOLD, 12));
		outputMoedas.setColumns(10);
		outputMoedas.setBounds(26, 212, 239, 34);
		conversorMoedas.add(outputMoedas);
		
		btnConvertMoedas = new JButton("Converter");
		btnConvertMoedas.setBounds(132, 277, 100, 35);
		btnConvertMoedas.addActionListener(this);
		conversorMoedas.add(btnConvertMoedas);
		
		JLabel lblNewLabel = new JLabel("Valor a ser convertido:");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel.setBounds(26, 132, 166, 21);
		conversorMoedas.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("De:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_1.setBounds(275, 135, 46, 14);
		conversorMoedas.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Para:");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_1_1.setBounds(275, 194, 46, 14);
		conversorMoedas.add(lblNewLabel_1_1);
		
		JLabel lblValorConvertido = new JLabel("Valor convertido:");
		lblValorConvertido.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblValorConvertido.setBounds(26, 191, 166, 21);
		conversorMoedas.add(lblValorConvertido);
		
		lblErrorMoedas = new JLabel("");
		lblErrorMoedas.setHorizontalAlignment(SwingConstants.CENTER);
		lblErrorMoedas.setFont(new Font("Tahoma", Font.ITALIC, 11));
		lblErrorMoedas.setForeground(new Color(255, 0, 0));
		lblErrorMoedas.setBounds(26, 252, 333, 14);
		conversorMoedas.add(lblErrorMoedas);
		
		JPanel conversorTemperaturas = new JPanel();
		conversorTemperaturas.setLayout(null);
		tabbedPane.addTab("Conversor de Temperaturas", null, conversorTemperaturas, null);
		
		JLabel iconTemp = new JLabel("");
		iconTemp.setIcon(new ImageIcon(MultiConversor.class.getResource("/imgs/icon2.png")));
		iconTemp.setHorizontalAlignment(SwingConstants.CENTER);
		iconTemp.setBounds(132, 11, 100, 100);
		conversorTemperaturas.add(iconTemp);
		
		inputTemp = new JTextField();
		inputTemp.setColumns(10);
		inputTemp.setBounds(26, 153, 239, 34);
		conversorTemperaturas.add(inputTemp);
		
		convertTempTo = new JComboBox(temperaturas);
		convertTempTo.setBounds(275, 212, 84, 34);
		conversorTemperaturas.add(convertTempTo);
		
		convertTempFrom = new JComboBox(temperaturas);
		convertTempFrom.setBounds(275, 153, 84, 34);
		conversorTemperaturas.add(convertTempFrom);
		
		outputTemp = new JTextField();
		outputTemp.setForeground(new Color(0, 128, 0));
		outputTemp.setFont(new Font("Tahoma", Font.BOLD, 12));
		outputTemp.setEditable(false);
		outputTemp.setColumns(10);
		outputTemp.setBounds(26, 212, 239, 34);
		conversorTemperaturas.add(outputTemp);
		
		btnConvertTemp = new JButton("Converter");
		btnConvertTemp.setBounds(132, 277, 100, 35);
		btnConvertTemp.addActionListener(this);
		conversorTemperaturas.add(btnConvertTemp);
		
		JLabel lblNewLabel_2 = new JLabel("Valor a ser convertido:");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_2.setBounds(26, 132, 166, 21);
		conversorTemperaturas.add(lblNewLabel_2);
		
		JLabel lblNewLabel_1_2 = new JLabel("De:");
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_1_2.setBounds(275, 135, 46, 14);
		conversorTemperaturas.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Para:");
		lblNewLabel_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_1_1_1.setBounds(275, 194, 46, 14);
		conversorTemperaturas.add(lblNewLabel_1_1_1);
		
		JLabel lblValorConvertido_1 = new JLabel("Valor convertido:");
		lblValorConvertido_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblValorConvertido_1.setBounds(26, 191, 166, 21);
		conversorTemperaturas.add(lblValorConvertido_1);
		
		lblErrorTemp = new JLabel("");
		lblErrorTemp.setHorizontalAlignment(SwingConstants.CENTER);
		lblErrorTemp.setForeground(Color.RED);
		lblErrorTemp.setFont(new Font("Tahoma", Font.ITALIC, 11));
		lblErrorTemp.setBounds(26, 257, 333, 14);
		conversorTemperaturas.add(lblErrorTemp);
		
		this.setVisible(true);
		this.setLocationRelativeTo(null);
	}
}
