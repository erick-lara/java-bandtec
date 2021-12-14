package com.bandtec.projeto.lista.desafio;

import java.util.*;

public class ListaUtil {

    private List<Integer> inteiros;

    public ListaUtil() {
        this.inteiros = new ArrayList<>();
    }

    public void add(Integer i){
        if(i != null)
            this.inteiros.add(i);
    }
    
    public void remove(Integer i){
        if(i == null){
            
        } else {
            this.inteiros.remove(i);
        }
    }
    
    public Integer count(){
        return this.inteiros.size();
    }
    
    public Integer countPares(){
        
        Integer count = 0;
        if(inteiros.isEmpty()){
            return 0;
        } else {
            for(Integer inter: inteiros){
                if(inter % 2 == 0){
                    count++;
                }
            }
            return count;
        }
    }
    
    public Integer countImpares(){
        
        Integer count = 0;
        if(inteiros.isEmpty()){
            return 0;
        } else {
            for(Integer inter: inteiros){
                if(inter % 2 != 0){
                    count++;
                }
            }
            return count;
        }
    }
    
    public Integer somar(){
        if(inteiros.isEmpty()){
            return 0;
        } else {
            return inteiros.stream().mapToInt(Integer::intValue).sum();
        }
    }
    
    public Integer getMaior(){
        if(inteiros.isEmpty()){
            return 0;
        } else {
            return inteiros.stream().mapToInt(Integer::intValue).max().getAsInt();
        }
    }
    
    public Integer getMenor(){
        if(inteiros.isEmpty()){
            return 0;
        } else {
            return inteiros.stream().mapToInt(Integer::intValue).min().getAsInt();
        }
    }
    
    public Boolean hasDuplicidade(){
        Set<Integer> set = new HashSet<Integer>(inteiros);

        return set.size() < inteiros.size();
    }
}
