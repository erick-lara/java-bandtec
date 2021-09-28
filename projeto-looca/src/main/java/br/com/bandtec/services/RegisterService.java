package br.com.bandtec.services;

import br.com.bandtec.models.RamModel;
import br.com.bandtec.services.dataService.RamService;
import com.github.britooo.looca.api.group.memoria.Memoria;

public class RegisterService {
    RamModel ramModel = new RamModel();
    RamService ramService = new RamService();

    public Double setValues(){
        Double test = ramService.processRam();
        ramModel.setRamData(test);

        return ramModel.getRamData();
    }
}
