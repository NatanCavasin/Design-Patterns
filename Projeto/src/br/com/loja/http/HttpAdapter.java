package br.com.loja.http;

import java.util.Map;

public interface HttpAdapter {

	public void post(String url, Map<String, Object> dados);

}
