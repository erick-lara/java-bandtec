package com.ericklara.listaexercicios1;

import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) {
        Scanner numReader = new Scanner(System.in);

        Double elevatorLimitWeight;
        Integer elevatorLimitPeople;
        Double[] peopleWeight = new Double[3];
        Double totalWeight = 0.0;

        System.out.println("Enter the elevator weight limit: ");
        elevatorLimitWeight = numReader.nextDouble();

        System.out.println("Enter the max number of people in the elevator: ");
        elevatorLimitPeople = numReader.nextInt();

        for (int i = 0; i < peopleWeight.length; i++) {
            System.out.println("Enter the weight of the " + (i + 1) + "th people");
            peopleWeight[i] = numReader.nextDouble();
            totalWeight = totalWeight + peopleWeight[i];
        }

        System.out.printf("Three people entered the elevator, which fits %s people" +
                "\nThe total weight on the elevator is %.2f, as it supports %.2f",
                elevatorLimitPeople,
                totalWeight,
                elevatorLimitWeight
                );

    }
}
