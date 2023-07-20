import java.awt.event.ActionEvent;


public class Conversor extends MultiConversor{
	public static void main(String[] args) {
		MultiConversor conversor = new MultiConversor() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String convertMoedasTo = super.convertMoedasTo.getSelectedItem().toString();
				String convertMoedasFrom = super.convertMoedasFrom.getSelectedItem().toString();
				String convertTempTo = super.convertTempTo.getSelectedItem().toString();
				String convertTempFrom = super.convertTempFrom.getSelectedItem().toString();
				GetBidValue getBid = new GetBidValue();
				
				try {
					if (e.getSource() == super.btnConvertMoedas) {
						if (convertMoedasTo != convertMoedasFrom) {
							double inputMoedas = Double.parseDouble(super.inputMoedas.getText());
							
							double bid = getBid.getBid(convertMoedasTo, convertMoedasFrom);
							double valorConvertido = inputMoedas * bid;
							String s = Double.toString(valorConvertido);
							int result = s.indexOf(".");
							String output = s.substring(0, result+3);
							super.outputMoedas.setText(output + " " + convertMoedasTo);
							super.lblErrorMoedas.setText("");
						}else {
							super.lblErrorMoedas.setText("Não é possivel converter " + convertMoedasFrom + " para " + convertMoedasTo);
						}
					}
				} catch (Exception e2) {
					super.lblErrorMoedas.setText(e2.getMessage());
				}
				
				try {
					if (e.getSource() == super.btnConvertTemp) {
						if (convertTempTo != convertTempFrom) {
							double inputTemp = Double.parseDouble(super.inputTemp.getText());
							double temp = getBid.getTemperatura(convertTempTo, convertTempFrom, inputTemp);
							String s = Double.toString(temp);
							super.outputTemp.setText(s + " " + convertTempTo);
							super.lblErrorTemp.setText("");
						}else {
							super.lblErrorTemp.setText("Não é possivel converter " + convertTempFrom + " para " + convertTempTo);
						}
					} 
				} catch (Exception e2) {
					super.lblErrorTemp.setText(e2.getMessage());
				}
			 }
			};
		};

	@Override
	public void actionPerformed(ActionEvent e) {

	}
}

