package com.alticelabs.ccp.exagon;

import com.alticelabs.ccp.exagon.divine_pride.info.DivinePrideInfo;
import com.alticelabs.ccp.exagon.divine_pride.model.DivinePrideItemResponse;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {

        String itemId = args[0];

        String URL = DivinePrideInfo.URL + itemId + DivinePrideInfo.apiKey;

        HttpClient client = HttpClient.newHttpClient();

        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(URL))
                .GET()
                .header("Accept-Language", "pt-BR")
                .build();

        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString(StandardCharsets.UTF_8));

        ObjectMapper objectMapper = new ObjectMapper();

        DivinePrideItemResponse item = objectMapper.readValue(response.body(), DivinePrideItemResponse.class);

        System.out.println(response.body());
    }
}