package br.com.challenge.conversor.modelo.services;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

import com.google.gson.Gson;

import br.com.challenge.conversor.modelo.entities.Moeda;

public class ServiceValorMoeda {

	private String webService = "https://economia.awesomeapi.com.br/json/";

	public Moeda valorMoeda(String moeda) {
		try {
			URL url = new URL(webService + moeda);
			URLConnection con = url.openConnection();
			InputStream is = con.getInputStream();
			BufferedReader br = new BufferedReader(new InputStreamReader(is, "UTF-8"));
			
			String moedaDados;
			String jsonMoeda = "";
			while ((moedaDados = br.readLine()) != null) {
				jsonMoeda += moedaDados;
			}
			
			jsonMoeda = jsonMoeda.toString().replaceAll("[\\[\\]]","");
			
			Moeda moedaJson = new Gson().fromJson(jsonMoeda, Moeda.class);
			
			return new Moeda(moedaJson.getBid());
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
		return null;
	}
}
