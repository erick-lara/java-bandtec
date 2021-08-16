package com.ericklara.listaexercicios1;

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner numReader = new Scanner(System.in);
        Scanner stringReader = new Scanner(System.in);

        Integer warmingTime;
        Integer aerobicTime;
        Integer weightTime;

        Integer lossCalWarm;
        Integer lossCalAerobic;
        Integer lossCalWeight;

        Integer totalCalorieLoss;
        Integer totalTime;

        System.out.println("Enter how long you are warming up");
        warmingTime = numReader.nextInt();

        System.out.println("Enter how long you did aerobic exercises");
        aerobicTime = numReader.nextInt();

        System.out.println("Enter how long you did weight training");
        weightTime = numReader.nextInt();

        lossCalWarm = warmingTime * 12;
        lossCalAerobic = aerobicTime * 20;
        lossCalWeight = weightTime * 25;

        totalCalorieLoss = lossCalWarm + lossCalAerobic + lossCalWeight;
        totalTime = warmingTime + aerobicTime + weightTime;

        System.out.printf("Hello George! You did a total of %s minutes of exercises and lost %s calories!",
                totalTime,
                totalCalorieLoss);
    }
}
