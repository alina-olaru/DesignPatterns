package com.company;

public class Medic_general extends Handler {
    @Override
    public void handleRequest(Request request) {
        if(request.getRequestType()==RequestType.CONSULT_URGENTE){
            System.out.println("Medicul general poate face consultatii superificale");
        }
        else{
            successor.handleRequest(request);
        }
    }
}
