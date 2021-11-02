package com.bridgelab;
import java.util.Random;


public class Cards {
    int arr[][] = new int[4][13];

    void CardCount(int player_count) {
        for (int card_count = 0; card_count < 9; card_count++) {
            throwCard(player_count);
        }
    }

    void throwCard(int player_count) {
        //taking random number using random method
        Random r = new Random();
        int suit = r.nextInt(4);
        int ranks = r.nextInt(13);
        if (arr[suit][ranks] != 0) {
            throwCard(player_count);
        } else {
            arr[suit][ranks] = player_count;
        }
    }

    void displayCard(int player_count) {
        for (int suit = 0; suit < 4; suit++) {
            for (int ranks = 0; ranks < 13; ranks++) {
                if (arr[suit][ranks] == player_count) {
                    System.out.println(suitGet(suit) + "" + rankGet(ranks));
                }
            }
        }
    }

    String suitGet(int i) {
        for (i = 1; i <= 4; i++) {
            if (i == 1) {
                System.out.println("Clubs");
            } else if (i == 2) {
                System.out.println("Diamonds");
            } else if (i == 3) {
                System.out.println("Heart");
            } else
                System.out.println("Spades");
        }
    }

    String rankGet(int j) {
        for (j = 1; j <= 13; j++) {
            if (j == 1) {
                System.out.println("2");
            } else
                System.out.println("3");
        }
    }
}

//"2", "3", "4", "5", "6", "7", "8", "9", "10", "jack", "queen", "king", "ace"


