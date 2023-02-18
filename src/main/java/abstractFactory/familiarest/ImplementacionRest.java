package abstractFactory.familiarest;

import abstractFactory.servicios.IServiciosRest;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ImplementacionRest implements IServiciosRest {
    private HttpClient httpClient = HttpClient.newBuilder()
            .version(HttpClient.Version.HTTP_2).build();
    @Override
    public String getJson() throws IOException, InterruptedException {
        final HttpRequest requestPosts = HttpRequest.newBuilder()
                .GET()
                .uri(URI.create("https://fcc-weather-api.glitch.me/api/current?lat=35&lon=139"))
                .build();
        final HttpResponse<String> response = httpClient.send(requestPosts,HttpResponse.BodyHandlers.ofString());
        return response.body();
    }
}
