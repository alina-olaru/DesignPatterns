package com.company;

public class Asistenta extends Handler {

    @Override
    public void handleRequest(Request request) {
        if(request.getRequestType()==RequestType.CONSULT_SUPERFICIAL){
            System.out.println("Asistenta poate face consultatii superificale");
        }
        else{
            successor.handleRequest(request);
        }
    }
}
