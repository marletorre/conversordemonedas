package modelos;


import com.google.gson.Gson;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class MetodosUtiles {

    public static String menu() {
        return """
                 ******************************************
                 Sea Bienvenido/a al Conversor de Moneda =]
                 1) Dolar =>> Peso Argentino
                 2) Peso Argentino =>> Dolar
                 3) Dolar =>> Real Brasileño
                 4) Real Brasileño =>> Dolar
                 5) Dolar =>> Peso Colombiano
                 6) Peso Colombiano =>> Dolar
                 7) Salir
                 Elija una opción válida:
                *****************************************""";
    }

    public static TipoCambio conversionElegida(String direccion) throws IOException, InterruptedException {

            HttpClient cliente = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(direccion))
                    .build();
            try{
            HttpResponse<String> response = cliente
                    .send(request, HttpResponse.BodyHandlers.ofString());
            String json = response.body();
            Gson gson = new Gson();
            TipoCambioRegistro conversion = gson.fromJson(json, TipoCambioRegistro.class);
            return new TipoCambio(conversion);
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException("Ocurrió un error ");
        }
    }






}


