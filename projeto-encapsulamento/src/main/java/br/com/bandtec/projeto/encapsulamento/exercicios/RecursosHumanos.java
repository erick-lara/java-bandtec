package br.com.bandtec.projeto.encapsulamento.exercicios;

public class RecursosHumanos {
    
    private Integer promoted;
    private Integer adjusted;
    
    public RecursosHumanos(){
        this.adjusted = 0;
        this.promoted = 0;
    }
    
    public Double adjustPayment(Colaborador colaborator, Double adjust){
        Double payment = colaborator.getPayment();
        this.adjusted += 1;
        payment += payment * adjust;
        return payment;
    }
    
    public void promoteEmployee(Colaborador colaborator, String job){
        colaborator.getName();
        colaborator.setJob(job);
        this.promoted += 1;
    }
    
    public void validatePromotion(
            Colaborador colaborator, 
            String newJob,
            Double adjust
    ){
        Double adjustColPayment = adjustPayment(colaborator, adjust);
        
        if(adjustColPayment > colaborator.getPayment()){
            colaborator.setPayment(adjustColPayment);
            this.promoteEmployee(colaborator, newJob);
        } else {
            
            System.out.println("operação inválida.");
        }
    }
    
    public Integer getPromoted() {
        return promoted;
    }

    public Integer getAdjusted() {
        return adjusted;
    }
}
