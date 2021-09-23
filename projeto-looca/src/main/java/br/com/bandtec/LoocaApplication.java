package br.com.bandtec;

import br.com.bandtec.controllers.RamController;
import com.github.britooo.looca.api.core.Looca;

import java.util.Timer;
import java.util.TimerTask;

public class LoocaApplication {
    public static void main(String[] args) {

        Timer timer = new Timer();
        RamController ramController = new RamController();
        Looca teste = new Looca();

        int delay = 0;
        int interval = 1000;

        timer.scheduleAtFixedRate(new TimerTask() {
            public void run() {
                System.out.println(ramController.getRamData());
            }
        }, delay, interval);





    }
}
