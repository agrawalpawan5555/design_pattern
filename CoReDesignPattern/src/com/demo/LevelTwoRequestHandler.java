package com.demo;

public class LevelTwoRequestHandler implements RequestHandler {

    private RequestHandler nextHandler;

    @Override
    public void handleRequest(String requestType) {
        if (requestType.equals("Intermediate")) {

            System.out.println("Intermediate Request");
        }
        else {
            nextHandler.handleRequest(requestType);

        }
    }
    public void setNextHandler(RequestHandler nextHandler) {
        this.nextHandler = nextHandler;
    }
}