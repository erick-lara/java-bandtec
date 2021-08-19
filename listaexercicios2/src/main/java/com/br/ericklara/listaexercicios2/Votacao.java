package com.br.ericklara.listaexercicios2;

import java.util.Scanner;

public class Votacao {
    public static void main(String[] args) {
        Scanner voteReader = new Scanner(System.in);

        Integer studentVote;
        String favoriteFlavor = "";
        Integer mozzarella = 0;
        Integer pepperoni = 0;
        Integer fourCheeses = 0;

        System.out.println("Enter the number of your favorite Pizza :D\n" +
                "5 - Mozzarella\n" +
                "25 - Pepperoni\n" +
                "50 - Four Cheeses\n");

        for (int i = 0; i < 10; i++){

            System.out.printf("%dth student, enter your vote:%n", i + 1);
            studentVote = voteReader.nextInt();

            switch (studentVote){
                case 5:
                    mozzarella++;
                    break;
                case 25:
                    pepperoni++;
                    break;
                case 50:
                    fourCheeses++;
                    break;
            }
        }

        if (mozzarella > pepperoni && mozzarella > fourCheeses){
            favoriteFlavor = "Mozzarella";

        } else if(pepperoni > mozzarella && pepperoni > fourCheeses){
            favoriteFlavor = "Pepperoni";

        } else if (fourCheeses > mozzarella && fourCheeses > pepperoni){
            favoriteFlavor = "Four Cheeses";

        }
        System.out.printf("Poll results:%n" +
                "Mozzarela - %d%n" +
                "Pepperoni - %d%n" +
                "Four Cheeses - %d%n" +
                "The favorite flavor is - %s",
                mozzarella,
                pepperoni,
                fourCheeses,
                favoriteFlavor);
    }
}
