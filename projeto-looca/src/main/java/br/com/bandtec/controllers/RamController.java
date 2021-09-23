package br.com.bandtec.controllers;

import br.com.bandtec.services.RamService;

public class RamController {

    RamService service = new RamService();

    public String getRamData(){
        try {
            return service.getProcessedRam();

        } catch (IndexOutOfBoundsException e){

            return e.toString();
        }
    }
}
