package org.example;

import com.google.gson.Gson;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsultarMoneda {
    public Moneda buscarMoneda(String monedaInicial, String monedaFinal){
        URI direccion = URI.create("https://v6.exchangerate-api.com/v6/a9316271c2511b08644363ad/pair/"+monedaInicial+"/"+monedaFinal);

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(direccion)
                .build();

        try{
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
            return new Gson().fromJson(response.body(), Moneda.class);
        }catch (Exception e){
            throw new RuntimeException("No encontre la Moneda");
        }
    }
}
