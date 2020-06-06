package com.company;

public class Medic_specialist extends Handler {
    @Override
    public void handleRequest(Request request) {
        if(request.getRequestType()==RequestType.CONSULT_SPECIALITATE){
            System.out.println("Medicul specialist poate realiza un consult de specialitate");
        }
        else{
            successor.handleRequest(request);
        }

    }
}
