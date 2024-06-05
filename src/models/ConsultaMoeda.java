package src.models;

import com.google.gson.Gson;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsultaMoeda {
    public void realizaConsulta(DuplaDeMoedas duplaDeMoedas) {
        URI endereco = URI.create(String.format("https://v6.exchangerate-api.com/v6/0a3498a09e2c00a66807be66/pair/" +
                "%s/%s/%f", duplaDeMoedas.moeda1base(), duplaDeMoedas.moeda2target(), duplaDeMoedas.quantidade()));

        try {
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(endereco)
                    .build();
            HttpResponse<String> response = HttpClient.newHttpClient()
                    .send(request, HttpResponse.BodyHandlers.ofString());
            Gson gson = new Gson();
            ApiResponse apiResponse = gson.fromJson(response.body(), ApiResponse.class);
            System.out.println(duplaDeMoedas.moeda1base() + " " + duplaDeMoedas.quantidade()
                    + " em " + duplaDeMoedas.moeda2target() + " é: " + apiResponse.conversion_result());
        } catch (Exception e) {
            throw new RuntimeException("Não foi possível retornar informações da conversão...");
        }
    }
}
