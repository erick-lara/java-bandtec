package br.com.bandtec.models;

public class RamModel {
    private Double ramData;

    public RamModel( Double ramData) {
        this.ramData = ramData;
    }

    public RamModel() {
    }

    public Double getRamData() {
        return ramData;
    }

    public void setRamData(Double ramData) {
        this.ramData = ramData;
    }

    @Override
    public String toString() {
        return "ramData : " + getRamData() + "\n";
    }
}
