package br.com.bandtec.models;

public class RamModel {
    public Long ramData;

    public RamModel( Long ramData) {
        this.ramData = ramData;
    }

    public RamModel() {
    }

    public Long getRamData() {
        return ramData;
    }

    public void setRamData(Long ramData) {
        this.ramData = ramData;
    }

    @Override
    public String toString() {
        return "ramData : " + getRamData() + "\n";
    }
}
