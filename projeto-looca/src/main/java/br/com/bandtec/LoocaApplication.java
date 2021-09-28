package br.com.bandtec;

import br.com.bandtec.controllers.RamController;
import br.com.bandtec.models.RamModel;
import com.github.britooo.looca.api.core.Looca;

import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;

public class LoocaApplication {
    public static void main(String[] args) {
        RamController ramController = new RamController();
        Looca teste = new Looca();

        System.out.println(teste.getMemoria());
        System.out.println(ramController.getRamData());





    }
}
