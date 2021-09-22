package com.br.bandtec.projeto.poo.exercicios;

public class Encomenda {

    private String tamanho;
    private String enderecoRemetente;
    private String enderecoDestinatario;
    private Double distancia;
    private Double valorEncomenda;
    public Double totalFrete = 0.0;

    public Encomenda(
            String tamanho,
            String enderecoRemetente,
            String enderecoDestinatario,
            Double distancia,
            Double valorEncomenda
    ) {
        this.tamanho = tamanho;
        this.enderecoRemetente = enderecoRemetente;
        this.enderecoDestinatario = enderecoDestinatario;
        this.distancia = distancia;
        this.valorEncomenda = valorEncomenda;
    }

    public Double getValorEncomenda() {
        return valorEncomenda;
    }

    public String getTamanho() {
        return tamanho;
    }

    public String getEnderecoRemetente() {
        return enderecoRemetente;
    }

    public String getEnderecoDestinatario() {
        return enderecoDestinatario;
    }

    public Double getDistancia() {
        return distancia;
    }

    public Double totalValue(){
        return getValorEncomenda() + totalFrete;
    }

    public String toString() {
        return "***** ETIQUETA PARA ENVIO *****\n" +
                "Endereço do remetente: " + getEnderecoRemetente() + "\n" +
                "Endereço do destinatário: " + getEnderecoDestinatario() + "\n" +
                "Tamanho: " + getTamanho() + "\n" +
                "---------------------------------- \n" +
                "Valor da Encomenda: " + getValorEncomenda() + "\n" +
                "Valor do Frete: " + totalFrete + "\n" +
                "---------------------------------- \n" +
                "Valor total: R$" + totalValue();
    }

    public void calcularFreteTamanho(String tamanho){
        switch (tamanho){
            case "P":
                totalFrete = valorEncomenda * 0.01;
                break;
            case "M":
                totalFrete = valorEncomenda * 0.03;
                break;
            case "G":
                totalFrete = valorEncomenda * 0.05;
                break;
            default:
                System.out.println("tamanho inválido");
                break;
        }
    }

    public void calcFreteDist(Double distancia){
        if(distancia <= 50){
            totalFrete += 3.0;
        }else if(distancia > 50 && distancia <= 200){
            totalFrete += 5.0;
        } else {
            totalFrete += 7.0;
        }
    }

    public void calcularFreteTotal(String tamanho, Double distancia){

        valorEncomenda = getValorEncomenda();

        calcularFreteTamanho(tamanho);
        calcFreteDist(distancia);
    }

    public String emitirEtiqueta(){
        calcularFreteTotal(this.getTamanho(), this.getDistancia());
        return toString();
    }
}
