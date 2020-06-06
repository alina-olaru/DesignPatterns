package com.company;

public class Rezident extends Handler {
    @Override
    public void handleRequest(Request request) {
        if(request.getRequestType()==RequestType.RECOLTARE_ANALIZE){
            System.out.println("Rezidentul poate RECOLTA ANALIZA");
        }
        else{
            successor.handleRequest(request);
        }
    }
}
