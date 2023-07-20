package br.com.loja.http;

import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Map;

public class JavaHttpClient implements HttpAdapter {

	@Override
	public void post(String url, Map<String, Object> dados) {
		try {
			// Implementação simbolica para envio do request usando URLConnection
			URL apiUrl = new URL(url);
			URLConnection connection = apiUrl.openConnection();
			connection.connect();

		} catch (IOException e) {
			throw new RuntimeException("Erro ao enviar requisição HTTP", e);
		}
	}

}
