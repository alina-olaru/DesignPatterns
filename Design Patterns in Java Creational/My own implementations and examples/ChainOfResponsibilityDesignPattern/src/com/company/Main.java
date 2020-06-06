package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Asistenta asistenta=new Asistenta();
        Medic_general medic_general = new Medic_general();
        Medic_sef_sectie medic_sef_sectie = new Medic_sef_sectie();
        Medic_specialist medic_specialist = new Medic_specialist();
        Rezident rezident=new Rezident();


        rezident.setSuccessor(asistenta);
        asistenta.setSuccessor(medic_general);
        medic_general.setSuccessor(medic_specialist);
        medic_specialist.setSuccessor(medic_sef_sectie);

        Request request = new Request(RequestType.CONSULT_SPECIALITATE);
        medic_specialist.handleRequest(request);
        rezident.handleRequest(request);
        medic_sef_sectie.handleRequest(request);
    }
}
