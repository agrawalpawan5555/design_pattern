package com.demo;

public class LevelThreeRequestHandler implements RequestHandler {

    private RequestHandler nextHandler;
    @Override
    public void handleRequest(String requestType) {
        if (requestType.equals("critical")) {
            System.out.println("Critical Request");
        }
        else {
            System.out.println("This request can not be processed");
        }
    }
    public void setNextHandler(RequestHandler nextHandler) {
        this.nextHandler = nextHandler;
    }
}