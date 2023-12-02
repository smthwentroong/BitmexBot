package kirill.kopienko.bitmexbot.service;

import kirill.kopienko.bitmexbot.util.Signature;
import lombok.RequiredArgsConstructor;

import java.net.http.HttpClient;
@RequiredArgsConstructor
public class BitmexClient {
    private final HttpClient httpClient = HttpClient.newBuilder().build();
    private final String baseUrl;
    private final boolean isReal;
    private final Signature signature = new Signature();

    private void sendRequest() {

    }

    private void cancelOrder() {

    }
}
