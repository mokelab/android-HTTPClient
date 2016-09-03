package com.mokelab.http;

/**
 * HTTP client
 */
public interface HTTPClient {

    interface Callback {
        void done(HTTPResponse response, HTTPException exception);
    }

    void send(Method method, String url, Header header, String body, Callback callback);
}
