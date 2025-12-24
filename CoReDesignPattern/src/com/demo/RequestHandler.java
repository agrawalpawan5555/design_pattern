package com.demo;

public interface RequestHandler {

    void handleRequest(String requestType);
    void setNextHandler(RequestHandler requestHandler);
}
