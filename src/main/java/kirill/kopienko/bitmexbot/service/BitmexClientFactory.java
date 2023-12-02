package kirill.kopienko.bitmexbot.service;

import kirill.kopienko.bitmexbot.util.Endpoints;

public class BitmexClientFactory {
    public BitmexClient newTestnetBitmexClient() {
        return new BitmexClient(Endpoints.BASE_TEST_URL, false);
    }

    public BitmexClient newBitmexClient() {
        return new BitmexClient(Endpoints.BASE_REAL_URL, true);
    }
}
