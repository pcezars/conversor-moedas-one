import java.awt.event.ActionEvent;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;
import java.util.List;
import java.util.Map;

public class GetBidValue {
	
	String url = "https://economia.awesomeapi.com.br/last/";
	String url2 = "https://congen-temperature-converter-v1.p.rapidapi.com/convert?";
	double resultado;
	
	public double getBid(String t, String f) {
		var client = HttpClient.newHttpClient();
		
		URI endereco = URI.create(url + t + "-" + f);
		
		var request = HttpRequest.newBuilder(endereco)
				.GET()
				.build();
		HttpResponse<String> response = null;
		try {
			response = client.send(request, BodyHandlers.ofString());
		} catch (IOException | InterruptedException e1) {
			e1.printStackTrace();
		}
		String body = response.body();
		
		//extrair dados
		JsonParser parser = new JsonParser();
		List<Map<String, String>> dados = parser.parse(body);
		
		//exibir
		for (Map<String, String> currency : dados) {
			resultado = Double.parseDouble(currency.get("bid"));
		}
		return resultado;
	}
	
	public double getTemperatura(String t, String f, double d) throws IOException, InterruptedException {
		
		String query = f + " para " + t;
		
		switch (query) {
		case "Celsius para Fahrenheit": {
			resultado = d * 1.8000 + 32;
			return resultado;
		}case "Celsius para Kelvin": {
			resultado = d + 273.15;
			return resultado;
		}case "Fahrenheit para Celsius": {
			resultado = (d - 32) / 1.8000;
			return resultado;
		}case "Fahrenheit para Kelvin": {
			resultado = (d - 32) / 1.8000 + 273.15;
			return resultado;
		}case "Kelvin para Celsius": {
			resultado = d - 273.15;
			return resultado;
		}case "Kelvin para Fahrenheit": {
			resultado = (d - 273.15) * 1.8000 + 32;
			return resultado;
		}
		
		default:
			throw new IllegalArgumentException("Unexpected value: " + query);
		}
		
	}
	

}
