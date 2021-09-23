package br.com.bandtec.services;

import br.com.bandtec.models.RamModel;
import com.github.britooo.looca.api.group.memoria.Memoria;
import com.github.britooo.looca.api.util.Conversor;

public class RamService {

    Conversor converter = new Conversor();
    Memoria mem = new Memoria();
    RamModel ramModel = new RamModel();
    Long getMem = getMemEmUso();

    public Long getRamData(){
        ramModel.setRamData(getMem);
        return ramModel.getRamData();
    }

    public String getProcessedRam(){
        return converter.formatarBytes(this.getRamData());
    }

    public Long getMemEmUso(){
        return mem.getEmUso();
    }
}
