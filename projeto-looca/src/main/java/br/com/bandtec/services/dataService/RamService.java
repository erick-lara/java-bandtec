package br.com.bandtec.services.dataService;

import com.github.britooo.looca.api.group.memoria.Memoria;

public class RamService {
    Memoria mem = new Memoria();

    public Double getMemEmUso(){
        return mem.getEmUso().doubleValue();
    }

    public Double processRam(){
        return getMemEmUso() / 1073741824L;
    }
}
