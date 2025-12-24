package com.demo;

public class LevelOneRequestHandler implements RequestHandler {

    private RequestHandler nextHandler;
    @Override
    public void handleRequest(String requestType) {
        if (requestType.equals("basic")) {

            System.out.println("Basic Request");
        }
        else {
            nextHandler.handleRequest(requestType);
        }
    }

    @Override
    public void setNextHandler(RequestHandler nextHandler) {
        this.nextHandler = nextHandler;
    }
}
