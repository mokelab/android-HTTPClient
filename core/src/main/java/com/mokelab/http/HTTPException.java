package com.mokelab.http;

/**
 * Exception
 */
public class HTTPException extends Exception {

    private HTTPResponse response;

    public HTTPException() {
        super();
    }

    public HTTPException(String s) {
        super(s);
    }

    public HTTPException(Throwable throwable) {
        super(throwable);
    }

    public HTTPException(String s, Throwable throwable) {
        super(s, throwable);
    }

    public HTTPException setResponse(HTTPResponse response) {
        this.response = response;
        return this;
    }
}
