package br.com.bandtec.controllers;

import br.com.bandtec.services.RegisterService;

public class RamController {

    RegisterService service = new RegisterService();

    public Double getRamData(){
        return service.setValues();
    }
}
